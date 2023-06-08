package day06_modulesTypeCastingAsciiValue;

import java.util.Scanner;

public class C02_Modules {
    public static void main(String[] args) {

        /*

Kullanicidan alacaginiz 4 basamakli bir sayinin ilk ve son rakaminin toplamini
yazdiran kodu olusturunuz.

INPUT : 1234                4698
OUTPUT : 1+4 =5             4+8 =12


 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayi giriniz: ");
        int number = input.nextInt();

        int birlerBas = number%10;
        System.out.println("Birler basamagı : "+birlerBas);
        //sayıyı kucult
        int binlerBas = number/1000;
        System.out.println("Binler basamagı : " + binlerBas);

        System.out.println("istenen sayıların toplamı : "+(birlerBas+binlerBas));

    }
}
