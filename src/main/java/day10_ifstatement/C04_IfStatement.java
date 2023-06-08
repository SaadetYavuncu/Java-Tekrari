package day10_ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //Kullanıcıdan gün isimlerini alınız
        //HaftaIci mi HaftaSonu mu oldugunu yazdıran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String day = input.nextLine();

        /*
        String datalar icin == sembolu hem degree hemde referance 'a yani adrese baktigi icin dogru calismaz
        Bu nedenle String datalarin birbirine esit olup olmadıgını equals() methodu ile kontrol ederiz...
         */

        if (day.equalsIgnoreCase("PAZAR")) {
            System.out.println("hafta sonu.");
        } else if (day.equalsIgnoreCase("pazartesi")) {
            System.out.println("Hafta ici");
        } else if (day.equalsIgnoreCase("sali")) {
            System.out.println("Hafta ici");
        } else if (day.equalsIgnoreCase("carsamba")) {
            System.out.println("Hafta ici");
        } else if (day.equalsIgnoreCase("persembe")) {
            System.out.println("Hafta ici");
        } else if (day.equalsIgnoreCase("cuma")) {
            System.out.println("Hafta ici");
        } else if (day.equalsIgnoreCase("cumartesi")) {
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Lutfen bir gun ismi giriniz.");
        }

        //2.Yol

        if (day.equalsIgnoreCase("Cumartesi") || day.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta Sonu");
        } else if (day.equalsIgnoreCase("Pazartesi") ||
                day.equalsIgnoreCase("Sali") ||
                day.equalsIgnoreCase("Carsamba") ||
                day.equalsIgnoreCase("Persembe") ||
                day.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici");

        }else {
            System.out.println("Lutfen bir gun ismi giriniz.");
        }

        //3.Yol

        boolean haftaIci = day.equalsIgnoreCase("Pazartesi") ||
                day.equalsIgnoreCase("Sali") ||
                day.equalsIgnoreCase("Carsamba") ||
                day.equalsIgnoreCase("Persembe") ||
                day.equalsIgnoreCase("Cuma");

        boolean haftaSonu = day.equalsIgnoreCase("Cumartesi") ||
                day.equalsIgnoreCase("Pazar");

        if (haftaIci){
            System.out.println("HaftaIci");
        } else if (haftaSonu) {
            System.out.println("HaftaSonu");
        }else {
            System.out.println("Lutfen bir gun ismi giriniz.");
        }
    }
}