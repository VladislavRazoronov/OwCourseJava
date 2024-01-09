package owcourse.java.homeworks.hw2.task3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class MiddleClass extends Person{
    private Car car;

    public  MiddleClass(int id,String name,String surname,int age,Gender gender,Car car){
        super(id, name, surname,age, gender);
        this.car = car;
    }

}
