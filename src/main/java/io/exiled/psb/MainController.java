package io.exiled.psb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "Uplink") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "hello";
    }
}
