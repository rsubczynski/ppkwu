package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RestController
    @RequestMapping("/reversion")
    public class RevController {

        @RequestMapping("/{items}")
        public String mainPage(@PathVariable("items") String word) {
            return new StringBuilder(word).reverse().toString();
        }
    }
}
