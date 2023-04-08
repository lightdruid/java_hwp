package ru.otus.java;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        List<String> words = Lists.newArrayList("Hello", "Otus");
        String helloOtus = Joiner.on(" ").join(words);

        System.out.println("HW01: " + helloOtus + "!");
    }
}
