package com.feng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * Created by 刘亚飞 on 2017/6/27.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }


    //FixedLocaleResolver:一直使用固定的Local, 改变Local 是不支持的
    //CookieLocaleResolver:针对的cookie
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        //设置默认区域
        //问题：(此处设置为Locale.ENGLISH时候，默认仍然为中文，ENGLISH时候为‘("en","")’)
        //解决：因为当时没有配置文件“messages_en.properties”，添加后成功
        slr.setDefaultLocale(Locale.ENGLISH);
        return slr;
    }
}
