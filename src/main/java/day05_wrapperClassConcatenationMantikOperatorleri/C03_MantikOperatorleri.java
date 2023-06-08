package day05_wrapperClassConcatenationMantikOperatorleri;

public class C03_MantikOperatorleri {
    /*
    1) + , - , *,  / ==>  Dort islem Java'da Matematik'te kullanildigi gibi kullanilir
        int /int ==> int
        double * int ==> buyuk olan Data Type'i sonucun Data Type olarak kabul edilir
    2) Logical Operatorler
       2<5<10  Matematikte 3 lu kiyas yapilir .Ancak Java 3 lu kiyaslama yapamaz
               Bunun yerine ikili karsilastirma yapip Logical Operatorler ile birlestirme yapar

               i) AND (&&  &)   Mukemmeliyetci bir yapidadir.//Bugra Sirtas 29
                                True almanin tek yolu tum sartlarin true olmasindadir

                                Cay   ve AND (&&) Limon
                                 +       &&         + ==> true
                                 +       &&         - ==> false
                                 -       &&         + ==> false
                                 -       &&         - ==> false
        (5>3 && 8<9 && -11>5 && 6==6 )
        && operatoru ilk gordugu false degerinde bize false dondurur
        & operatoru ise kodu sonuna kadar oku sonra false dondurur.
        Bu nedenle && operatoru daha hizli calsir.

        ii) OR (||) veya Operatoru Cihan Bulut polyannacidir En ufak bir true 'da true dondurur

                                Cay         veya OR (||)          Limon
                                 +              ||                  + ==> true
                                 +              ||                  - ==> true
                                 -              ||                  + ==> true
                                 -              ||                  - ==> false

        iii) NOT(!) true olan sonucu false, false olan sonucu da true dondurur.
        !true = false
        !false = true
        !!true = true

        3) Karsilastirma Operatorleri

         Kucuktur < , Buyuktur > , Kucuk Esittir<= ,  Buyuk Esittir>= , Esittir == , Esit Degildir !=

     */
    public static void main(String[] args) {

        boolean sonuc = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println("sonuc = " + sonuc);//true
        boolean sonuc2=5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println("sonuc2 = " + sonuc2);//false
        boolean sonuc3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8;
        System.out.println("sonuc3 = " + sonuc3);//false

        int sayi1 = 15;
        System.out.println(10 < sayi1 && sayi1 < 20);//true

        int sayi2 = 5;
        // sayi2 un 10 ile 20'in arasinda olmadigini true diyerek donduren bir kod yaziniz
        System.out.println("sayı2 10 ile 20 arasında değildir : "+(sayi2 < 10 || sayi2 > 20));//true


    }//main

}