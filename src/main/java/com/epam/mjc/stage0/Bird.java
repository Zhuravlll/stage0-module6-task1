package com.epam.mjc.stage0;

public class Bird extends Animal {

    public static final String color = "blue";
    public static final int numberOfPaws = 2;
    public static final boolean hasFur = false;

    public Bird() {
        super(color, numberOfPaws, hasFur);
    }


    @Override
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
        result = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawAmount + " and " + furr + ". Moreover, it has 2 wings and can fly.";
        return result;
    }
}

