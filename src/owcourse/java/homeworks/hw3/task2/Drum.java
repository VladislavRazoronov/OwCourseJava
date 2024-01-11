package owcourse.java.homeworks.hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument{
    private String size;

    @Override
    public void play(){
        System.out.println("Playing "+size+" drum ");
    }
}
