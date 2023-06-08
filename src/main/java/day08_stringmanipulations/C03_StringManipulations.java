package day08_stringmanipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {

        //***************replace() ****************\\

        /*
        Metnin icerisindeki bir karakter ya da karakterlerin yerine baska
        bir karakter ya da karakterlerin yerlestirilmesini saglar
        bizr string data dondurur
         */

        //Ex : s String' inde "money" kelimesi yerine "dolar" kelimesi yerlestiriniz
        String s = "Learn Java earn money";
        System.out.println(s = s.replace("money", "dolar"));
        //Learn Java earn dolar

        //Ex : s String' inde "a" harfini "*" ile degidtiriniz
        System.out.println(s.replace('a','*'));
        //Le*rn J*v* e*rn dol*r

        //Ex : s String' inde "L" harfini "***" ile degidtiriniz
        System.out.println(s.replace("L", "***"));
        //***earn Java earn dolar

        //Ex : s String' inde 'e' harfini siliniz
        System.out.println(s.replaceAll("e", ""));
        //Larn Java arn dolar

        //Ex : s String' inde 'earn' kelimesini siliniz
        System.out.println(s.replace("earn", ""));
        //L Java  dolar

        //Ex: t String'indeki "Kalem" kelimesi yerine "Dolma" yerleştiriniz.
        String t = "Dolma Kalem";
        System.out.println(t.replace("Kalem", "Dolma"));
        //Dolma Dolma


    }
}
