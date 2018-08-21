package cn.lightina.wechatsell.controller;

import cn.lightina.wechatsell.VO.ProductInfoVO;
import cn.lightina.wechatsell.VO.ProductVO;
import cn.lightina.wechatsell.VO.ResultVO;
import cn.lightina.wechatsell.dataobject.ProductCategory;
import cn.lightina.wechatsell.dataobject.ProductInfo;
import cn.lightina.wechatsell.service.CategoryService;
import cn.lightina.wechatsell.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public ResultVO test(){
        /*所有上架商品*/
        List<ProductInfo>infoList=productService.findUpAll();

        List<Integer>tempList=infoList.stream().map(e->e.getCategoryType()).collect(Collectors.toList());

        List<ProductCategory>categoryList=categoryService.findByCategoryTypeIn(tempList);

        /*最后返回的数据*/
        List<ProductVO>resultList=new LinkedList<>();

        for(ProductCategory pc : categoryList){
            ProductVO pvo=new ProductVO();
            pvo.setCategoryName(pc.getCategoryName());
            pvo.setCategoryType(pc.getCategoryType());

            List<ProductInfoVO>infoVOList=new LinkedList<>();
            for(ProductInfo info : infoList){
                if(info.getCategoryType().equals(pc.getCategoryType())){
                    ProductInfoVO temp=new ProductInfoVO();
                    BeanUtils.copyProperties(info, temp);
                    infoVOList.add(temp);
                }
            }
            pvo.setProductInfoVOList(infoVOList);

            resultList.add(pvo);
        }

        ResultVO resultVO=new ResultVO();
        resultVO.setData(resultList);
        resultVO.setCode(0);
        resultVO.setMsg("return success");
        return resultVO;
    }
}
