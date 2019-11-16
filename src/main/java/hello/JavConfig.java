package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component(value="hello.JavConfig")
public class JavConfig {
	@Bean
    public String emailText() {
    	System.out.println("Loaded Email Bean................");
    	return "%s, Thank you for the valuable work, Regards......";
    }
	
}
