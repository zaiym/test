package com.pde;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 启动类
 */
@SpringBootApplication
public class DiskmonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiskmonitorApplication.class, args);
	}

	@Value("${spring.datasource.url}")
	private String url;

	@Bean
	public String test(){
		System.out.print(url);
		return new String(url);
	}

	@Autowired
	private DataSource dataSource;

}
