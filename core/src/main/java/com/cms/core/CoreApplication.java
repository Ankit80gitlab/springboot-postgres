package com.cms.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.cms.core.repository")
@EnableTransactionManagement(proxyTargetClass = true)
@ComponentScan
@Configuration
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
