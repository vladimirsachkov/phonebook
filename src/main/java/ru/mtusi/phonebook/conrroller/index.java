package ru.mtusi.phonebook.conrroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

    @RequestMapping("/q")
    public String sayHello(){
        return "index";
    }
}
