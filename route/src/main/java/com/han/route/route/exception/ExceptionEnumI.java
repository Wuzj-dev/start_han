package com.han.route.route.exception;

import com.han.allcommom.enums.EnumI;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/30 21:39
 **/

@AllArgsConstructor
public enum ExceptionEnumI implements EnumI {

    NO_TEMPLATE("2001", "该模板不存在"),
    NO_MSG_TYPE("2002", "消息类型不存在");

    public final String code;

    public final String desc;

    @Override
    public String code() {
        return code;
    }

    @Override
    public String desc() {
        return desc;
    }
}
