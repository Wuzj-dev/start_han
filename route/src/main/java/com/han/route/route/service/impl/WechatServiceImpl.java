package com.han.route.route.service.impl;

import com.han.allcommom.util.UUIDUtil;
import com.han.modelwechat.dto.WxMpTemplateMessage;
import com.han.modelwechat.dto.request.WxChatMsgSendReq;
import com.han.modelwechat.dto.request.WxChatTemplateDataReq;
import com.han.route.route.facade.UserInfoFacade;
import com.han.route.route.manage.WxChatManager;
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

    WxChatManager wxChatManager;

    @Override
    public String sendMsg(WxChatMsgSendReq wxChatMsgSendReq, WxMpTemplateMessage wxMpTemplateMessage) {
        WxChatTemplateDataReq wxChatTemplateDataReq = wxChatMsgSendReq.wxChatTemplateDataReq;
        String toUserId = wxChatMsgSendReq.getToUserId();
        String wxOpenIdByUserId = userInfoFacade.getWxOpenIdByUserId(toUserId);

        WxMpTemplateMessage wxTemplate
                = wxChatManager.builder(wxOpenIdByUserId, wxChatTemplateDataReq.replaceTemplateData, wxMpTemplateMessage);
        String wxTemplateUUID = UUIDUtil.getWxTemplateUUID();
        return wxTemplateUUID;
    }
}
