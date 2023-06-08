package day09_stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {

           /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
            i)mail adresi "gmail" icermeli
            ii)Space characteri mail'de olmamali
            iii)mail adresinde buyuk harf olmamali
            iv)En az bir tane noktalama isareti bulunmali
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi i)mail adresi \"gmail\" icermeli\n" +
                "            ii)Space characteri mail'de olmamali\n" +
                "            iii)mail adresinde buyuk harf olmamali\n" +
                "            iv)En az bir tane noktalama isareti bulunmali seklinde veriniz ");
        String mail = input.nextLine();

        //i)mail adresi "gmail" icermeli

        boolean first = mail.contains("gmail");
        System.out.println("first = " + first);

        //ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");//mail variable'ının icindeki data space icermiyor mu?
        System.out.println("second = " + second);

        //iii)mail adresinde buyuk harf olmamali
        boolean third = mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replace(" ","").
                length()==0;
        System.out.println("third = " + third);

        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[^\\p{Punct}]","").
                              length()>0;
        System.out.println("fourth = " + fourth);
        System.out.println(first && second && third && fourth);

    }
}
