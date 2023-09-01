package com.han.modeluser.dto.dto.dto;

import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/8/27 00:16
 **/
@Data
public class UserIdInfoDTO {

    /**
     * user--> openIds
     */
    public Map<String,String> userIdMap;


    /**
     * userId 为查询到相关信息
     */
    public Set<String> noIdInfos;

}
