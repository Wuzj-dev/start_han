package com.han.allcommom.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/30 14:26
 **/
@AllArgsConstructor
public enum MsgTypeEnum implements EnumI{


    WX_CHAT_("WX_CHAT_","微信模版消息");



    public   final String code;
    public   final String desc;

    @Override
    public String code() {
        return code;
    }

    @Override
    public String desc() {
        return desc;
    }
}
