package day04_objectCreationScanner;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı alıp dört işlem yaptıran
        ve ekrana bastıran basit bir hesap makinesi kodu yaziniz.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=input.nextDouble();
        double sayi2=input.nextDouble();

        System.out.println("İki sayinin toplami: " +(sayi1+sayi2));
        System.out.println("İki sayinin cıkarmasi: " +(sayi1-sayi2));
        System.out.println("İki sayinin carpmasi: " +(sayi1*sayi2));
        System.out.println("İki sayinin bolmesi: " +(sayi1/sayi2));


    }
}
