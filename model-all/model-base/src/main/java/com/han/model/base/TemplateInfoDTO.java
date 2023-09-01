package com.han.model.base;

import com.han.allcommom.baseInfo.TemplateMsgI;
import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/8/27 02:04
 **/
@Data
public class TemplateInfoDTO {


    public Map<String, TemplateMsgI> templateMsgIMapI;

    public Set<String> noTemplate;

}
