package com.han.modelwechat.dto.request;

import com.han.model.base.request.Request;
import com.han.modelwechat.dto.WxMpTemplateMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/28 22:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxChatMsgSendReq implements Request {

   /**
    * 应用ID
    */
   public String appId;

   /**
    * userId
    */
   public String toUserId;

   public WxChatTemplateDataReq wxChatTemplateDataReq;

}
