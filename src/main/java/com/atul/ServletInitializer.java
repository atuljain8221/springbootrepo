package com.atul;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import com.c1.eproc.config.security.EProcSecurityConfigurerAdapter;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//application.sources(EProcSecurityConfigurerAdapter.class);
		return application.sources(EProcWebMvcConfigurerAdapter.class);
	}

}