package com.codility.lessons;

import java.util.stream.IntStream;

public class Lesson3b {

    public static void main(String[] args) {

        int[] A = {2, 3, 1, 5};

        /*

        class Solution { public int solution(int[] A) {

         */

        int[] b = new int[A.length+1];
        for (int i=0; i<b.length; i++) {
            b[i] = i+1;
        }

        int sum1 = IntStream.of(A).sum();
        int sum2 = IntStream.of(b).sum();
        int diff = sum2-sum1;

        System.out.println(sum1);
        System.out.println(sum2);

        /*

        return diff;
        }

         */

    }
}