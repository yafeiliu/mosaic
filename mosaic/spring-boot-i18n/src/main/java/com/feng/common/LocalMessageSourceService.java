package com.feng.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * 自定义MessageSource
 *
 * Created by 刘亚飞 on 2017/6/27.
 */
@Component
public class LocalMessageSourceService {

    @Autowired
    private MessageSource messageSource;

    public Locale getLocale(){
        return LocaleContextHolder.getLocale();
    }

    public String getMessage(String code){
        return getMessage(code,null);
    }

    public String getMessage(String code,Object[] args){
        return getMessage(code,args,"");
    }

    public String getMessage(String code, Object[] args,String defaultMessage){
        return messageSource.getMessage(code,args,defaultMessage,getLocale());
    }
}
