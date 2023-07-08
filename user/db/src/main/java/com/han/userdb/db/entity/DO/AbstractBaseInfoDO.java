package com.han.userdb.db.entity.DO;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/4/30 22:58
 **/
public abstract class AbstractBaseInfoDO implements Serializable {

    private Timestamp createTime;

    private Timestamp updateTime;

}
