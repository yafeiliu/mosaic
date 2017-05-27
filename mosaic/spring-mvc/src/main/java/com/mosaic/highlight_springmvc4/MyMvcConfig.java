package com.mosaic.highlight_springmvc4;

import com.mosaic.highlight_springmvc4.messageconverter.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created by 刘亚飞 on 2017/5/27.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.mosaic.highlight_springmvc4")
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public MyMessageConverter converter(){
        return new MyMessageConverter();
    }

    //静态资源映射
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/cLasses/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/converter").setViewName("/converter");
    registry.addViewController("/index").setViewName("/index");
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
    converters.add(converter());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets");
    }
}
