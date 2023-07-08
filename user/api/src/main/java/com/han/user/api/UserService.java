package com.han.user.api;

import com.han.user.api.dto.UserDTO;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/4/30 23:16
 **/
public interface UserService {

    UserDTO UserByPhone(String phoneNum);

    UserDTO UserByEmail(String email);




}
