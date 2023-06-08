package day08_stringmanipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {
        //**************contains() icermek ****************\\

        /*
        String bir datada belirli bir karakter ya da karakterlerin
        olup olmadıgını return eder. true ya da false olarak
        boolean sonuc verir.
         */

        String str ="Kara kara Ankara";
        System.out.println("str.contains(\"kara\") = " + str.contains("kara"));//true
        System.out.println("str.contains(\"yara\") = " + str.contains("yara"));//false
        System.out.println("str.contains(\"ak\") = " + str.contains("ak")); //false
        System.out.println("str.contains(\"a k\") = " + str.contains("a k"));//true

        /*
        Metnin bas kisminin istenen karakter ya da karakterle başlayip başlamadigini kontrol eder.
        Bize boolean sonuc dondurur.
         */

        //String str ="Kara kara Ankara";
        System.out.println("str.startsWith(\"kara\") = " + str.startsWith("kara"));//false
        System.out.println("str.startsWith(\"Kara\") = " + str.startsWith("Kara"));//true

        //Ex : Universite numaralari = yıl+bolumKodu+o bolume kacinci siradan girildigi
        // Olarak duzenlenen bir okulda  ogrenci Esra'nın hukuk fakultesine gidip gitmedigini
        //gosteren kodu yazınız.

        /*
        Sinif Ogretmenligi=22
        Kimya=33
        Hukuk=44
        Tip =55
        Esra studentId = 20085506
         */
        String str2 = "20085506";
        System.out.println(str2.startsWith("44", 4));//false
        /*
        prefix : baslangic demek
        offset at gitsin ilk 4 karakterden sonra "44" ile basliyor mu diye bakildi
         */
        String str3 = "20204401";
        System.out.println(str3.startsWith("44", 4));//true

        //***************endswith ()****************\\

         /*
        Metnin son kisminin istenen karakter ya da karakterle bitip bitmedigini kontrol eder.
        true ya da false şeklinde Bize boolean sonuc dondurur.
         */

        //Ex : Verilen cumlenin "money" ile bitip bitmedigini kontrol eden kodu yaziniz.
        String cumle = "Learn Java earn money";
        System.out.println("cumle.endsWith(\"money\") = " + cumle.endsWith("money"));//true
        System.out.println("cumle.endsWith(\"moNey\") = " + cumle.endsWith("moNey"));//false
        //Buyuk Kucuk harf duyarlı oldugu icin birbiri ile aynı oldugunu gormuyor...


        //Ex: Verilen mail adresinin .com ile bitip bitmedigini kontrol eden kodu olusturunuz.
        String mail ="fatih@gmail.com";
        System.out.println("mail.endsWith(\".com\") = " + mail.endsWith(".com"));//true

        //Ex : Mail adresinin @ işaretini içerip icermedigini kontrol eden kodu yazınız.
        System.out.println("mail.contains(\"@\") = " + mail.contains("@"));//true

    }
}
