package com.example.mindsycn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class git initHomeController {
    @RequestMapping("/")
    public String home() {
        return "index.html";
    }
}
