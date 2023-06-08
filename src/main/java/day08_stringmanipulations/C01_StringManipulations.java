package day08_stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //**********substring()***************\\

        /*
Substring()==> Bir String ifadenin Herhangi bir kismini almak icin kullanilan
 methodtur.indexle calisir.
  i)sunstring(int baslangic index,int bitis index)ilk karakter dahil yazilan son karakter dahil degildir.
  ii)sunstring(int baslangic index )ilk karakter dahil geri kalan tum karakterleri Stringin sonuna kadar yazdirir.

 */

        String str = "Benim Tek Rakibim Dunku Ben";

        //Ex : Verilen str Datadaki ilk 5 karakteri yazdiriniz.
        System.out.println("str.substring(0,5) = " + str.substring(0, 5)); //Benim [0,5)
        System.out.println("str.substring(5) = " + str.substring(6));//Tek Rakibim Dunku Ben
        // Ex: Verilen str Datadaki 4.index dahil 7 index haric yazdiran kodu yaziniz
        System.out.println("str.substring(4,7) = " + str.substring(4, 7));//m T
        //Ex : str String'indeki Datadan "Rakib" kelimesini veren kodu yaziniz
        System.out.println("str.substring(10,15) = " + str.substring(10, 15));//Rakib

        System.out.println("str.substring(10) = " + str.substring(10));//Rakibim Dunku Ben
        // Verilen String Datadaki sadece meyve isimlerini yazdiran kodu olusturunuz
        String cumle ="Ben erik, oglum muz ,kizim sever cilek";//(4,8)  (16,19) (33
        String erik = cumle.substring(4,8);
        String muz = cumle.substring(16,19);
        String cilek = cumle.substring(33);

        System.out.println("meyve isimleri  = " + erik+" "+muz+ " "+cilek);





    }//main

}//class
