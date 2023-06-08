package day08_stringmanipulations;

public class C05_StringManipulations {
    public static void main(String[] args) {

        //*************replaceFirst()*************\\

        /*
        replaceFirst() replaces() methodu ile ayni isi yapar
        Ancak sadece ilk gordugu datayi degistirir
         */

        String cumle = "Java ogrenmek techpro ile cok zevkli...";
        //Ex : cumle String'indeki ilk gordugu 'i' harfi yerine 'e' yerlestiriniz

        System.out.println(cumle.replaceFirst("i", "e"));
        //Java ogrenmek techpro ele cok zevkli...




        //**************trim()************\\
        /*
        Bir String datadaki trim bastaki ve sondaki bosluklari siler
        Kullanici hatalarini onler.
        Ortadaki space'lere dokunmaz sadece bastaki ve sondakini siler
         */
        System.out.print("************");
        String isim = " Hayriye Kartin ";
        System.out.print("************");
        System.out.print(isim.trim());
        System.out.println("*************************");
        
        //************************Hayriye Kartin*************************
        
        //Ex : Asagida verilen urunlerin toplam fiyatini veren kodu yaziniz
        
        String tv = "599.99TL";
        String utu = "299.99TL";
        
        String tv2 = tv.replace("TL","");
        System.out.println("tv2 = " + tv2);
        String utu2 = utu.replace("TL","");
        System.out.println("utu2 = " + utu2);
        Double toplam = Double.valueOf(tv2)+Double.valueOf(utu2);
        System.out.println("toplam = " + toplam+"TL");




    }
}
