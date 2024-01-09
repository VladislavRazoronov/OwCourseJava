package owcourse.java.homeworks.hw2.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Laptop extends PC{
    private double weight;

    private String screenSize;

    private String battery;

    public Laptop(String CPU, String RAM, String manufacturer, String GPU, double weight, String screenSize, String battery){
        super(CPU, RAM, manufacturer, GPU);
        this.weight = weight;
        this.screenSize = screenSize;
        this.battery = battery;
    }
}
