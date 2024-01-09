package owcourse.java.homeworks.hw2.task3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class Programmer extends MiddleClass{
    private String email;

    private List<Skill> skills;

    public Programmer(int id,String name,String surname,int age,Gender gender,Car car, String email, List<Skill> skills){
        super(id, name, surname,age, gender, car);
        this.email = email;
        this.skills = skills;
    }
}
