package com.hapleow.algorithm.leetcode;

import java.util.Objects;
import java.util.Stack;

public class Porland {

    public static void main(String[] args) {
        String[] str = {"2", "1", "+", "3", "*"};
        String[] str2 = {"4", "13", "5", "/", "+"};

        Integer result = evalRPN(str2);
        System.out.println(result);

    }

    private static Integer evalRPN(String[] str) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {

            String item = str[i];
            if (Objects.equals("+", item)) {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(b) + Integer.valueOf(a)));
                continue;
            }
            if (Objects.equals("-", item)) {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(b) - Integer.valueOf(a)));
                continue;
            }
            if (Objects.equals("*", item)) {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(b) * Integer.valueOf(a)));
                continue;
            }
            if (Objects.equals("/", item)) {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(b) / Integer.valueOf(a)));
                continue;
            }
            stack.push(item);
        }
        return Integer.parseInt(stack.pop());
    }
}
