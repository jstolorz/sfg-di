package com.bluesoft.sfgdi.config;

import com.bluesoft.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
public class GreetingServiceConfiguration {

    @Bean
    FakeDataSource fakeDataSource(
            @Value("${bluesoft.username}") String username,
            @Value("${bluesoft.password}") String password,
            @Value("${bluesoft.jdbcurl}") String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

}
