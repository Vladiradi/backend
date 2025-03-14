package main;

import java.util.ArrayList;

public class PatternOne {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        System.out.println(strings);
    }
    ArrayList<String> upperCaseStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String value = strings.get(i);
            String upperCaseValue = value.toUpperCase();
            upperCaseStrings.add(upperCaseValue);
        }

    }
}


//
//ArrayList<String> strings = new ArrayList<>();
//strings.add("Hello");
//strings.add("Java");
//strings.add("World");
//System.out.println(strings);
//
////1) Получить список строк в верхнем регистре
////новый список для результата
//ArrayList<String> upperCaseStrings = new ArrayList<>();
////перебираем элементы оригинального списка
//for (int i = 0; i < strings.size(); i++) {
//String value = strings.get(i);
//String upperCaseValue = value.toUpperCase();
//    upperCaseStrings.add(upperCaseValue);
//}
//
//        System.out.println(upperCaseStrings);