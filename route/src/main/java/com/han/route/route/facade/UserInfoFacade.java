package com.han.route.route.facade;

import org.springframework.stereotype.Component;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/28 22:36
 **/
@Component
public class UserInfoFacade {


    /**
     * 通过UserId 获取OpenId
     * @param userId the userId
     * @return
     */
    public String getWxOpenIdByUserId(String userId){

        return "";
    }

    /**
     * userId 获取手机号
     * @param userId the userId
     * @return the String
     */
    public String getPhoneByUserId(String userId){
        return "";
    }
}
