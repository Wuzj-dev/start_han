package com.han.allcommom.threadLocal;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Wuj
 * @Description: 调用者应用信息(appId);
 * @DateTime: 2023/7/30 14:33
 **/
public class SysThreadLocal {

    private static final ThreadLocal<InvockInfo> sysInvockInfo = new ThreadLocal<>();


    public static void setSysInfo(String appId){
        sysInvockInfo.set(new InvockInfo(appId));
    }

    public static String getSysAppId(){
        InvockInfo invockInfo = sysInvockInfo.get();
        if (invockInfo!= null){
           return invockInfo.getAppId();
        }
        return null;
    }

    public static void remove(){
        sysInvockInfo.remove();
    }


    @Data
    @AllArgsConstructor
    public static class InvockInfo{
        public String appId;


    }

}
