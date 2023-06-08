package day07_incrementDecrementStringManipulations;

import java.util.Scanner;

public class C03_StringManipulations {

    public static void main(String[] args) {


// ***************** toUpperCase() tum harfleri buyuk harf yapar***********************\\

        String isimUpper ="Emin";
        System.out.println("Upper Case "+isimUpper.toUpperCase());//EMİN


// ***************** toLowerCase() tum harfleri kucuk harf yapar **********************\\
        String cumle = "Tek RAKIBIM Dunku Ben";
        System.out.println(cumle.toLowerCase());//tek rakıbım dunku ben

        // *************** lenght() uzunluk karakter sayisini verir lenght methodu 1 'den baslar \\
        String str = "Learn Java earn$ money8";
        System.out.println(str.length());//23
        /*
        lenght () space dahil sembol sayi rakam harf tum karakterleri sayar
         */

        // *********************** charAt()***********************\\
        // Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = input.next();
        char ilkHarf = isim.charAt(0);//H    useyin
        System.out.println("ilkHarf = " + ilkHarf);
        char sonHarf = isim.charAt(isim.length()-1);//n
        System.out.println("sonHarf = " + sonHarf);
        System.out.println("ilkHarf SonHarf  : "+ilkHarf+sonHarf);

        // str variable'indaki bastan ikinci ve sondan
        // ikinci karakteri alip yazdiran kodu yaziniz
        //String str = "Learn Java earn$ money8";
        //OutPut ==> ey
        char bastanIkinci = str.charAt(1);//bastan ikinci karakter alindi
        char sondanIkinci =str.charAt(str.length()-2);
        System.out.println("bastan ikinci Sondan ikinci : "+bastanIkinci+sondanIkinci);//ey

    }
}
