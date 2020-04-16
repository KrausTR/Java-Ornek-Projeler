/*
====================================================
    ÖDEV => Çarpım tablosunu ekrana yazdıran java 
			kodunu hazırlayınız.
====================================================
*/
package com.alperencetin;

public class Main {

    public static void main(String[] args) {
        for(int x = 1; x <= 10; x++)
        {
            System.out.println()
            System.out.println("+---> "+x);
            for(int y = 1; y <= 10; y++)
            {
                System.out.println("| "+x+" x "+y+" = "+(x*y));
            }
            System.out.println("+---------------+\n");
        }
    }
}
