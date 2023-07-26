package com.han.allcommom.ret;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/22 22:23
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response <T>{

    public static final int SOME_CONSTANT = 0;

    public String code;

    public String msg;

    public T data;

}
