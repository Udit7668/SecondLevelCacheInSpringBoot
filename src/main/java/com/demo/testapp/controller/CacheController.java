package com.demo.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.testapp.entities.City;
import com.demo.testapp.services.CityService;

@RestController
@RequestMapping("/city")
public class CacheController {


    @Autowired
    private CityService cityService;
    
    @PostMapping("/")
   public City addCity(@RequestBody City city){
    System.out.println(city);
    this.cityService.addCity(city);
    return city;
   }

   @GetMapping("/{id}")
   public City getCity(@PathVariable Integer id){
 City city=this.cityService.getCity(id);
    return city;
   }
}
