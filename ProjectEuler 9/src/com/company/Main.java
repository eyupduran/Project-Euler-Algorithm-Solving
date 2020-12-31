package com.company;

public class Main {

    public static void main(String[] args) {

        int a, b, c;
        for (int i = 1; i < 500; i++) {
            a = i;
            for (int j = 1; j < 500; j++) {
                b = j;
                for (int k = 1; k < 500; k++) {
                    c = k;
                    if (a * a + b * b == c * c && a + b + c == 1000) {
                        System.out.println(a * b * c);
                    }
                }
            }
        }
    }
}
