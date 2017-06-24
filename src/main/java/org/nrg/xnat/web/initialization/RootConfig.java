package org.nrg.xnat.web.initialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"org.nrg.xnat.web.controllers"})
public class RootConfig {
    @Bean
    public ViewResolver viewResolver() {
        return new InternalResourceViewResolver() {{
            setPrefix("WEB-INF/pages/");
            setSuffix(".jsp");
        }};
    }
}
