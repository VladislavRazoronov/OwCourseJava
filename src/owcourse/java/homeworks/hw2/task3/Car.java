package owcourse.java.homeworks.hw2.task3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String model;

    private int year;

    private int power;

    public Car(String model, int year, int power){
        this.model = model;
        this.year = year;
        this.power = power;
    }
}
