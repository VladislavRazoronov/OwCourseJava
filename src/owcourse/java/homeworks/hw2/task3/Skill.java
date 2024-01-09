package owcourse.java.homeworks.hw2.task3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Skill {
    private String name;

    private int exp;

    public Skill(String name, int exp){
        this.name = name;
        this.exp = exp;
    }
}
