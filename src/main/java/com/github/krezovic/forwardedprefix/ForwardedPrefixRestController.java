package com.github.krezovic.forwardedprefix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ForwardedPrefixRestController {
    @GetMapping
    public String test() {
        return "Howdy";
    }
}
