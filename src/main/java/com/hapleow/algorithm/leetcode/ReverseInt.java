package com.hapleow.algorithm.leetcode;

/**
 * 反转一个整数，如果超出范围则返回0
 */
public class ReverseInt {

    public int reverse(int x) {

        if (x == 0) {
            return 0;
        }
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE && pop > Integer.MAX_VALUE % 10)
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE && pop < Integer.MIN_VALUE % 10)
                return 0;
            rev = rev * 10 + pop;

        }
        return rev;
    }

}
