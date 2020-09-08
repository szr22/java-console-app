package com.company.util;

import java.util.List;

public class Helper {
    public static int[] convertIntegers(List<Integer> integers){
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }
}
