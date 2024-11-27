package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HeartRate;
import com.example.demo.repository.HeartRateRepository;

@RestController
@RequestMapping("/heartRate")
public class HeartRateController {

    @Autowired
    private HeartRateRepository heartRateRepository;

    @PostMapping("/add")
    public String addHeartRate(@RequestBody HeartRate heartRate) {
        heartRateRepository.save(heartRate);
        return "Heart rate recorded successfully!";
    }

    @GetMapping("/all")
    public List<HeartRate> getAllHeartRates() {
        return heartRateRepository.findAll();
    }
}
