package day06_modulesTypeCastingAsciiValue;

import java.util.Scanner;

public class C03_Mudules {
    public static void main(String[] args) {

        /*
        Interview Ouestions

        Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk 2 ve son 2
         rakamlarının toplamını hesaplatan kodu yazınız

         INPUT :12345
         OUTPUT :1+2+4+5=12
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı bir sayi giriniz: ");
        int number = input.nextInt();
        int birlerBas = number%10;
        System.out.println("birlerBas" + birlerBas);
        number = number/10;
        int onlarBas = number%10;
        System.out.println("onlarBas" + onlarBas);
        number = number/100;
        int binlerBas = number%10;
        System.out.println("binlerBas :" + binlerBas);
        number = number/10;
        int onbinlerBas = number%10;
        System.out.println("onbinlerBas :" +onbinlerBas);


        System.out.println("Toplam : "+(birlerBas+onlarBas+binlerBas+onbinlerBas));

      /*
         int number1 =12345;
        int ilkIkiRakam = number1/1000;
        System.out.println("ilkIkiRakam : " + ilkIkiRakam);
        int sonIkiRakam = number1%100;
        System.out.println("sonIkiRakam : "+sonIkiRakam);

        System.out.println("Toplam: " +(ilkIkiRakam+sonIkiRakam));
         */



        /*
           Scanner input =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();


        // Son basamagi al
       int birler = number%10;
        System.out.println("birler = " + birler);
        // Sayiyi kucult
        number=number/10;
        System.out.println("kuculen number = " + number);//1234

        // *************************** \\

        // Sondan ikinci basamagi al
        int onlarBas=number%10;

        //Sayiyi kucult
        number =number/10;//123

        // Sondan ucuncu basamai al
        int yuzlerBas = number%10;

        //Sayiyi kucult
      number =number/10;//12

        //Sondan 4 rakami al
        int binlerBas = number%10;

        // Sayiyi kucult
        int onBinlerBas= number/10;//1

        System.out.println("Toplam : "+(onBinlerBas+binlerBas+onlarBas+birler));
         */

    }
}
