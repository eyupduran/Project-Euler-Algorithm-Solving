package com.company;

/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
public class Main {

    public static void main(String[] args) {
        int sayı = 1;
        while (true) {
            if (sayı % 11 == 0 && sayı % 12 == 0 && sayı % 13 == 0 && sayı % 14 == 0 && sayı % 15 == 0 && sayı % 16 == 0 && sayı % 17 == 0 && sayı % 18 == 0 && sayı % 19 == 0 && sayı % 20 == 0) {
                System.out.println(sayı);
                break;

            }
            sayı++;

        }
    }
}
