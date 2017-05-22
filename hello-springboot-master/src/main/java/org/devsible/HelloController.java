package org.devsible;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody String home() {
        return "Hello, Spring Boot~!!";
    }
}
