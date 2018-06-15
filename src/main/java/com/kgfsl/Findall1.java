package com.kgfsl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findall1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Tom", "Jeff", "Scott", "Jennifer", "Steve","Zuckerberg");

        Optional<String> firstS = names.stream().filter(name -> name.startsWith("J")).findAny();
      //  System.out.println(firstS.orElse("None found"));
      if (firstS.isPresent()) {
        System.out.println(firstS.get());
    } else {
        System.out.println("No S's found");
    }

        Optional<String> firstZ = names.stream().filter(name -> name.startsWith("Z")).findFirst();
        if (firstZ.isPresent()) {
            System.out.println(firstZ.get());
        } else {
            System.out.println("No Z's found");
        }

       // System.out.println(firstZ.orElse("None found"));
    }
}