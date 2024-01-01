package com.springcore.removexml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.removexml")
public class JavaConfig {
	
	@Value("#{45+78}")
	private int rest;
	
	@Bean(name = {"maddy","caddy","Daddy"})
	public Server system() {
		Server server = new Server();
		return server;
	}
	
//	@Bean
//	public River riv() {
//		
//		return new River();
//		
//	}
	
	
	

}
