package com.feng.controller;

/**
 * Created by 刘亚飞 on 2017/6/27.
 */

import com.feng.common.LocalMessageSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
public class HelloController {

    @Autowired
    private MessageSource message;
    // @Autowired
    @Resource
    private LocalMessageSourceService localMessageSourceService;

    @RequestMapping("/hello")
    public String hello() {

        //代码中获取国际化
        Locale locale = LocaleContextHolder.getLocale();
        String mes = message.getMessage("welcome", null, locale);
        System.out.println(mes);

        //自定义MessageSource
        String mes1 = localMessageSourceService.getMessage("welcome");
        System.out.println(mes1);

        return "/hello";
    }

    //针对session的区域解释器，只对会话生效，会话失效后，回复默认的locale
    //@RequestMapping("/changeSessionLanauage")
    public String changeSessionLanauage(HttpServletRequest request, String lang){
        System.out.println(lang);

        if("zh".equals(lang)){
            //代码中即可通过以下方法进行语言设置
            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale("zh", "CN"));
        }else if("en".equals(lang)){
            //代码中即可通过以下方法进行语言设置
            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale("en", "US"));
        }
        return "redirect:/hello";
    }


    //同时对cookie和session生效
    @RequestMapping("/changeSessionLanauage")
    public String changeLanauage(HttpServletRequest request, HttpServletResponse response, String lang){

        System.out.println(lang);

        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);

        if("zh".equals(lang)){
            //代码中即可通过以下方法进行语言设置
            localeResolver.setLocale(request,response,new Locale("zh","CN"));
        }else if("en".equals(lang)){
            //代码中即可通过以下方法进行语言设置
            localeResolver.setLocale(request,response,new Locale("en","US"));
        }
        return "redirect:/hello";
    }
}
