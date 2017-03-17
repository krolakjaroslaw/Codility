package com.codility.lessons;

import java.util.Arrays;
import java.util.TreeSet;

public class Lesson4c {

    public static void main(String[] args) {

        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;

        /*

        class Solution { public int solution(int X, int[] A) {

         */

        TreeSet<Integer> ts = new TreeSet<>();

        for (int i=0; i<A.length; i++) {
            ts.add(A[i]);
            if (ts.size() == X)
                System.out.println(i);
        }

        /*

            if()
                return i;
        }
        return -1;

         */
    }
}
