package day04_objectCreationScanner;

import java.util.Scanner;
public class C02_Scanner {
    public static void main(String[] args) {
         /*
         Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip
         Dikdortgenin Cevre ve Alan hesabini yapan kodu yaziniz
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kısa kenarını giriniz: ");
        int kisaKenar = input.nextInt();

        System.out.println("Lutfen uzun kenarı giriniz: ");
        int uzunKenar = input.nextInt();

        diktortgeninAlani(kisaKenar, uzunKenar);
        diktorgeninCevresi(kisaKenar, uzunKenar);

        /*
        Kullanicidan alacaginiz data ile ucgenin cevresini hesaplatan kodu yaziniz
        UcgenCevre=a+b+c;
        */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarını yazınız: ");
        byte a  = input2.nextByte();
        byte b  = input2.nextByte();
        byte c  = input2.nextByte();

        ucgeninCevresi(a,b,c);


    }

    private static void ucgeninCevresi(byte a, byte b, byte c) {
        int cevre = a+b+c;
        System.out.println("Ucgenin Cevresi : " + cevre);
    }

    private static void diktorgeninCevresi(int kisaKenar, int uzunKenar) {
        System.out.println("Dikdörtgenin Çeveresi : "+ (2*(kisaKenar+uzunKenar)));
    }

    private static void diktortgeninAlani(int kisaKenar, int uzunKenar) {
        System.out.println("Dikdörtgenin Alanı : "+ kisaKenar*uzunKenar);
    }
}
