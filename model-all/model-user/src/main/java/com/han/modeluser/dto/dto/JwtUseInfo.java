package com.han.modeluser.dto.dto;

import lombok.Data;

/**
 * @Author: Wuj
 * @Description: JWT 保存的user信息
 * @DateTime: 2023/7/23 15:29
 **/
@Data
public class JwtUseInfo {

    private String userId;

    /**
     *
     */
    private String account;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 图片
     */
    private String icon;

    /**
     * 手机号
     */
    private String phoneNumber;

    private String email;

    /**
     * 微信 OPENID
     */
    private String weChatOpenId;

}
