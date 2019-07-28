package com.tw.batch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("importProduct")
@Service
public class importProduct {

    @Value("${import.product.file.path}")
    String path;

    @Bean
    public void execute(){
        System.out.println(path);
    }
}
