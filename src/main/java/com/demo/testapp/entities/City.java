package com.demo.testapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="city",indexes = @Index(name="idx_name_population",columnList="name,population"))
@Cache(usage =CacheConcurrencyStrategy.READ_WRITE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="population")
    private String population;


    //@Enumerated(EnumType.ORDINAL)--Strores in database in form of Index--not Recomnded
    @Enumerated(EnumType.STRING)//Stores in database enum in form of string
    private OrderStatus orderStatus;
    

    public City(Integer id, String name, String population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
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
