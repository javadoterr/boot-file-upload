package com.javadoterr.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class CommonConfigFile {
	
	@Bean
	public CommonsMultipartResolver getCommonsMultipartResolver() {
		return new CommonsMultipartResolver();
	}

}
