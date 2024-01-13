package com.example.configuration_annotation_in_spb;

import com.example.configuration_annotation_in_spb.service.LowerCaseWordsService;
import com.example.configuration_annotation_in_spb.service.UpperCaseWordsService;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.internal.Logger;

@SpringBootApplication
public class ConfigurationAnnotationInSpbApplication {
//private Logger log= (Logger) LoggerFactory.getLogger(ConfigurationAnnotationInSpbApplication.class);
    public static void main(String[] args) {
      var context=  SpringApplication.run(ConfigurationAnnotationInSpbApplication.class, args);

   var lowerCaseBean=(LowerCaseWordsService) context.getBean("lowerCase");
        var upperCaseBean=(UpperCaseWordsService) context.getBean("upperCase");
        System.out.printf("Do both punctuation services point to the same object? %b",
                lowerCaseBean.getPunctuationService() == upperCaseBean.getPunctuationService()
                );

    }
//    What is @Configuration Annotation in Spring Boot
//    We use @Configuration in Spring Boot mainly to declare new beans
//    that will be included in the Spring Context.
//    We can inject these beans through @Autowired Annotation wherever we need them.
//    Furthermore, @Configuration tags this class as a bean in order to be
//    included in the Spring Context.

//    @Configuration has 3 attributes:

//    value, which allows you to specify the bean name.
//    proxyBeanMethods, which defaults to true.
//    Lastly, enforceUniqueMethods, which defaults to true.

}
