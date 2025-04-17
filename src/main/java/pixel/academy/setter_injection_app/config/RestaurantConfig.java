package pixel.academy.setter_injection_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pixel.academy.setter_injection_app.common.Chef;
import pixel.academy.setter_injection_app.common.GreekChef;

@Configuration
public class RestaurantConfig {

    @Bean("greekRestaurantChef")
    public Chef greekChef() {

        return new GreekChef();

    }
}
