package com.pde.disk.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix="spring.datasource")
public class ApplicationConfig {

    private String url;
    private String username;
    private String password;

    @Bean
    public DataSource getDataSource() {
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        return null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
