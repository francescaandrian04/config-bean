package pixel.academy.setter_injection_app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.setter_injection_app.common.Chef;

@RestController
public class DemoController {

    private Chef myChef;
    // constructor injection
    @Autowired
    public DemoController(@Qualifier("greekRestaurantChef") Chef theChef) {
        myChef = theChef;
//        secondChef = theSecondChef;
    }

//    private Chef secondChef;


    // setter injection
//    @Autowired
//    public void setMyChef(Chef theChef) {
//        myChef = theChef;
//    }


    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myChef == secondChef, " + (myChef == secondChef);  // return or true or false
//    }

}
