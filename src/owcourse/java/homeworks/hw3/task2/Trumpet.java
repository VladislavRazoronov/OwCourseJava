package owcourse.java.homeworks.hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument{

    private double diameter;
    @Override
    public void play() {
        System.out.println("Playing trumpet of "+diameter+" diameter");
    }
}
