package com.xing.uni.config;

import com.xing.uni.interceptor.SysInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE","OPTIONS")
                .maxAge(3600);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/imags/swiper/**").addResourceLocations("file:D:\\image\\swiperImage\\");
        registry.addResourceHandler("/imags/nav/**").addResourceLocations("file:D:\\image\\navImage\\");
        registry.addResourceHandler("/imags/product/**").addResourceLocations("file:D:\\image\\productImage\\");
        registry.addResourceHandler("/imags/productSwiperImage/**").addResourceLocations("file:D:\\image\\productSwiperImage\\");

    }
//    @Bean
//    public SysInterceptor sysInterceptor(){
//        return new SysInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        String[] patterns=new String[]{"/adminLogin","/product/**","/nav/**","/user/wxlogin","/weixinpay/**"};
//        registry.addInterceptor(sysInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns(patterns);
//    }
}