package com.codility.lessons;

import java.util.Arrays;

public class Lesson4b {

    public static void main(String[] args) {

        int[] A = {4, 1, 3, 2};

        /*

        class Solution { public int solution(int[] A) {

         */

        Arrays.sort(A);

        int result = 0;

        for (int i=0; i<A.length; i++) {
            if (i+1 == A[i])
                result = 1;
            else
                result = 0;
        }

        System.out.println(result);

        /*

        if ()
            return 1;
        else
            return 0;
        }

         */
    }
}
