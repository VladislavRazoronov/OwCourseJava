package owcourse.java.homeworks.hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Printable{
    private String name;
    private int pageCount;

    @Override
    public void print(){
        System.out.println("Printing book "+name+". Taking "+ pageCount +" pages");
    }
}
