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

    public void setTags(List<String> tags) {
        this.tags = new ArrayList<String>(tags);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Quotes(List<String> tags, String author, String likes, String text) {
        this.setTags(tags);
        this.setAuthor(author);
        this.setLikes(likes);
        this.setText(text);
    }
}
