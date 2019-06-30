package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
@Controller
public class I18nController {

    @RequestMapping(value = "changeLanguage1")
    public String changeLan1(HttpServletRequest req, String lang) {

        if ("en".equals(lang)) {
            req.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        } else {
            req.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }
        return "redirect:/demo/example1";
    }

    @RequestMapping(value = "changeLanguage2")
    public String changeLan2(HttpServletRequest req, String lang) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(req);
        if ("en".equals(lang)) {
            localeResolver.setLocale(req, null, Locale.US);
        } else {
            localeResolver.setLocale(req, null, Locale.CHINA);
        }
        return "redirect:/demo/example1";
    }
}
