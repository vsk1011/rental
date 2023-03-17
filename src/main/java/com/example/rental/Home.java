package com.example.rental;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/myHome")
    public String getData() {
        return "rent your house today";
    }
}