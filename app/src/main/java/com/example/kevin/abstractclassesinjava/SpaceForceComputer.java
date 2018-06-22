package com.example.kevin.abstractclassesinjava;

public class SpaceForceComputer extends Computer {


    private String operatingSystem;
    private double cpuPower;
    private double ram;

    public  SpaceForceComputer(String name, String screen, String keyboard,
                               String operatingSystem, double cpuPower, double ram) {
        super(name, screen, keyboard);

        if (cpuPower <= 0) {
            throw new IllegalArgumentException("The value of the cpuPower must be greater than 0");
        }
        if (ram <= 0) {
            throw  new IllegalArgumentException("The value of the ram must be greater than 0");
        }

        this.operatingSystem = operatingSystem;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

}
