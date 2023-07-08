package com.han.wechat.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/7/9 00:40
 **/
@Data
@Component
@ConfigurationProperties(prefix = "wx.mp")
public class WxMapProperties {
    /*
     * 设置微信公众号的appid
     */
    private String appId;
    /*
     * 设置微信公众号的app secret
     */
    private String secret;
    /*
     * 设置微信公众号的token
     */
    private String token;
    /*
     * 设置微信公众号的EncodingAESKey
     */
    private String aesKey;
}
