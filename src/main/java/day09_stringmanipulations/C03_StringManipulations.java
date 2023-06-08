package day09_stringmanipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {

//  Ex  : Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//           i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli


        String sifre = "B46d$ Y*b";

        //i)Space haric en az sekiz karakter olmali
        boolean first = sifre.replace(" ","").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = sifre.replaceAll("[a-zA-Z0-9]","").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = sifre.replaceAll("[^0-9]","").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = sifre.replaceAll("[^A-Z]","").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = sifre.replaceAll("[^a-z]","").length()>0;

        boolean gecerli = first&&second&&third&&fourth&&fifth;

        System.out.println("gecerli : " + gecerli);

      /* System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);*/
    }
}
