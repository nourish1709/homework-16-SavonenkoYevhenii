package main;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
public class MyAutoconfiguration {
    public MyAutoconfiguration() {
        System.out.println("\n\t[...autoconfiguration with condition on class \"ConfigurationEnabler.java\" enabled...]");
    }

    @Bean
    @ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
    public void testProperty() {
        System.out.println("\t[...autoconfiguration with condition on property \"custom.configuration.enable\" with value \"true\" enabled...]\n");
    }
}
