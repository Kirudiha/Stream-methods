package com.kgfsl;

import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

class HowForEachWorks {

public static void main(String[] args) {
    // Using an anonymous class


List<String> disneyCharacters = Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto");

Consumer<String> con = new Consumer<String>() {
 public void accept(String s) {
 System.out.println(s);
 }
 };
 disneyCharacters.forEach(con);

// Consumer<String> con = s -> System.out.println(s);
// disneyCharacters.forEach(con);
// disneyCharacters.forEach(s->System.out.println(s));


// call by method
//disneyCharacters.forEach(System.out::println);

}
}