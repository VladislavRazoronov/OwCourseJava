package owcourse.java.homeworks.hw2;

import owcourse.java.homeworks.hw2.task1.PC;
import owcourse.java.homeworks.hw2.task1.Ultrabook;
import owcourse.java.homeworks.hw2.task1.Workstation;
import owcourse.java.homeworks.hw2.task2.Comic;
import owcourse.java.homeworks.hw2.task2.Magazine;
import owcourse.java.homeworks.hw2.task2.Papyrus;
import owcourse.java.homeworks.hw2.task3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PC myPC = new Workstation("Intel core I7","8GB","Lenovo","NVIDIA RTX 1050",6230,
                "16.7 inch","8000A",90,"Double air fans");
        PC light = new Ultrabook("AMD", "4GB","ASUS","none", 817, "17 inch",
                "4000A",2);

        System.out.println(myPC);
        System.out.println(light);

        ArrayList<String> chars = new ArrayList<>();
        chars.add("Peter Parker(Spider man");chars.add("Green Goblin");

        Papyrus spiderMan = new Comic("DC",120, 20,chars);
        Papyrus nationalGeographic = new Magazine("National Geographic", 683, 40,
                "Nature","monthly pay");
        System.out.println(spiderMan);
        System.out.println(nationalGeographic);

        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Java",10)); skills.add(new Skill("js",10));
        skills.add(new Skill("C++",10));

        Person vasya = new Programmer( 1, "vasya", "pupkin" ,31 , Gender.MALE,
                new Car("toyota",  2021, 250), "asd@asd.com", skills);

        System.out.println(vasya);
    }

}
