package cn.lightina.wechatsell.util;

import cn.lightina.wechatsell.VO.ResultVO;

/**
 * @Author jacklightChen
 * @Email 1797079433@qq.com
 * @createTime 2018/8/21
 * @proverb please find the joy in your life
 **/
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("请求成功");
        return resultVO;
    }
}
