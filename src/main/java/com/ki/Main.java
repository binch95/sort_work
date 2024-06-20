package com.ki;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(712345698));
    }
}


class Solution {
    public static long solution(long n) {
       String l = "";
        ArrayList<String> num = new ArrayList<>();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            num.add(String.valueOf(n).substring(i, i + 1));
        }
        num.sort(Comparator.reverseOrder());
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            l = l + num.get(i);
        }
        return Long.parseLong(l);
    }
}