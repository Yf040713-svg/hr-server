package com.yf.hr.hrserver.config;

import com.yf.hr.hrserver.util.TimeUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CommonConfig {

    @Bean
    public TimeUtil timeUtil() {
        return new TimeUtil();
    }
}
