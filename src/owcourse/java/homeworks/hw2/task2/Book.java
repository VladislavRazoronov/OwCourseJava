package owcourse.java.homeworks.hw2.task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Book extends Papyrus{
    private int pages;

    private Cover cover;

    public Book(String author, int wordCount, int pages, Cover cover){
        super(author, wordCount);
        this.pages = pages;
        this. cover = cover;
    }
}
