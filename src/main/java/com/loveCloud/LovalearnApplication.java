package com.loveCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "com.loveCloud")
public class LovalearnApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LovalearnApplication.class, args);
	}

}
