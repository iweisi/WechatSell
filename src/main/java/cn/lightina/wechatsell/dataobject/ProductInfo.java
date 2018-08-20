package cn.lightina.wechatsell.dataobject;

import cn.lightina.wechatsell.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**名字.*/
    private String productName;

    /**单价.*/
    private BigDecimal productPrice;

    /**库存.*/
    private Integer productStock;

    /**描述.*/
    private String productDescription;

    /** 小图.*/
    private String productIcon;

    /** 状态, 0正常1下架.*/
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /**类目编号.*/
    private Integer categoryType;

    /** 创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

}
