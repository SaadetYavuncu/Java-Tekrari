package day10_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        //Verilen harf buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        char ch = 'D';

        if (ch > 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");
        }else {
            System.out.println("Verilen Harf buyuk harf degil!...");
        }

        //Verilen sayi cift sayi  ise ekrana "Cift Sayi" yazdiran kodu olusturunuz

        int sayi = 98;

        if (sayi % 2 == 0) {
            System.out.println("Cift Sayi");

        }else{System.out.println("Verilen Sayi cift sayi degil!...");}

        //Verilen sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika Sayi" yazdiran kodu olusturunuz

        int number = 1201;
        if (number<300 || number>1200){
            System.out.println("Harika Sayi");
        }else {
            System.out.println("Verilen Sayi istenen aralıkta değil!...");
        }

        //Kullanicidan alınan bir sayinin çift mi tek mi oldugunu yazdşran kodu olusturunuz

       Scanner input  = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num =input.nextInt();
        if (num%2==0){
            System.out.println("Cift Sayi");
        }

        if (num%2 != 0){
            System.out.println("Tek Sayi");
        }

        //2.yol
        if (num%2==0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek Sayi");
        }

        // Verilen bir sayinin negatif mi , pozitif mi, notr mu?
        // oldugunu kontrol eden kod blogunu yaziniz

        int n = 0;
        if (n>0){
            System.out.println("Pozitif Sayi");
        }
        else if (n==0){
            System.out.println("Notr sayi");

        }else {
            System.out.println("Negatif Sayi");

        }
    }

}