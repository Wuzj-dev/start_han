package com.han.modelwechat.dto.request;

import java.util.Map;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/8/13 00:44
 **/
public interface TemplateDataReqI {


    String templateId();


    Map<String, Map<String,String>> replaceTemplateData();


}
