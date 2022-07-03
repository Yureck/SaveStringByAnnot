package com.sample;

import java.io.IOException;
import java.lang.reflect.*;

public class Saver {

    public static void saveContText(TextContainer tCont) throws InvocationTargetException, IllegalAccessException, IOException {

        Class<?> cls = tCont.getClass();

        if (cls.isAnnotationPresent(SaveTo.class)){
            SaveTo an = cls.getAnnotation(SaveTo.class);
            String path = an.path();
            Method[] methods = cls.getDeclaredMethods();

            for (var method:methods) {
                if(method.isAnnotationPresent(Save.class)){
                        method.invoke(tCont, path);
                        System.out.println("The method to save the string in Container was called");
                }
            }
        }
    }

}
