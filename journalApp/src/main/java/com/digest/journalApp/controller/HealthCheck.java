package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "OK";
    }
}
