package in.coderarmy;

import in.strike.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public User getUser(){
        return new User("Adity",23);
    }

    @Bean
    public Cart getCart(){

        return new Cart();
    }

}
