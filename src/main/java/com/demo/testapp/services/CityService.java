package com.demo.testapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.testapp.entities.City;
import com.demo.testapp.respsitory.CityRepository;

@Service
public class CityService {
    

    @Autowired
    private CityRepository cityRepository;


    public void addCity(City city){
        this.cityRepository.save(city);
    }


    public City getCity(Integer id){
     City city=   this.cityRepository.findById(id).get();
     return city;
    }

}
