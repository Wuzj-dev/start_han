package com.han.modelwechat.dto.request;

import com.han.allcommom.enums.MsgTypeEnum;
import com.han.model.base.request.Request;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/8/13 00:43
 **/
public interface TemplateMsgSendReqI  extends Request {

    String toUserId();

    MsgTypeEnum msgTypeEnum();

    TemplateDataReqI templateDataReqI();

}
