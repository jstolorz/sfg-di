package com.bluesoft.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("bluesoft")
@Configuration
public class SfgConfiguration {

    private String username;
    private String password;
    private String jdbcurl;

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(final String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }

    @Override
    public String toString() {
        return "SfgConfiguration{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jdbcurl='" + jdbcurl + '\'' +
                '}';
    }
}
