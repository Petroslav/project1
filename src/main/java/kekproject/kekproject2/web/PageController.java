package kekproject.kekproject2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/register")
    public String getRegisterPage(){
        System.out.println("register Controller called");
        System.out.println("Yes");
        return "register.html";
    }
}
