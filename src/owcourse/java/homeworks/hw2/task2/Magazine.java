package owcourse.java.homeworks.hw2.task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Magazine extends Book{
    private String theme;

    private String subscription;

    public Magazine(String author, int wordCount, int pages, String theme, String subscription){
        super(author, wordCount, pages, Cover.SOFT);
        this.theme = theme;
        this.subscription = subscription;
    }
}
