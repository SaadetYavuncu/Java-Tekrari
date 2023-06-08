package day06_modulusTypeCastingAsciiValue;

public class C06_AsciiValue {
    public static void main(String[] args) {
/*
    ASCII == Amerikan Standart Kodlama Sistemi
    Klavyemizde kullandigimiz tum karakterlerin Ascii Table 'da sayisal bir degeri vardir.Cunku Bilgisayar
    icin yazilim 1 ve 0 lardan olusur. tum karakterleri bu nedenle sayisal bir degeri olmasi istenmistir.
    Tum Dunyada ortak olarak Ascii Table olusturulmustur

    Java'da + sembolunun iki anlami vardir.
    i) sayisal degerler arasinda ise toplama islemi yapar
    ii)String Datalar arasindaysa yanyana yazdirma concatination yapar


 */
        // 'b' harfi ile 20 sayisini toplayabilirmiyiz

        int sayi =20;
        char bHarfi='b';
        int toplam  = sayi+bHarfi;
        System.out.println("toplam = " + toplam);//  118(b harfinin ascii degeri=98)

        // Ex :
        char rakam1 = '1';
        char rakam2 = '2';
        char rakam3 = '3';
        char rakam4 = '4';
        System.out.println("rakam1 = " + rakam1);//1
        System.out.println("rakam2 = " + rakam2);//2
        System.out.println("rakam3 = " + rakam3);//3
        System.out.println("rakam4 = " + rakam4);//4
        System.out.println("Toplam "+rakam1+rakam2+rakam3+rakam4);//1234
        System.out.println("Toplam "+(rakam1+rakam2+rakam3+rakam4));//10  202



    }
}