package com.han.allcommom.util;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/30 22:10
 **/
public class UUIDUtil {


    private static final String WXTEMPLAYE ="WXTEMPLAYE";


    public static String uuid(){
        return "";
    }


    public static String getWxTemplateUUID(){
        return WXTEMPLAYE+":"+uuid();
    }

}
