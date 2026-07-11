package designPatterns;

public class Phone {
    private String os;
    private int ram;
    private String processor;

    private double screen_Size;
    private int battery;

    public Phone(String os, int ram, String processor, double screen_Size, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screen_Size = screen_Size;
        this.battery = battery;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screen_Size=" + screen_Size +
                ", battery=" + battery +
                '}';
    }

}
