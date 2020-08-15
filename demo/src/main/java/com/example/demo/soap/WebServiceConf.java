package com.example.demo.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

//Enable Spring web service 
@EnableWs

//Spring Configuration

@Configuration
public class WebServiceConf {
	//MessageDispatcherServlet
		// ApplicationContext
	//url -> /ws/*
	
	
	@Bean 
	ServletRegistrationBean messageDispatcherServelet(ApplicationContext context) {
		MessageDispatcherServlet  messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
		
	}
	

}
