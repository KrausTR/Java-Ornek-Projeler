/*
=========================================================
    ÖDEV => Girilen sözcük ya da cümlenin tersten
            aynı olup olmadığını (palindrom) denetleyen
            bir program yazınız
            Örnek: Kazak, Ey Edip Adanada pide ye
=========================================================
*/
package com.alperencetin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Bir cümle ya da kelime giriniz: ");
        String metin;
        Scanner klavye = new Scanner(System.in);
        metin = klavye.nextLine();
        if(metin.length() % 2 == 0) {
            System.out.println("Girdiğiniz metin palindrom metin değildir.");
        }
        else {
            int orta = metin.length() / 2;
            metin = metin.toLowerCase();
            for(int i = 0; i < orta; i++)
            {
                if(metin.charAt(i) != metin.charAt(metin.length() - 1 - i))
                {
                    System.out.println("Girdiğiniz metin palindrom metin değildir: "+metin);
                    return;
                }
            }
            System.out.println("Girdiğiniz metin palindrom metindir: "+metin);
        }
    }
}