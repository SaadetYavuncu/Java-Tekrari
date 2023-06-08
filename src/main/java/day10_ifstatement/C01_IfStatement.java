package day10_ifstatement;

public class C01_IfStatement {
    public static <count> void main(String[] args) {

        //INTERVİEW QUESTİONS

        // Verilen String'deki tekrarsiz karakterleri ekrana yazdiriniz


        String str = "abbccdc";
        String tekrarsızKarakter = "";

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {

                tekrarsızKarakter += ch;
            }

        }
        System.out.println("Tekrarsiz karakterler = " + tekrarsızKarakter);

         /*
         if Statement : Bazi kodlarin calismasi belirli sartlara baglidir.
            Bu durumda if Statement yapisi kullanilir.
            Duzenli ,disiplinli calisirsam ; iyi bir IT'ci olacagim.

            if(Duzenli ,disiplinli calisirsam){
                iyi bir IT'ci olacagim.
        }
            */


        // Verilen sayi pozitif ise ekrana "Pozitif" yazdiran kodu olusturun

        int sayi = -50;
        if (sayi > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Negatif");
        }

        //Ex : -1 ile 10 arasinda ekrana "Rakam" yazdiran kodu yaziniz.

        int number = 2;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }


        //Ex : Sayi uc basamaklı ise ekrana 3 basamakli yazdiran kodu olusturunuz

        int n = -236;
        n = Math.abs(n);
        if (n > 99 && n < 1000) {
            System.out.println("Sayı 3 Basamakli");
        } else {
            System.out.println("Hatalı Basamakli");
        }


    }
}