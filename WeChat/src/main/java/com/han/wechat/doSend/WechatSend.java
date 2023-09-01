package com.han.wechat.doSend;

import com.han.allcommom.util.GsonUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
                .url("https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index")
                .build();
        templateMessage.addData(new WxMpTemplateData("keyword1", "value1"));
        templateMessage.addData(new WxMpTemplateData("keyword2", "value1"));
        templateMessage.addData(new WxMpTemplateData("remark", "value1"));

        try {
            String s = wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
            log.info("magId",s);
        }catch (Exception e) {
            log.info("magId",e);
        }
    }

}
