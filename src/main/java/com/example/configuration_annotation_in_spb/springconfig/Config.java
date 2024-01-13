package com.example.configuration_annotation_in_spb.springconfig;

import com.example.configuration_annotation_in_spb.service.LowerCaseWordsService;
import com.example.configuration_annotation_in_spb.service.PunctuationService;
import com.example.configuration_annotation_in_spb.service.UpperCaseWordsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Component
//@Configuration(proxyBeanMethods = false)
@Configuration(enforceUniqueMethods = false)
//@Configuration
public class Config {
    @Bean
    public LowerCaseWordsService lowerCase(){
        return new LowerCaseWordsService(punctuationService());
    }
    @Bean
    public UpperCaseWordsService upperCase(){
        return new UpperCaseWordsService(punctuationService());
    }
   @Bean
    public PunctuationService punctuationService(){
        return new PunctuationService();
    }
    @Bean
    public UpperCaseWordsService upperCase(String dummy){
        return new UpperCaseWordsService(punctuationService());
    }
    // https://youlearncode.com/configuration-in-spring-boot/
}
