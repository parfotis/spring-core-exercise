package com.learning.ote.spring.core.config.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Profile("prod")
public class ProdDataSourceConfig implements DataConfig {

    @Bean
    public DataSource dataSource() {
        System.out.println("Inside Production Datasource Bean Configuration");

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3308/ote-webapp-mysql");
        ds.setUsername("user");
        ds.setPassword("password");
        return ds;

    }
}
