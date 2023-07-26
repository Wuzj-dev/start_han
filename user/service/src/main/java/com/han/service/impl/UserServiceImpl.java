package com.han.service.impl;

import com.google.gson.annotations.SerializedName;
import com.han.service.convert.UserConvert;
import com.han.user.api.UserService;
import com.han.user.api.dto.UserDTO;
import com.han.userdb.db.entity.DO.UserBaseInfoDO;
import com.han.userdb.db.mapper.UserBaseInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Wuj
 * @DateTime: 2023/4/30 23:29
 **/
@Service
public class UserServiceImpl implements UserService {

    UserConvert userConvert = UserConvert.userConvert;

    @Resource
    UserBaseInfoMapper userBaseInfoMapper;

    @Override
    public UserDTO UserByPhone(String phoneNum) {
        UserBaseInfoDO userBaseInfoDO = userBaseInfoMapper.userBaseInfoByPhone(phoneNum);
        return userConvert.toUserDTO(userBaseInfoDO);
    }

    @Override
    public UserDTO UserByEmail(String email) {
        UserBaseInfoDO userBaseInfoDO = userBaseInfoMapper.userBaseInfoByEmail(email);
        return userConvert.toUserDTO(userBaseInfoDO);
    }

}
