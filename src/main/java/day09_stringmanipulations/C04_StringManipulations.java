package day09_stringmanipulations;

public class C04_StringManipulations {
    public static void main(String[] args) {

        //Bir String Datadaki noktalma işaretlerinin sayisini veren kodu yaziniz.

        String cumle = "Sen@ yok musun?, sen!...";

        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println("number =" + number);
        
        //******************indexOf()****************\\
        /*
        Verilen karakter ya da karakterlerin ilk gorunumunun ibdex'ini verir.
        Tek karakter icinde coklu karakter icinde kullanilabilir.
        Coklu karakterde ilk karakterin indexi dondurur
         */

        //Ex:
        String str = "Kara kara dusunme Ankara";

       int index = str.indexOf("kara");
        System.out.println("index = " + index);


        //******************lastIndexOf()****************\\

        /*
        Verilen karakterin son gorunumunun indexini verir.

         */
        int lastIndex = str.lastIndexOf("kara");
        System.out.println("lastIndex = " + lastIndex);
        
        String s = "Mississippi";
        int idx = s.indexOf('i');
        System.out.println("idx = " + idx);
        
        int lastidx = s.lastIndexOf('i');
        System.out.println("lastidx = " + lastidx);



        //Interview sorusu

       /* Bir String'deki bir character'in tekrarli veya tekrarszi
       olup olmadigini gosteren kodu yaziniz
       "Helloooo" ==> H-->Tekrarsiz     e-->Tekrarsiz     l-->Tekrarli     o-->Tekrarli
            */

        String t = "Helloooo";

      /* char ch ='l';
       if(t.indexOf(ch )== t.lastIndexOf(ch)){
           System.out.println("ch = " + "Tekrarsız");
       }else {
           System.out.println("ch = " + "Tekrarli");
       }*/

        for (int i=0; i<t.length()-1; i++){
            char ch = t.charAt(i);

            if(t.indexOf(ch )== t.lastIndexOf(ch)){
                System.out.println(ch + " = Tekrarsız");
            }else {
                System.out.println(ch  + " = Tekrarli");
            }
        }


    }
}
