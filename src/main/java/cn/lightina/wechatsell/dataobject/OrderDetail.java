package cn.lightina.wechatsell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/21
 * @proverb please find the joy in your life
 **/
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;

    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;
}
