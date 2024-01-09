package owcourse.java.homeworks.hw2.task3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private int id;

    private String name;

    private String surname;

    private Gender gender;

    int age;

    public Person(int id,String name,String surname, int age,Gender gender){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }
}
