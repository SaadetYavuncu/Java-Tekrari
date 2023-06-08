package day11_nestedifternary;

import java.util.Scanner;

public class C05_NestedIf {
    /*
 Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
 Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
 Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi kadinsa 'Kadin' erkese 'Erkek' olarak giriniz");
        String cinsiyet = input.next();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();

        if (cinsiyet.equalsIgnoreCase("Kadin")) {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas > 60) {
                System.out.println("Emekli Olabilir");
            } else {
                System.out.println("Emekli Olamaz " + (60 - yas) + " yil sonra emekli olabilir");
            }


        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas > 65) {
                System.out.println("Emekli Olabilir");
            } else {
                System.out.println("Emekli Olamaz " + (65 - yas) + " yil sonra emekli olabilir");
            }

        } else {
            System.out.println("Lutfen cinsiyetinizi kadinsa 'Kadin' \nerkekse 'Erkek' olarak giriniz");
        }


    }//main
}//class
