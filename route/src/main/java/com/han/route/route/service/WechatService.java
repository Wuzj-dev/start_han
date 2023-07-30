package com.han.route.route.service;

import com.han.modelwechat.dto.WxMpTemplateMessage;
import com.han.modelwechat.dto.request.WxChatMsgSendReq;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/28 22:22
 **/
public interface WechatService {

    String sendMsg(WxChatMsgSendReq wxChatMsgSendReq, WxMpTemplateMessage wxMpTemplateMessage) ;



}
