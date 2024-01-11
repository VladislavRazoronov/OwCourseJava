package owcourse.java.homeworks.hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Magazine implements Printable{
    private String name;
    private String subscriptionType;
    @Override
    public void print(){
        System.out.println("Printing "+name+" magazines according to "+subscriptionType);
    }
}
