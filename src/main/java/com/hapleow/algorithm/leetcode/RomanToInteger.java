package com.hapleow.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInteger {

    public static int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        char[] chars = s.toCharArray();

        Stack<Integer> stack = new Stack<>();
            for (char c : chars) {
            Integer cInt = map.get(String.valueOf(c));
            if (stack.isEmpty()) {
                stack.push(cInt);
            } else {
                Integer pop = stack.pop();
                if (cInt > pop) {
                    pop = 0-pop;
                }
                stack.push(pop);
                stack.push(cInt);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum +=stack.pop();
        }
        return sum;
    }
}
