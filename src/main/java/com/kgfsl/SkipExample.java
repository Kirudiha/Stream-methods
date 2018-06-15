package com.kgfsl;

import java.util.Arrays;
import java.util.List;
/*from   w w  w.  ja v  a2 s  .co m*/
public class SkipExample {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("1","1","2","3","4");

    stringList.stream()
           .skip(2)
           .forEach(System.out::println);
  }
}