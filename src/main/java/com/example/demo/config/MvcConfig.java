package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class MvcConfig {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Bean
    public LocaleResolver localeResolver() {
        log.info("SessionLocaleResolver is start....  ");
        //会话区域解析器也就是说，你设置完只针对当前的会话有效，session失效，还原为默认状态
        SessionLocaleResolver srl = new SessionLocaleResolver();
        //设置默认区域
        srl.setDefaultLocale(Locale.CHINA);
        return srl;
    }
}
