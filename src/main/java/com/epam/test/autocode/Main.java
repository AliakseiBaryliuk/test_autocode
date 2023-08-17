package com.epam.test.autocode;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5,6,7,8);
        var integers = list.stream()
                .filter(number -> number > 2)
                .collect(Collectors.toSet());
        integers.forEach(System.out::println);
        System.out.println("Hi");
    }
}
