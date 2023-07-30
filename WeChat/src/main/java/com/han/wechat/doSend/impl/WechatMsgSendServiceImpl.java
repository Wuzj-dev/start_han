package com.han.wechat.doSend.impl;

import com.han.allcommom.ret.Response;
import com.han.allcommom.ret.ResponseEnums;
import com.han.allcommom.util.GsonUtil;
import com.han.allcommom.util.ResponseUtil;
import com.han.wechat.doSend.WeChatMsgSendService;
import lombok.AllArgsConstructor;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/21 21:57
 **/
@Component
@AllArgsConstructor
public class WechatMsgSendServiceImpl implements WeChatMsgSendService {

    WxMpService wxMpService;

    @Override
    public Response doSendWechatTemplateMsg(String jsonStr) {
        try {
            WxMpTemplateMessage wxMpTemplateMessage = GsonUtil.fromJson(jsonStr, WxMpTemplateMessage.class);
            String msgId = wxMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
            return ResponseUtil.success(msgId);
        } catch (Exception e) {
            if (e instanceof WxErrorException) {
                return ResponseUtil.err(ResponseEnums.WECHAT_SEND_ERR, ((WxErrorException) e).getError());
            }
            return ResponseUtil.err(ResponseEnums.WECHAT_SEND_ERR, e.getMessage());
        }

    }
}
