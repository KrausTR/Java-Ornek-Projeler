/*
=====================================================
    ÖDEV:	Girdilerle birlikte şekil çizimi.
			Dikdörtgen, Dik üçgen, Eşkenar Dörtgen
=====================================================
*/
package com.alperencetin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner klavye = new Scanner(System.in);
        System.out.println("Şekillerin başındaki rakamları kullanarak bir şekil seçiniz. Örn: 1");
        System.out.println("Şekiller: (1)Dikdörtgen, (2)Dik Üçgen, (3)Eşkenar Dörtgen");
        int secimSekil, satirSekil = 1, sutunSekil = 1;
        do {
            System.out.print("Seçiminiz: ");
            secimSekil = klavye.nextInt();
        }
        while(secimSekil < 1 || secimSekil > 3);
        do {
            System.out.print("Şekliniz için uzunluk değeri girin: ");
            satirSekil = klavye.nextInt();
        }
        while(satirSekil < 1);
        if(secimSekil == 1) {
            do {
                System.out.print("Şekliniz için genişlik değeri girin: ");
                sutunSekil = klavye.nextInt();
            }
            while(sutunSekil < 1);
        }
        switch(secimSekil) {
            case 1:
                for(int i = 1; i <= satirSekil; i++)
                {
                    for(int j = 1; j <= sutunSekil; j++)
                    {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for(int x = 1; x <= satirSekil; x++)
                {
                    for(int y = 1; y <= x; y++)
                    {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3: 
                for (int i = 1, y = 1; i <= satirSekil; i++, y+=2) {
                    for (int j = 0; j <= satirSekil - i + 1; j++)
                        System.out.print("  ");
                    for (int k = 0; k < y; k++)
                        System.out.print("* ");
                    System.out.println();
                }
                for (int i = satirSekil - 1, y = (satirSekil - 1) * 2 - 1; i > 0; i--, y-=2) {
                    for (int n = 0; n <= satirSekil - i + 1; n++)
                        System.out.print("  ");
                    for (int k = 0; k < y; k++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;
        }
    }
}
