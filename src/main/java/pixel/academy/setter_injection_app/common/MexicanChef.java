package pixel.academy.setter_injection_app.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {

    public MexicanChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

//    //init method
//    @PostConstruct
//    public void initializeBean() {
//        System.out.println("Bean initialized." + getClass().getSimpleName());
//    }
//
//    @PreDestroy
//    public void cleanup() {
//        System.out.println("Bean is about to be destroyed." + getClass().getSimpleName());
//    }

    @Override
    public String getDailyRecipe() {
        return "Prepara tacos al pastor con pina, cilantro y salsa picante!";
    }

}
