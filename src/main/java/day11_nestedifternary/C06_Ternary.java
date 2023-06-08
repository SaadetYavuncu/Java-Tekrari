package day11_nestedifternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {


        // Ex : Kullanicidan iki sayi alinizi Buyuk olmayan sayiyi ekrana yazdiran kodu olusturunuz

        /*
        Ternary
        Condition ? True    : False

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
// 1.Yol
        if(sayi1<sayi2){
            System.out.println("Buyuk Olmayan Sayi "+sayi1);
        }else if(sayi1>sayi2){
            System.out.println("Buyuk Olmayan Sayi "+sayi2);
        }else{
            System.out.println("Sayilar Birbirine Esittir");
        }

        // 2.Yol Ternary
        System.out.println(sayi1 == sayi2 ? "Sayilar Esit" :sayi1 > sayi2 ? sayi2 : sayi1);


    }
}
