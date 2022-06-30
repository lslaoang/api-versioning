package com.practice.apiversioning.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mobile {
    private String brand;
    private String model;
    private String type;
    private String network;
}
