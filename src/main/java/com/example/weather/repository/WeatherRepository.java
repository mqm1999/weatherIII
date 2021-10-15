package com.example.weather.repository;

import com.example.weather.entity.Weather;
import com.example.weather.entity.WeatherDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<WeatherDetail, String> {
    public List<WeatherDetail> findWeatherDetailByDate(long date);
}
