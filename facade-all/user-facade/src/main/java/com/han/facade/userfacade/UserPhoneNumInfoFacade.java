package com.han.facade.userfacade;

import com.han.modeluser.dto.dto.dto.UserIdInfoDTO;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Set;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/8/27 00:22
 **/
@AllArgsConstructor
public class UserPhoneNumInfoFacade {


    /**
     * 通过 userId 获取手机号
     *
     * @param userIds the userIds
     * @return the UserIdInfoDTO
     */
    public UserIdInfoDTO openIds(Set<String> userIds) {

        return new UserIdInfoDTO();
    }


}
