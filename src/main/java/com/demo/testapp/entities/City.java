package com.demo.testapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="city")
@Cache(usage =CacheConcurrencyStrategy.READ_WRITE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String population;

    

    public City(Integer id, String name, String population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    
    public City() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    

    
}
