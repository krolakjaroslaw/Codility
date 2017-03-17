package com.codility.lessons;

public class Lesson3a {

    public static void main(String[] args) {

        int X = 10;
        int Y = 85;
        int D = 30;

        /*

        class Solution { public int solution(int X, int Y, int D) {

         */

        int number = 0;

        while (X<Y) {
            X += D;
            number++;
        }

        System.out.println(number);

        /*

        return number;
       }

         */
    }
}
