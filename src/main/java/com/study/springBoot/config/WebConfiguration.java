package com.study.springBoot.config;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.springBoot.filter.MyFilter;

@Configuration
public class WebConfiguration {

	 @Bean
	    public RemoteIpFilter remoteIpFilter() {
	        return new RemoteIpFilter();
	    }
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	    public FilterRegistrationBean testFilterRegistration() {

	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new MyFilter());
	        registration.addUrlPatterns("/*");
	        registration.addInitParameter("paramName", "paramValue");
	        registration.setName("MyFilter");
	        registration.setOrder(1);
	        return registration;
	    }

}
