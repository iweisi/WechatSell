package cn.lightina.wechatsell.VO;

import lombok.Data;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/20
 * @proverb please find the joy in your life
 **/
@Data
public class ResultVO<T> {
    /*wrong code*/
    private Integer code;

    private String msg;

    private T data;
}
