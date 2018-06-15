package com.kgfsl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
//w w  w. java  2  s.c o  m
public class Example {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("1.2","2.2","3","4","5");

    stringList.stream()
           .flatMapToInt(n-> IntStream.of(Integer.parseInt(n)) )
           .forEach(System.out::println);
  }
}