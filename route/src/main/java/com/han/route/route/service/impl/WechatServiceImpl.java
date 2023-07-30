package com.han.route.route.service.impl;

import com.han.modelwechat.dto.request.WxChatMsgSendReq;
import com.han.route.route.facade.UserInfoFacade;
import com.han.route.route.service.WechatService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/28 22:22
 **/

@AllArgsConstructor
@Service
public class WechatServiceImpl implements WechatService {

    UserInfoFacade userInfoFacade;

    @Override
    public String sendMsg(WxChatMsgSendReq wxChatMsgSendReq) {

        return "";
    }
}
