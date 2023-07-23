package com.han.wechat.doSend;

import com.han.allcommom.ret.Response;
import me.chanjar.weixin.common.error.WxErrorException;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/21 21:56
 **/
public interface WeChatMsgSendService {


    /**
     * 发送微信模版消息
     *
     * @param jsonStr
     * @return Response ：WxMpTemplateMessage JSON Str
     * true: date == msgId
     * false: 发送错误消息
     */
    Response doSendWechatTemplateMsg(String jsonStr);


}
