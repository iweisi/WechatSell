package cn.lightina.wechatsell.enums;

import lombok.Getter;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/21
 * @proverb please find the joy in your life
 **/
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String message;


    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
