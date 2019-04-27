package com.floatCloud.loveLearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.floatCloud.loveLearn.dao")
public class LoveLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveLearnApplication.class, args);
	}

}
