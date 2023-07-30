package com.han.allcommom.exception;

import com.han.allcommom.enums.EnumI;

import javax.xml.soap.SAAJResult;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/30 21:32
 **/
public class BaseException extends RuntimeException implements ExceptionI{

    String code;

    public BaseException(EnumI e){
        this(e.code(), e.desc());
    }

    public BaseException(String code, String errMsg){
        this(code,errMsg,null);
    }

    public BaseException(String code, String errMsg, Throwable cause){

        super(errMsg,cause);
        this.code = code;
    }





    @Override
    public String code() {
        return code;
    }

    @Override
    public String msg() {
        return super.getMessage();
    }
}
