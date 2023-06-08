package day02_variablesmemorykullanimi;

public class C01_Variables {
    public static void main(String[] args) {

        //Ex 1:Dunya nufusunu içine yerleştireceğiniz bir variable oluşturunuz...


        long dunyaNufusu = 9000000000L;
        long sayfaSayisi = 2345;  //sayı çok buyuk olmayınca int olarak algılıyor ama buyuk olunca long olarak algılaması için yanına L konuyor.

        //Not long data type'ini Java Integer kabul etme eyilimindedir.
        // Biz israr edersek L ya da l sayinin sonuna eklemeliyiz

        //Ex 2: char data type'inde ilk ismin ilk harfi şeklinde bir variable oluşturunuz.
        char initialize = 'F';
        char space = ' ';
        char sembol = '*';
       // char hiclik = '';//OLMAZ!... char data type'inin içine mutlaka 1 karakter yerleştirilmeli.
        //Ne hiçlik ne de 1 den fazla karakter yerleştirilemez.


        // Ex 3 : boolean data type'inda emeklimisin variable olusturup false atayalim.
        boolean emekliMisin = false;

        //Ex 4: Site nüfusu için bir variable oluşturup bir deger atayalım 1200

        short siteNufusu =1200;

        //Ex 5: Gömlek ve ayakkabı fiyatlari için 2 tane variable oluşturup toplam fiyatı ekrana yazdırın

        float ayakkabiFiyati = 555.6854F;
        float gomlekFiyati = 6655.4454F;

        System.out.println("Toplam Fiyat =" + (ayakkabiFiyati+gomlekFiyati));
        System.out.print("gomlek fiyati : "+gomlekFiyati);
        System.out.println("ayakkabi fiyati : "+ayakkabiFiyati);
        System.out.println("Saadet");
        System.out.println("************************************");
        System.out.println("emeklimisin : "+emekliMisin);
        System.out.println("space : "+space+"space yazdirdimi?");


    }//main

}
