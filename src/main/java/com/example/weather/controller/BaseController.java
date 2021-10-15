package com.example.weather.controller;

import com.example.weather.entity.Weather;
import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class BaseController {
    @Autowired
    WeatherService weatherService;

    // localhost:8080/Hanoi/10092021

    @GetMapping("/{location}/{date}")
    public List<Weather> weatherInfo(@PathVariable String location, @PathVariable String date) throws Exception {
        return weatherService.weatherInfo(location, date);
    }


}
