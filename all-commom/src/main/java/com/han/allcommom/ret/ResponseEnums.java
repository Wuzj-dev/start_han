package com.han.allcommom.ret;

import lombok.AllArgsConstructor;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/22 22:28
 **/
@AllArgsConstructor
public enum ResponseEnums {

    SUCCESS("200","success"),
    COMMON_ERR("1001","通用错误"),
    WECHAT_SEND_ERR("2012","微信发送错误");

    public final String code;

    public final String msg;
}
