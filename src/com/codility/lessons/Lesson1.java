package com.codility.lessons;

public class Lesson1 {

    public static void main(String[] args) {

        int N=133;
        String binary = Integer.toString(N,2);
        System.out.println(binary);

        /*

        class Solution { public int solution(int N) {

        */

        int result = 0;
        int gapLength = 0;
        boolean gapStart = false;
        boolean gapZeros = false;

        while (N>=1) {
            if (N%2 == 1) {
                if (gapStart) {
                    result = (result > gapLength) ? result : gapLength;
                    gapLength = 0;
                }
                else {
                    gapStart = true;
                }
            }
            else {
                gapZeros = gapStart;
                if (gapZeros)
                    gapLength++;
            }
            N/=2;
        }
        System.out.println(result);

        /*

        return result;
        }

         */
    }
}
