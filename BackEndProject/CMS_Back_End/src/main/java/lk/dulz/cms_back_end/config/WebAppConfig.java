package lk.dulz.cms_back_end.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.dulz.cms_back_end")
@EnableWebMvc

public class WebAppConfig {
}
