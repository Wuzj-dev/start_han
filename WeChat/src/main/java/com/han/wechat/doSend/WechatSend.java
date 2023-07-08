package com.han.wechat.doSend;

import lombok.AllArgsConstructor;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/9 00:29
 **/
@AllArgsConstructor
@Component
@DependsOn("wxMpServiceConfiguration")
public class WechatSend {
    WxMpService wxMpService;
    @PostConstruct
    public void cesjio(){
        send("oaJFh5x8gqeau-i-Wq9qbob1Y3eo","Hg_Vz3OIc1Z-tBPDJwRCGipnyNz1OaEGPcjOmL1J4qY");
    }

    public void send(String openId,String templateId) {
        WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
                .toUser(openId)
                .templateId(templateId)
                .url("")
                .build();

        templateMessage.addData(new WxMpTemplateData("keyword1", "value1"));
        templateMessage.addData(new WxMpTemplateData("keyword2", "value1"));
        templateMessage.addData(new WxMpTemplateData("remark", "value1"));

        try {
            String s = wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
            System.out.println(s);
        }catch (Exception e) {
            System.out.println("err");
        }
    }


}
