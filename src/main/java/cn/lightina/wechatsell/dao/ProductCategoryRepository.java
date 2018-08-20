package cn.lightina.wechatsell.dao;

import cn.lightina.wechatsell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
    List<ProductCategory>findByCategoryTypeIn(List<Integer> typeList);
}
