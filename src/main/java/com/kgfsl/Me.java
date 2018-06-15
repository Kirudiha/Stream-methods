package com.kgfsl;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
//from www.j  a  v  a2s.c om
public class Me {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("1","2","3","4","5");

    stringList.stream()
           .map(n->( Double.parseDouble(n) ))
           
           .filter(n-> n%2 == 0)
         //  .flatMap(x-> LongStream.of(Long.parseLong(x))
           .forEach(System.out::println);
  }
}