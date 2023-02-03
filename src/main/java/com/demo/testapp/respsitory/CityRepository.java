package com.demo.testapp.respsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.testapp.entities.City;

public interface CityRepository extends JpaRepository<City,Integer>{
    
}
