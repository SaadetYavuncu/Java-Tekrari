package day06_modulesTypeCastingAsciiValue;

public class C05_TypeCasting {
    public static void main(String[] args) {
        
        /*
        Numeric Data Type 'larinin birbirine donusturulmesine Type Casting denir
        Numeric Data Type'lari  byte< short < int < long < float < double
        Kucuk Data Type'larinin buyuk Data Type'larina donusturulmesine AutoWidenig(Otomatik Genisletme) denir.
        Buyuk Data Type'larinin kucuk Data Type'larina donusturulmesini Java ustlenmez. 
        Manuel olarak kodu yazanin sorumlulugu
        almasini ister.Bunada ExplicitNarrowing (Aciktan Daraltma) denir.
        */

        byte age =23;
        int newAge=age;//AutoWidening

        long nufus =1234;
        int yeniNufus = (int) nufus;//ExplicitNarrowing Aciktan Daraltma

        short ogrenciSayisi = 564;
        double yeniOgrenciSayuisi =ogrenciSayisi;

        float price = 45.99F;
        System.out.println("price = " + price);// 45.99
        byte newPrice= (byte) price;
        System.out.println("newPrice = " + newPrice);//45
        int number =515;
        byte newNumber = (byte) number;
        System.out.println("newNumber = " + newNumber);//3

        int sayi =510;
        byte newSayi = (byte) sayi;
        System.out.println("newSayi = " + newSayi);//-2
        
        
        
    }
}
