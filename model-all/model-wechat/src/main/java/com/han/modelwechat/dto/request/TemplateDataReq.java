package com.han.modelwechat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/28 22:50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateDataReq implements TemplateDataReqI{

    /**
     * 模版Id
     */
    public String templateId;

    /**
     * 模版数据， 替换符号
     *  name->{value->color}
     */
    public Map<String,Map<String,String>> replaceTemplateData;

    @Override
    public String templateId() {
        return templateId;
    }

    @Override
    public Map<String, Map<String, String>> replaceTemplateData() {
        return replaceTemplateData;
    }
}
