package com.han.modelwechat.dto.request;

import com.han.allcommom.enums.MsgTypeEnum;
import com.han.model.base.request.Request;
import com.han.model.base.util.GsonUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/28 22:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateMsgSendReq implements TemplateMsgSendReqI{

   /**
    * userId
    */
   public String toUserId;

   public MsgTypeEnum msgType;

   public TemplateDataReqI templateDataReqI;


   @Override
   public String toUserId() {
      return toUserId;
   }

   @Override
   public MsgTypeEnum msgTypeEnum() {
      return msgType;
   }

   @Override
   public TemplateDataReqI templateDataReqI() {
      return templateDataReqI;
   }
}
