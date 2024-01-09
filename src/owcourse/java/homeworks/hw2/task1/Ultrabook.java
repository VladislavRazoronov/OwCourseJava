package owcourse.java.homeworks.hw2.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Ultrabook extends Laptop{
    private double thickness;

    public Ultrabook(String CPU, String RAM, String manufacturer, String GPU, double weight, String screenSize, String battery, double thickness){
        super(CPU, RAM, manufacturer, GPU, weight, screenSize, battery);
        this.thickness = thickness;
    }
}
