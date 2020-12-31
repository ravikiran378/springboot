package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;  
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication
@EnableAutoConfiguration
@Configuration
//@EnableWebMvc
@ComponentScan
@EnableScheduling
/*This is the initializer*/
public class Application {

    public static void main(String[] args) {
    	//System.setProperty("server.servlet.context-path", "/ravi");
    	ConfigurableApplicationContext cac = SpringApplication.run(Application.class, args);
    	for(String beanName:cac.getBeanFactory().getBeanDefinitionNames()) {
    		System.out.println("Loaded Bean :: "+ beanName);
    	}
    }
    
    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
      webServerFactoryCustomizer() {
        return factory -> factory.setContextPath("/ravi2");
    }
    
}
