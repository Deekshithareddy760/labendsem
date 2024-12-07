package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Tablet extends Device {
    private String screenSize;
    private int batteryLife;

    // Getters and Setters
}
