package com.book.secondhandsbook.config;

import com.book.secondhandsbook.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hxq
 * @date 2022/3/20
 */
@Configuration
public class webConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")  //   /** 所有请求都会被拦截，包括静态资源
                .excludePathPatterns("/", "/doLogin", "/user/register", "/user/doRegister", "/css/**", "/fonts/**", "/images/**", "/js/**");//放行的请求
    }
}
