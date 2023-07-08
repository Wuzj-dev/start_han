package com.han.userdb.db.mapper;

import com.han.userdb.db.entity.DO.UserBaseInfoDO;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/4/30 23:31
 **/

public interface UserBaseInfoMapper {

    UserBaseInfoDO userBaseInfoByPhone(String phoneNumber);

    UserBaseInfoDO userBaseInfoByEmail(String email);



}
