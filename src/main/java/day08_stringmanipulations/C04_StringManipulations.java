package day08_stringmanipulations;

public class C04_StringManipulations {
    public static void main(String[] args) {
        //****************replaceAll()****************\\

        /*
        Bir grup datayid degistirmek icin replaceAll() methodu kullanilir
        Bir grup dataya Regular Expression (Regex) kulanilir

        En cok kullanilan Regexler
        1) Tum Rakamlar ==> [0-9]
        2) Tum kucuk harfler ==>[a-z]
        3) Tum buyuk harfler ==>[A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Tum harfler+rakamlar ==>[A-Za-z0-9]
        6) Tum sesli harfler ==>[aeiouAEIOU]
        7) Tum noktalama isaretleri ==>\\p{Punct}  ==>punctuation noktalama isareti
        8) Tum spaceler ==>[ ]


        ^==> den farkli ; haricinde
        1) Tum Rakamlar Haricinde ==> [^0-9]
        2) Tum kucuk harfler Haricinde ==>[^a-z]
        3) Tum buyuk harfler Haricinde==>[^A-Z]
        4) Tum harfler Haricinde==> [^a-zA-Z]
        5) Tum harfler+rakamlar Haricinde==>[^A-Za-z0-9]
        6) Tum sesli harfler Haricinde==>[^aeiouAEIOU]
        7) Tum noktalama isaretleri Haricinde==>[^\\p{Puncht}] ya da [\\P{P}] ==>punchtuation noktalama isareti
        8) Tum spaceler ==>[ ]

         */

        //Ex :  s String'indeki tum rakamları '*' ceviriniz.
        String s = "Mehmet QA DEV kursunda 23 yasinda 110000$ kazanmistir...";
        System.out.println(s.replaceAll("[0-9]", "*"));
        //once degisecek data sonra ne getirelecegi yazilir
        //Mehmet QA DEV kursunda ** yasinda ******$ kazanmistir...

        //Ex : s String'indeki Datada  tum harflerin ve rakamların yerine '@' yerlestiriniz
        System.out.println(s.replaceAll("[A-Za-z0-9]", "@"));
        //@@@@@@ @@ @@@ @@@@@@@@ @@ @@@@@@@ @@@@@@$ @@@@@@@@@@@...

        //Ex : s String'indeki tum space'ler disindaki karakterleri '+' işareti ile degistiriniz
        System.out.println(s.replaceAll("[^ ]", "+"));
        //++++++ ++ +++ ++++++++ ++ +++++++ +++++++ ++++++++++++++

        //Ex : s String'indeki tum kucuk harf'ler disindaki karakterleri '*' işareti ile degistiriniz
        System.out.println(s.replaceAll("[^a-z]", "*"));
        //*ehmet********kursunda****yasinda*********kazanmistir***

        //Ex : s String'indeki tum sesli harf'ler disindaki karakterleri '&' işareti ile degistiriniz
        System.out.println(s.replaceAll("[^aeiouAEIOU]", "&"));
        //&e&&e&&&A&&E&&&u&&u&&a&&&&&a&i&&a&&&&&&&&&&a&a&&i&&i&&&&


    }
}
