package com.han.route.route.filter.check;

import com.han.allcommom.enums.MsgTypeEnum;
import com.han.modelwechat.dto.TemplateMsgI;
import com.han.route.route.facade.WxTemplateFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @Author: Wuj
 * @Description:校验模版是否存在
 * @DateTime: 2023/7/30 14:25
 **/
@Component
@Slf4j
@AllArgsConstructor
public class CheckTemplate {

    WxTemplateFacade wxTemplateFacade;


    /**
     * 校验模版是否存在
     *
     * @param templateId  消息模版ID
     * @param appId       应用Id
     * @param msgTypeEnum 消息类型
     * @return TemplateMsgI 可直接发送消息体
     */
    public TemplateMsgI checkTemplate(String appId, String templateId, MsgTypeEnum msgTypeEnum) {
        if (Objects.equals(MsgTypeEnum.WX_CHAT_,msgTypeEnum)){
            return this.getWxTemplateMsg(appId, templateId);
        }

        throw new Exception()
    }

    public TemplateMsgI getWxTemplateMsg(String appId, String templateId){

    }


}
