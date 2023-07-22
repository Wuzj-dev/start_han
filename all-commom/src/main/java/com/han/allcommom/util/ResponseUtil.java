package com.han.allcommom.util;

import com.han.allcommom.ret.Response;
import com.han.allcommom.ret.ResponseEnums;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author: Wuj
 * @Description: ResponseUtil
 * @DateTime: 2023/7/22 22:25
 **/
public class ResponseUtil {

    private static final Object nullObj = new Object();

    private ResponseUtil() {
        throw new IllegalStateException("Utility class");
    }

    // ===== success -=======
    public static Response response(String code , String msg, Object data){
         return new Response(code,msg,data);
    }

    public static Response success(){
        ResponseEnums success = ResponseEnums.SUCCESS;
        return response(success.code,success.msg,nullObj);
    }

    public static Response success(Object data){
        ResponseEnums success = ResponseEnums.SUCCESS;
        return response(success.code,success.msg,data);
    }


    public static Response err(ResponseEnums success){
        return response(success.code,success.msg,nullObj);
    }

    public static Response err(String code , String msg){
        return response(code,msg,nullObj);
    }
    

}
