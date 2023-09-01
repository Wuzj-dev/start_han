package com.han.template;

import com.han.allcommom.muis.facade.FacadeI;
import com.han.model.base.TemplateInfoDTO;
import lombok.AllArgsConstructor;

import java.util.Set;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/8/27 01:59
 **/
@AllArgsConstructor
public class WechatTemplateFacade implements FacadeI {


     public TemplateInfoDTO templateInfo(Set<String> templateIds){

          return new TemplateInfoDTO();
     }







}
