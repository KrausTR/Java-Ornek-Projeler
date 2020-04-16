/*
=====================================================
    ODEV => WHILE DONGUSU KULLANARAK GIRILEN SAYIYA
            KADAR OLAN SAYILARIN HERBIRININ KARESINI
            BULAN PROGRAMI YAZINIZ.
=====================================================
*/
package com.alperencetin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("1'den kacinci sayiya kadar kare degerleri bulmak istiyorsunuz: ");
        Scanner klavye = new Scanner(System.in);
        int buSayiyaKadar = klavye.nextInt();
        if(buSayiyaKadar < 1) buSayiyaKadar = 1;
        int suankiSayi = 1;
        while(suankiSayi <= buSayiyaKadar) {
            System.out.println(suankiSayi + "2=" + (int)Math.pow(suankiSayi, 2));
            suankiSayi++;
        }
    }
}
