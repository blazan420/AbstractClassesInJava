package com.example.kevin.abstractclassesinjava;

public class DesktopComputer extends Computer {

    private String mouse;
    private double cpuPower;
    private double ram;

    //Constructor
    public  DesktopComputer(String name, String screen, String keyboard, String mouse, double cpuPower, double ram) {

        super(name, screen, keyboard);

        this.mouse = mouse;
        this.cpuPower = cpuPower;
        this.ram = ram;

    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        if (cpuPower <= 0) {
            throw new IllegalArgumentException("cpuPower must be greater than 0");
        }
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        if (ram <= 0) {
            throw new IllegalArgumentException("Ram must be greater than 0");
        }
        this.ram = ram;
    }
}
