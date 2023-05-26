package ru.maksim.pr_10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.maksim.pr_10.components.Junior;
import ru.maksim.pr_10.components.Middle;
import ru.maksim.pr_10.components.Senior;
import ru.maksim.pr_10.interfaces.Programmer;

@Configuration
public class BeanConfig {

    @Bean(name = "junior")
    public Programmer junior() {
        return new Junior();
    }

    @Bean(name = "middle")
    public Programmer middle(){
        return new Middle();
    }

    @Bean(name = "senior")
    public Programmer senior(){
        return new Senior();
    }
}