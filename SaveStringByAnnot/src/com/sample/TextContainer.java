package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

@SaveTo(path="./file.txt")
public class TextContainer {
    private String text = "Test string";

    public TextContainer(String text) {
        this.text = text;
    }

    public TextContainer() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Save
    public void saveText(String filePath) throws IOException {

        try(var pw = new PrintWriter(filePath)){
            pw.print(text);
        }
    }

    @Override
    public String toString() {
        return "TextContainer{" +
                "text='" + text + '\'' +
                '}';
    }
}
