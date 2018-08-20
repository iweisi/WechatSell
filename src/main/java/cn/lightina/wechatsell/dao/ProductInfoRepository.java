package cn.lightina.wechatsell.dao;

import cn.lightina.wechatsell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
public interface ProductInfoRepository extends JpaRepository
<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
