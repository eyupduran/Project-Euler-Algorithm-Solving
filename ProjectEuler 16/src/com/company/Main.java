package com.company;

/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 21000? */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> basamak = new ArrayList<>();
        int toplam = 0;
        int a = 2;
        int b;

        int sonuç = (int) Math.pow(2, 15);
        System.out.println(sonuç);
        while (sonuç > 0) {
           :

            b = (int) sonuç % 10;
            basamak.add(b);
            sonuç = sonuç / 10;

        }

        for (int i = 0; i < basamak.size(); i++) {
            toplam += basamak.get(i);
        }
        System.out.println(toplam);


    }
}
