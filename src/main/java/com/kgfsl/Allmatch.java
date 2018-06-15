package com.kgfsl;

import java.util.Arrays;
import java.util.List;
public class Allmatch {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    boolean o = numbers.stream()
                     .allMatch(n-> n % 2 ==0);
                     boolean i = numbers.stream()
                     .anyMatch(n-> n % 2 ==0);

    System.out.println(o);
    System.out.println(i);
  }
}