package com.kgfsl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
/* ww w .  jav a 2s.  c o m*/
public class StrEx {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("12","22","3","4","5");

    stringList.stream()
           .flatMapToLong(n-> LongStream.of(Long.parseLong(n)) )
           .forEach(System.out::println);
  }
}