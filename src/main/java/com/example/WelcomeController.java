package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sathish on 3/4/16.
 */
@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String welcome() {
        return "hello";
    }
    @RequestMapping("/hai")
    public String welcomeUser() {
        return "welcome-user";
    }

}
