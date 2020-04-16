/*
====================================================
    ÖDEV => Fibonacci Sayıları
            1,1,2,3,5,8...
            1000'den küçük tüm fibonacci sayılarını 
			ekrana yazdırın.
====================================================
*/
package com.alperencetin;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 1;
        int yazilansayi = 0;
        System.out.println("0");
        System.out.println(sayi1);
        System.out.println(sayi2);
        while(yazilansayi < 1000)
        {
            yazilansayi = sayi1+sayi2;
            if(!(yazilansayi < 1000)) break;
            sayi1 = sayi2;
            sayi2 = yazilansayi;
            System.out.println(yazilansayi);
        }
    }
}
