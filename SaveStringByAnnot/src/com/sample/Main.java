package com.sample;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        TextContainer txtCont = new TextContainer("I want to save this text to a file or something else");
        try {
            Saver.saveContText(txtCont);
        } catch (InvocationTargetException | IllegalAccessException | IOException e) {
            e.printStackTrace();
        }
    }
}