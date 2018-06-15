package com.kgfsl;

import java.util.stream.Stream;
public class Build1 {
  public static void main(String[] args) {
    Stream.Builder<String> b = Stream.builder();
    b.accept("a");
    b.accept("b");
    b.accept("c");
    b.accept("d");
    b.accept("e");
    
    Stream<String> s = b.build();
    s.forEach(System.out::println); 

  }
}