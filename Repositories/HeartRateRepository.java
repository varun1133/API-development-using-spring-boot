package com.example.demo.repository;

import com.example.demo.model.HeartRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRateRepository extends JpaRepository<HeartRate, Long> {
}
    