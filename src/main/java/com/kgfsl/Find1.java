package com.kgfsl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
// w  w  w  . j  a  va  2  s . co  m
public class Find1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2);
    Optional<Integer> o = numbers.stream()
                     .findAny();
                     System.out.println(o.get());
    // if(o.isPresent()){
     
    // }else{
    //   System.out.println("no value");
    // }

  }
}