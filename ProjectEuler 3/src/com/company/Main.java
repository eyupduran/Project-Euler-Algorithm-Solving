package com.company;

import java.util.Scanner;
/*The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        double sayi=scanner.nextDouble();
        double bolen=2;
        double bolunen=sayi;
        System.out.println("Asal çarpanlar: ");
        while(bolen<sayi){
            if(bolunen%bolen==0.0){
                System.out.println(bolen);
                bolunen/=bolen;
            }
            else{
                bolen++;
            }
        }
    }
}
