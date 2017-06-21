package com.oracle.interview;

import java.util.*;
import java.util.regex.*;

public class IPPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        print(sb, 0);
    }

    private static boolean print(StringBuilder sb, int d) {
        if (d == 3) return isValid(sb.toString());
        int n = sb.length();
        int i = sb.lastIndexOf(".") + 2;
        for (; i < n; i++) {
            sb.insert(i, '.');
            if (print(sb, d + 1)) {
                System.out.println(sb);
            }
            sb.deleteCharAt(i);
        }
        return false;
    }

    private static boolean isValid(String s) {
        if (s.split("\\.").length != 4) return false;
        Pattern pat = Pattern.compile("\\b([0-9]{1,3}\\.){3}[0-9]{1,3}\\b");
        Matcher m = pat.matcher(s);
        return m.find();
    }
}
