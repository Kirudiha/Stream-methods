package com.kgfsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Collectors1 {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("2","1","3","4","6","10","89","2","1","2");

     long m = stringList
              .stream()    
              .collect(Collectors.counting());
     System.out.println(m);
     Stream<String> s = Stream.of("a","b","c","D","H","K");
    
    List<String> names = s
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    System.out.println(names);
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
    
    Stream<Integer> n = Stream.concat(numbers.stream(),
        numbers1.stream()); 
        stringList.stream()
           .distinct()
           .forEach(System.out::println);
                     

    System.out.println(n.count());
  }
}