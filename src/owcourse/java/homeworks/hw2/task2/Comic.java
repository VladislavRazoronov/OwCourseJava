package owcourse.java.homeworks.hw2.task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class Comic extends Book{
    private List<String> characters;
    public Comic(String author, int wordCount, int pages, List<String> characters){
        super(author, wordCount, pages, Cover.SOFT);
        this.characters = characters;
    }
}
