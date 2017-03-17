package com.codility.lessons;

import java.util.Arrays;

public class Lesson4a {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 5, 3};

    /*

    class Solution { public int solution(int[] A) {

     */

        Arrays.sort(A);
        int misNum = 1;

        System.out.println(Arrays.toString(A));

        for (int i=0; i<A.length-1; i++) {
            if (A[i] != A[i+1])
                if (misNum == A[i])
                    misNum++;
        }

        System.out.println(misNum);

    /*

    return misNum;
    }

     */
    }
}
