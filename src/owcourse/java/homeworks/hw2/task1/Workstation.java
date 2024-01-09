package owcourse.java.homeworks.hw2.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Workstation extends Laptop {
    private double heatCapacity;

    private String coolingSystem;

    public Workstation(String CPU, String RAM, String manufacturer, String GPU, double weight, String screenSize, String battery, double heatCapacity, String coolingSystem) {
        super(CPU, RAM, manufacturer, GPU, weight, screenSize, battery);
        this.heatCapacity = heatCapacity;
        this.coolingSystem = coolingSystem;
    }
}
