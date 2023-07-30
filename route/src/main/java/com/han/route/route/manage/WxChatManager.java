package com.han.route.route.manage;

import com.han.modelwechat.dto.WxMpTemplateData;
import com.han.modelwechat.dto.WxMpTemplateMessage;
import com.han.modelwechat.dto.request.WxChatMsgSendReq;
import com.han.modelwechat.dto.request.WxChatTemplateDataReq;
import com.han.route.route.facade.UserInfoFacade;
import com.han.route.route.facade.WxTemplateFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/29 14:50
 **/
@AllArgsConstructor
@Component
public class WxChatManager {

    WxTemplateFacade wxTemplateFacade;

    UserInfoFacade userInfoFacade;


    /**
     * 构建 发送模板消息的模板体
     *
     * @param openId           openId
     * @param wxChatMsgSendReq wxChatMsgSendReq
     * @return the  WxMpTemplateMessage
     */
//    public WxMpTemplateMessage builder(String openId, WxChatMsgSendReq wxChatMsgSendReq) {
//        WxChatTemplateDataReq wxChatTemplateDataReq = wxChatMsgSendReq.wxChatTemplateDataReq;
//        WxMpTemplateMessage wxMpTemplateMessage
//                = wxTemplateFacade.getWxMpTemplateMessage(wxChatMsgSendReq.appId, wxChatTemplateDataReq.templateId);
//        List<WxMpTemplateData> data = wxMpTemplateMessage.getData();
//        String wxOpenIdByUserId = userInfoFacade.getWxOpenIdByUserId(wxChatMsgSendReq.toUserId);
//        Map<String, Map<String, String>> replaceTemplateData = wxChatTemplateDataReq.getReplaceTemplateData();
//
//        wxMpTemplateMessage.setToUser(wxOpenIdByUserId);
//        wxMpTemplateMessage.setToUser(openId);
//        wxMpTemplateMessage.setTemplateId(wxChatTemplateDataReq.getTemplateId());
//        wxMpTemplateMessage.setMiniProgram(wxChatTemplateDataReq.getMiniProgram());
//
//        if (!CollectionUtils.isEmpty(data)) {
//            data.forEach(t -> {
//                String name = t.getName();
//                Map<String, String> stringStringMap = replaceTemplateData.get(name);
//
//                t.setValue(stringStringMap.get("value"));
//                t.setColor(stringStringMap.get("color"));
//            });
//        }
//        return wxMpTemplateMessage;
//    }


    public WxMpTemplateMessage builder(String openId,Map<String, Map<String, String>> replaceTemplateData, WxMpTemplateMessage wxMpTemplateMessage) {
        List<WxMpTemplateData> data = wxMpTemplateMessage.getData();
        wxMpTemplateMessage.setToUser(openId);

        if (!CollectionUtils.isEmpty(data)) {
            data.forEach(t -> {
                String name = t.getName();
                Map<String, String> stringStringMap = replaceTemplateData.get(name);

                t.setValue(stringStringMap.get("value"));
                t.setColor(stringStringMap.get("color"));
            });
        }
        return wxMpTemplateMessage;
    }


}
