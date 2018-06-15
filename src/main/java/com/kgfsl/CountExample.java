package com.kgfsl;
 
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
 
public class CountExample {
    public static void main(String[] args) {
        List <String> colours = Arrays.asList("Red", "Green", "Blue", "Pink", "White", "Yellow", "Orange", "Purple");
        Predicate <String> predicate = element -> element.startsWith("P");
        long count = colours.stream().filter(predicate).count();
        System.out.println("Count with filter:- " + count);
        count = colours.stream().count();
        System.out.println("Count without filter:- " + count);
       
}

}
