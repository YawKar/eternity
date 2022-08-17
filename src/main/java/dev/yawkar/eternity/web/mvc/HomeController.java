package dev.yawkar.eternity.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    String homepage() {
        return "homepage";
    }
}
