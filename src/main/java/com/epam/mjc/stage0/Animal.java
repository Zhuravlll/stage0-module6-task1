package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        super();
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {
    }

    public String getDescription() {
        String pawAmount;
        String furr;
        String result;
        if (numberOfPaws == 1) {
            pawAmount = "paw";
        } else {
            pawAmount = "paws";
        }
        if (hasFur) {
            furr = "a fur";
        } else {
            furr = "no fur";
        }
        result = "This animal is mostly " +color+ ". It has " +numberOfPaws+ " " +pawAmount+ " and " +furr+ ".";
        return result;
    }
}
