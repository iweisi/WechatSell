package cn.lightina.wechatsell.service.impl;

import cn.lightina.wechatsell.dao.ProductCategoryRepository;
import cn.lightina.wechatsell.dataobject.ProductCategory;
import cn.lightina.wechatsell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory getOne(Integer categoryId) {
        return repository.getOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
