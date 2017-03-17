package com.codility.lessons;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesson3c {

    public static void main(String[] args) {

        int[] A = {3, 1, 2, 4, 3};

        /*

        class Solution { public int solution(int[] A) {

         */

        int sum1 = 0;
        int sum2 = IntStream.of(A).sum();
        int minDiff = Integer.MAX_VALUE;

        for (int p=0; p<A.length-1; p++) {
            sum1 += A[p];
            sum2 -= A[p];
            int diff = Math.abs(sum1-sum2);
            minDiff = Math.min(minDiff, diff);
        }

        System.out.println(minDiff);

        /*

        return minDiff;
        }

         */
    }
}
