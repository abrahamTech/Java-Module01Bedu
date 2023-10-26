package com.example.s72.controller;

import com.example.s72.entity.Car;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/micro")
public class DemoController {
    @PostMapping("/car")
    public  void receive(@RequestBody Car car) {
        System.out.println(car.toString());
    }
}
