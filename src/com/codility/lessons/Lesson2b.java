package com.codility.lessons;

import java.util.Arrays;

public class Lesson2b {

    public static void main(String[] args) {
        int[] A = {3,8,9,7,6};
        int K = 3;

        System.out.println(Arrays.toString(A));

        /*

        class Solution { public int[] solution(int[] A, int K) {

         */


        while (K!=0) {
            K--;
            int temp = A[A.length-1];
            for (int i=A.length-1; i>0; i--) {
                A[i] = A[i-1];
            }
            A[0] = temp;
        }

        System.out.println(Arrays.toString(A));

        /*

        return A;
        }

         */
    }
}
