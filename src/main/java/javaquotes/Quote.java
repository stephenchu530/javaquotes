package javaquotes;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    private String author;
    private String text;

    public String getAuthor() {
        return this.author;
    }


    public String getText() {
        return this.text;
    }

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }
}
