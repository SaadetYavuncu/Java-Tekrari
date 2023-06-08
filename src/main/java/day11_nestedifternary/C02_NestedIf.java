package day11_nestedifternary;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {

        /*
        Nested If : Icice gecmis yapilarda kullanilir.Java Nested If Statement'ta zorlanir ve yavas calisir.
        Mumkunse Nested If Kullanilmamali

        Kullanicidan 3 tane pozitif tamsayi aliniz.Bu uc sayinin ucgen olusturma sartini
        kontrol ediniz. Eger cgen ise Eskenar Ucgen olma durumunu kontrol ediniz.
            INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
                            herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c


           a=b=c ise eskenar ucgen

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunluklarini giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
// Burada kullanicidan alinan data degistirilebilir
        boolean ucgen = (a + b > c && c > Math.abs(a - b)) &&
                (a + c > b && b > Math.abs(a - c)) &&
                (b + c > a && a > Math.abs(b - c));

        if(a<1 || b<1 ||c<1){//Kullanicini negatif sayi girmesini engelliyorum
            System.out.println("Ucgenin Kenarlari Negatif Sayi Olamaz");
        }else  if (ucgen) { //Ucgen Olma Durumu Kontrolu
            if (a == b && b == c && a == c) {//Eskenar Olup Olmama Kontrolu
                System.out.println("Eskenar Ucgen");
            } else
                System.out.println("Ucgen ama Eskenar Ucgen Degil");
        } else {
            System.out.println("Ucgen Degildir");
        }



    }//main
}
