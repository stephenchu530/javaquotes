package javaquotes;

import java.util.ArrayList;
import java.util.List;

public class Quotes {
    private List<String> tags;
    private String author;
    private String likes;
    private String text;

    // Setter and getter for collections types gotten from:
    // https://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices
    public List<String> getTags() {
        return new ArrayList<String>(this.tags);
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public Quotes(List<String> tags, String author, String likes, String text) {
        this.tags = new ArrayList<String>(tags);
        this.author = author;
        this.likes = likes;
        this.text = text;
    }
}
