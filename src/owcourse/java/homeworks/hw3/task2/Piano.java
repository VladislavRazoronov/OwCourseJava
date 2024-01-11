package owcourse.java.homeworks.hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Piano implements Instrument{
    private String type;

    @Override
    public void play(){
        System.out.println("Playing "+type+" piano");
    }
}
