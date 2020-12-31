package com.company;
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> asalSayıTop = new ArrayList<>();

        int sayac = 0;
        for (int sayi = 2; sayi <= 999999; sayi++) {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {

                asalSayıTop.add(sayi);

                sayac++;
            }
        }

        double toplam = 0;
        for (int j = 0; j < asalSayıTop.size(); j++) {
            toplam = asalSayıTop.get(j) + toplam;
        }
        System.out.println(toplam);

    }
}
