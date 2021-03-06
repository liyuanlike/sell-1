package com.hk.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author 何康
 * @date 2018/8/14 12:12
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {

//    错误码
    private Integer code;

//    提示信息
    private String msg;

//    返回内容
    private T data;
}
