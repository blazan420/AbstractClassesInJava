package com.example.kevin.abstractclassesinjava;

public class LaptopComputer extends Computer {

    private String touchPad;
    private double cpuPower;
    private double ram;
    private String mouse;

    //Constructor
    public LaptopComputer(String name, String screen, String keyboard, String mouse,
                          double cpuPower, double ram, String touchPad) {
        super(name, screen, keyboard);

        this.cpuPower = cpuPower;
        this.ram = ram;
        this.touchPad = touchPad;
        this.mouse = mouse;
    }


    public String getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public double evaluatePerformance() {
        return cpuPower * ram;
    }

    @Override
    public String toString() {

        return String.format("%s%n %s: %s %s: %s", super.toString(), "Touch Pad", getTouchPad(), "Mouse", getMouse());
    }
}
