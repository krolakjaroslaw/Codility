package com.codility.lessons;

import java.util.Arrays;

public class Lesson4d {

    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;

        /*

        class Solution { public int[] solution(int N, int[] A) {

         */

        int[] B = new int[N];
        int counter = 0;
        int min = 0;

        for (int i=0; i<A.length; i++) {
            int index = A[i] - 1;
            if (index >= N) {
                counter = min;
            } else {
                if (B[index] < counter) {
                    B[index] = counter;
                }

                B[index]++;

                if (min < B[index])
                    min = B[index];
            }

        }

        for (int i=0; i<B.length; i++) {
            if (B[i] < counter)
                B[i] = counter;
        }

        System.out.println(Arrays.toString(B)); // do wywalenia

        /*

        return B;
        }

         */

    }
}
