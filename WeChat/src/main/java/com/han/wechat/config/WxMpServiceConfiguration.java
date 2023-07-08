package com.han.wechat.config;

import com.han.wechat.properties.WxMapProperties;
import lombok.AllArgsConstructor;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: Wuj
 * @Description: 微信公众号 配置文件
 * @DateTime: 2023/7/9 00:36
 **/
@AllArgsConstructor
@Configuration
public class WxMpServiceConfiguration {

    WxMapProperties wxMapProperties;


    @Bean
    public WxMpService wxMpService() {

        WxMpDefaultConfigImpl configStorage = new WxMpDefaultConfigImpl();
        configStorage.setAppId(wxMapProperties.getAppId());
        configStorage.setSecret(wxMapProperties.getSecret());
        configStorage.setToken(wxMapProperties.getToken());
        configStorage.setAesKey(wxMapProperties.getAesKey());

        WxMpService service = new WxMpServiceImpl();
        service.setWxMpConfigStorage(configStorage);
        return service;

    }
}
