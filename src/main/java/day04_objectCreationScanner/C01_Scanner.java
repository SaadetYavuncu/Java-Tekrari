package day04_objectCreationScanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        //Kullnıcıdan Data Alabilmek için


        //1)input object olustururuz

        Scanner input = new Scanner(System.in); //Saadet

        /*//2)Kullanıcıyı yönlendirmeliyiz

        System.out.println("Lutfen adinizi giriniz: ");

        //3)Kullanıcıdan alınan Data'nın yapısına ve buyuklugune gore bir variable secilir.
        String name = input.next();

        //4)Kullanıcının verdigi bilgileri teyit edebilmesi için ekrana yazdirin.
        System.out.println(name);*/


        /*
        Kullaniciya adini, cinsiyetini, memleketini, yasini, boyunu,emekli
        olup olmadigini, maasini soran kodu yaziniz.
         */

        //2)Kullanıcıyı yönlendirmeliyiz

        System.out.println("Lutfen adinizi giriniz: ");

        //3)Kullanıcıdan alınan Data'nın yapısına ve buyuklugune gore bir variable secilir.
        String ad = input.nextLine();
        //next() ilk ismi alir ; nextLine() tum satiri alır

        System.out.println("Lutfen cinsiyetinizi giriniz: \nKadın icin 'K' , Erkek icin 'E' giriniz... ");
        char cinsiyet = input.next().charAt(0);

        System.out.println("Lutfen memleketinizi giriniz: ");
        String memleket = input.next();

        System.out.println("Lutfen yasinizi giriniz: ");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz: ");
        double boy =input.nextDouble();

        System.out.println("Emekli misin? \nEvetse True , Hayirsa False giriniz...");
        boolean emekli = input.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz: ");
        long maas = input.nextLong();

        System.out.println("************Saadet Yavuncu***************");
        System.out.println("ad = " + ad +" cinsiyet= "+cinsiyet+ " memleket: "+memleket+
                " yas: "+ yas+" boy: " +boy+ " emekli misin: "+emekli+ " maas: "+maas);


    }
}
