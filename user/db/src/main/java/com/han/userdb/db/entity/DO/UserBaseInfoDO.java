package com.han.userdb.db.entity.DO;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/4/30 22:56
 **/
public class UserBaseInfoDO extends AbstractBaseInfoDO {

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
     * 手机号
     */
    private String phoneNumber;

    private String email;

    /**
     * 登陆密码
     *      手机号登陆：
     *       密码登陆：
     */
    private String password;


}
