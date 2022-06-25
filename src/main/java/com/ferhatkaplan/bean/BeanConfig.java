package com.ferhatkaplan.bean;

import com.ferhatkaplan.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
   @Bean
    public BeanDto beanDto(){
        BeanDto beanDto=BeanDto
                .builder()
                .beanId(OL)
                .beanName("Bean Name")
                .beanData("Bean Data")
                .build();
        return BeanDto;

    }
}
