package com.practice.apiversioning.controller;

import com.practice.apiversioning.model.Mobile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PhoneController {

    @GetMapping(value = {"/phone"})
    Mobile getMobile(){
        return new Mobile("Nokia", "3315", "keypad", "2G");
    }
}
