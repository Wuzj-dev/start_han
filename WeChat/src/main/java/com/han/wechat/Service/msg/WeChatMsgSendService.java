package com.han.wechat.Service.msg;

import com.han.allcommom.ret.Response;
import me.chanjar.weixin.common.error.WxErrorException;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/21 21:56
 **/
public interface WeChatMsgSendService {



    Response doSend(String jsonStr) throws WxErrorException;


}
