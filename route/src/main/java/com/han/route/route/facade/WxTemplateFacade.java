package com.han.route.route.facade;

import com.han.modelwechat.dto.WxMpTemplateMessage;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/29 14:47
 **/
@Component
public class WxTemplateFacade {


    public WxMpTemplateMessage getWxMpTemplateMessage(String appId, String  templateId){


        return new WxMpTemplateMessage();



    }

}
