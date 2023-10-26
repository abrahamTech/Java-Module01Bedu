package com.example.s72.controller;

import com.example.s72.entity.Car;
import com.example.s72.entity.House;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/micro")
public class DemoController {
    @PostMapping("/car")
    public  void receive(@RequestBody Car car) {
        System.out.println(car.toString());
    }

    @PostMapping("/house")
    public void recibeCasa(@RequestBody House house){
        System.out.println(house.toString());
    }
}
