package com.han.route.route.web;

import com.han.allcommom.ret.Response;
import com.han.modelwechat.dto.request.WxChatMsgSendReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/28 22:10
 **/
@RestController
@RequestMapping("weChatMessage")
public class WeChatMessageController {



    @PostMapping("send")
    public Response send(@RequestBody WxChatMsgSendReq wxChatMsgSendReq){

    }




}
