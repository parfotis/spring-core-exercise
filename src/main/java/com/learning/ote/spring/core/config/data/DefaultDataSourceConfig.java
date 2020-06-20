package com.learning.ote.spring.core.config.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DefaultDataSourceConfig implements DataConfig {

    @Bean
    public DataSource dataSource() {
        System.out.println("Inside Development Datasource Bean Configuration");

        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                //.addScript("classpath:com/bank/config/sql/schema.sql")
                .build();
    }

}
