package pixel.academy.setter_injection_app.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   // asa spun ca e obiect
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)


public class ItalianChef implements Chef {

    public ItalianChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoes and basil!";
    }


}