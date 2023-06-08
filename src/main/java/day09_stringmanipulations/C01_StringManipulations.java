package day09_stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //************split () ********************\\
        /*
             Istenilen yerden datayi parcalar.
             Arrayler ile cok daha fazla kullanilir.
         */

        //Ex: Verilen tamIsim String'inin ilk isim ilk harfi ile son ismin  ilk harfini
        //buyuk harf olarak yanyana yazdiran kodu olusturunuz
        //input : Akif Gurkan  output:AG

        String tamIsim = " Saadet Yavuncu ";
        char first = tamIsim.trim().toUpperCase().charAt(0);


        char second =tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("ismin IlkHarfi+Soyadın IlkHarfi : " + first+second);

    }
}
