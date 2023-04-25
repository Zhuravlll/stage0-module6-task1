package com.epam.mjc.stage0;

public class Dog extends Animal {
    public static final String color = "brown";
    public static final int numberOfPaws = 4;
    public static final boolean hasFur = true;

    public Dog() {
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
        result = "This animal is mostly " +color+ ". It has " +numberOfPaws+ " " +pawAmount+ " and " +furr+ ".";
        return result;
    }
}
