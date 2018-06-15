package com.kgfsl;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class HowForEachWorks1 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        List<Integer> numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer i : numberList) {
            if ((i & 1)==0) {
                System.out.println(i);
            }
            }
            numberList.stream()
            .filter(n->(n & 1)==0)
            .forEach(System.out::println);

        }
    }


