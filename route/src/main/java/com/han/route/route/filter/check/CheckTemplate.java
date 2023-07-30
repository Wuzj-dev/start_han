package com.han.route.route.filter.check;

import com.han.allcommom.enums.MsgTypeEnum;
import com.han.allcommom.muis.NameValue;
import com.han.allcommom.muis.logUtil.LoggUtil;
import com.han.modelwechat.dto.TemplateMsgI;
import com.han.modelwechat.dto.WxMpTemplateMessage;
import com.han.route.route.exception.ExceptionEnumI;
import com.han.route.route.exception.RouteException;
import com.han.route.route.facade.WxTemplateFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.Objects;

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
    public TemplateMsgI getTemplate(String appId, String templateId, MsgTypeEnum msgTypeEnum) {
        if (Objects.equals(MsgTypeEnum.WX_CHAT_,msgTypeEnum)){
            return this.getWxTemplateMsg(appId, templateId);
        }

        LoggUtil.warn(log, "checkTemplate()", NameValue.builder(ExceptionEnumI.NO_MSG_TYPE));
        throw new RouteException(ExceptionEnumI.NO_MSG_TYPE);
    }

    public WxMpTemplateMessage getWxTemplateMsg(String appId, String templateId){
        return wxTemplateFacade.getWxMpTemplateMessage(appId,templateId);
    }


}
