package com.tong.sell.utils;

import com.tong.sell.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object obj){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(obj);
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        return resultVO;
    }


    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }
}
