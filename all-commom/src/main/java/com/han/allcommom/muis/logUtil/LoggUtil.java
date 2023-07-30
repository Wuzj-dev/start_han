package com.han.allcommom.muis.logUtil;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.han.allcommom.muis.NameValue;
import com.han.allcommom.util.GsonUtil;
import org.slf4j.Logger;


/**
 * @Author: Wuj
 * @Description: 日志打印工具类
 * @DateTime: 2023/7/30 20:57
 **/
public class LoggUtil {


    public static void debug(Logger log, String content) {
        LoggUtil.print(log,"DEBUG",content,null);
    }

    public static void info(Logger log, String content) {
        LoggUtil.print(log,"INFO",content,null);
    }

    public static void err(Logger log, String content) {
        LoggUtil.print(log,"INFO",content,null);
    }

    public static void warn(Logger log, String content) {
        LoggUtil.print(log,"INFO",content,null);
    }

    public static void print(Logger log, String logType, String content, NameValue... nameValues){
        String nameValueStr = "";
        if (nameValues != null){
            nameValueStr = GsonUtil.toStr(nameValues);
        }
        nameValueStr = content + "| " + nameValueStr;

        if ("INFO".equals(logType)){
            log.info(nameValueStr);
        }
        else if ("DEBUG".equals(logType)){
            log.debug(nameValueStr);
        }
        else if ("ERR".equals(logType)){
            log.error(nameValueStr);
        }
        else if ("WARN".equals(logType)){
            log.warn(nameValueStr);
        }



    }





}
