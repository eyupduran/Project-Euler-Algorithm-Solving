package com.company;
import java.util.ArrayList;

The sequence of triangle numbers is generated by adding the 
natural numbers. So the 7th triangle number would be 
1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 
The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have 
over five divisors.

What is the value of the first triangle number to have over five 
hundred divisors?

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> üçgenselsayılar = new ArrayList<>();
        ArrayList<Integer> tambölenler = new ArrayList<>();
        int üçgensel = 0;
        int sayi;

        for (int i = 1; i < 999999; i++) {
            üçgensel = (i * (i + 1)) / 2;
            üçgenselsayılar.add(üçgensel);
        }

        for (int j = 0; j < üçgenselsayılar.size(); j++) {
            sayi = üçgenselsayılar.get(j);
            for (int k = 1; k <= sayi; k++) {
                if (sayi % k == 0) {
                    tambölenler.add(k);
                }
            }

            if (tambölenler.size() >500) {
                System.out.println(sayi);
            break;
            }
            else
                tambölenler.clear();
        }

    }
}