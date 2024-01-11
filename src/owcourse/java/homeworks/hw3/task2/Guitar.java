package owcourse.java.homeworks.hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument{
    private int cords;

    public void play(){
        System.out.println("Playing guitar with "+cords+" cords");
    }
}
