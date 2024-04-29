package org.burakkahraman;

import java.util.Scanner;

public class _3_OperatorsAndScanner {
    public static void main(String[] args) {
        /*
        + - / *  %
        */

        //Operator
        int numberData1=7;
        int numberData2=7;
        System.out.println("Toplama: " +(numberData1+numberData2));
        System.out.println("Çıkarma: " +(numberData1-numberData2));
        System.out.println("Çarpma: " +(numberData1*numberData2));
        System.out.println("Bölme: " +(numberData1/numberData2));
        System.out.println("Mod: " +(numberData1%numberData2));

        //Scanner
        Scanner klavye= new Scanner(System.in);
        System.out.println("\nLütfen isminizi giriniz: ");
        String name= klavye.nextLine();
        System.out.println("Adınız: "+ name);
    }
}
