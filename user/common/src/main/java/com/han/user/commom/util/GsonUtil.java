package com.han.user.commom.util;

import com.google.gson.Gson;

/**
 * @Author: Wuj
 * @Description: Gson 工具类
 * @DateTime: 2023/4/30 22:49
 **/
public class GsonUtil {

    private static Gson gson(){
        return new Gson();
    }

    /**
     *  对象转Str
     * @param obj the obj
     * @return the String
     */
    public static String toStr(Object obj){
        return gson().toJson(obj);
    }

    /**
     * String 转 对象
     * @param gsonStr the gsonStr
     * @param t the t
     * @return the T
     */
    public static <T> T fromJson(String gsonStr, Class<T> t){
        Gson gson = gson();
        return gson.fromJson(gsonStr,t);
    }

}
