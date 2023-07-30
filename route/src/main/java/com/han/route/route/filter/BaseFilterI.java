package com.han.route.route.filter;

import com.han.allcommom.ret.Response;
import com.han.model.base.request.Request;
import com.han.route.route.dto.Content;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/29 01:45
 **/
public interface BaseFilterI {

     Response doFilter(Request request, Content content, BaseFilterI nextFilterI);

     default int order(){
          return 1;
     }
}
