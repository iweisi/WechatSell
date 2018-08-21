package cn.lightina.wechatsell.enums;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/21
 * @proverb please find the joy in your life
 **/
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
