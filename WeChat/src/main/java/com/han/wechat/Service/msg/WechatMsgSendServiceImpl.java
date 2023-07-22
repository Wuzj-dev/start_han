package com.han.wechat.Service.msg;

import com.han.allcommom.util.GsonUtil;
import com.han.wechat.doSend.WechatSend;
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
    public String doSend(String jsonStr) throws WxErrorException {
        WxMpTemplateMessage wxMpTemplateMessage = GsonUtil.fromJson(jsonStr, WxMpTemplateMessage.class);
        return wxMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
    }
}
