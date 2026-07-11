package designPatterns;

public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;

    private double screen_Size;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreen_Size(double screen_Size) {
        this.screen_Size = screen_Size;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public Phone getPhone(){

        return new Phone(os,ram,processor,screen_Size,battery);
    }
}
