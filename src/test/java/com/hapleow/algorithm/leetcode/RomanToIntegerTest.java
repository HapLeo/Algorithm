package com.hapleow.algorithm.leetcode;

import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToInt() {

        String a = "I";
        String b = "IV";
        String c = "VII";
        String d = "MDC";

        int as = RomanToInteger.romanToInt(a);
        int bs = RomanToInteger.romanToInt(b);
        int cs = RomanToInteger.romanToInt(c);
        int ds = RomanToInteger.romanToInt(d);
        System.out.println(as);
        System.out.println(bs);
        System.out.println(cs);
        System.out.println(ds);
    }
}