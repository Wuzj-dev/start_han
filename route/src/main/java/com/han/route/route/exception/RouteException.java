package com.han.route.route.exception;

import com.han.allcommom.enums.EnumI;
import com.han.allcommom.exception.BaseException;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/30 21:32
 **/
public class RouteException extends BaseException {


    public RouteException(EnumI e) {
        super(e);
    }

    public RouteException(String code, String errMsg) {
        super(code, errMsg);
    }

    public RouteException(String code, String errMsg, Throwable cause) {
        super(code, errMsg, cause);
    }
}
