package owcourse.java.homeworks.hw2.task2;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Papyrus {
    private String author;

    private int wordCount;

    public Papyrus(String author, int wordCount){
        this.author = author;
        this.wordCount = wordCount;
    }
}
