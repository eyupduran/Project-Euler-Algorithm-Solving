package com.company;
/*Find the difference between the sum of the squares of the first one 
hundred natural numbers and the square of the sum./*

public class Main {

    public static void main(String[] args) {
      	

	int toplam=0;
        int toplamKaresi=(100*101)/2;
        for(int i=1;i<=100 ;i++){
            toplam =toplam+(i*i);


        }
        int sonuç;
        sonuç = toplamKaresi*toplamKaresi - toplam;
        System.out.println(sonuç);
    }
}
