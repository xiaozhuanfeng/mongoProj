package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/example1")
    private String example1(HttpServletRequest request, Map<String, Object> map) {

        //.....省略
        //1、代码中获取国际化信息
        Locale locale = LocaleContextHolder.getLocale();
        //2、从Session中获取语言环境
        //locale = (Locale)req.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        //System.out.println("当前语言环境："+locale.getLanguage());
        map.put("lang",locale.getLanguage());

        return "web_demo1";
    }
}
