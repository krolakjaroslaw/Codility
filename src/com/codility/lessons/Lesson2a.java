package com.codility.lessons;

public class Lesson2a {

    public static void main(String[] args) {
        int Z = 7;
        int B = 9;

        int C;

        C = Z & B;

        System.out.println(C);


    /*

    class Solution { public int solution(int[] A) {

     */

        int[] A = {5, 3, 9, 3, 5, 7, 9};

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }

        System.out.println(result);

    /*

    return result;
    }

     */

    }
}
