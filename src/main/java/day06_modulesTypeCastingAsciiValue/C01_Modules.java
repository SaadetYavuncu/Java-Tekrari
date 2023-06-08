package day06_modulesTypeCastingAsciiValue;

import java.util.Scanner;

public class C01_Modules {
    public static void main(String[] args) {
        /*
        Kullanicidan 3 basamaklı bir sayi alın sayinin rakamlarini birler, onlar,yüzler basamagi olarak yazdirin

         INPUT : 568

         OUTPUT: Birler Basamagi 8
                 Onlar Basamagi 6
                 Yuzler Basamagi 5

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayi giriniz: ");
        int number = input.nextInt();



        //1 ler basamagindaki sayiyi elde etmek icin
        int birlerBas = number%10;
        System.out.println("birlerBas" + birlerBas);//8

        //Sayiyi kucult onlar basamağına ilerlemek için
        number = number/10;
        System.out.println("kuculen number = " +number);//56

        //*************************//

        //10 lar basamagindaki sayiyi elde etmek icin
        int onlarBas = number%10;
        System.out.println("onlarBas" + onlarBas);//6

        //Sayiyi kucult onlar basamağına ilerlemek için
        number = number/10;
        System.out.println("kuculen number = " +number);//56
        //*************************//


        //100 ler basamagindaki sayiyi elde etmek icin
        int yuzlerBas = number%10;
        System.out.println("yuzlerBas :" + yuzlerBas);//5


    }
}
