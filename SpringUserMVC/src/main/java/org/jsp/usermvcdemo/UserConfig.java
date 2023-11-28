package org.jsp.usermvcdemo;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.usermvcdemo")
public class UserConfig {
	
	@Bean
	public EntityManager getMEntityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();	
	}

}
