package com.gss.core.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration extends SpringBootServletInitializer{

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx=	SpringApplication.run(ApplicationConfiguration.class, args);
		
		ctx.getBean(DownloadUserPrimaryAddress.class).download();
		
		
		SpringApplication.exit(ctx, () -> 0);

		return ;

	}


}
