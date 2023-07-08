package com.han.service.convert;

import com.han.user.api.dto.UserDTO;
import com.han.userdb.db.entity.DO.UserBaseInfoDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Wuj
 * @Description: 转换工具类
 * @DateTime: 2023/4/30 23:35
 **/

@Mapper
public interface UserConvert {

    public static UserConvert userConvert =  Mappers.getMapper(UserConvert.class);

    UserDTO toUserDTO(UserBaseInfoDO userBaseInfoDO);


}
