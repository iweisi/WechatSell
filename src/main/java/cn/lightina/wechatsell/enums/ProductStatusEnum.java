package cn.lightina.wechatsell.enums;

import lombok.Getter;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
@Getter
public enum ProductStatusEnum {
    UP(0,"在售"),
    DOWN(1,"下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
