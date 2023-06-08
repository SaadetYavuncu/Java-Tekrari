package day11_nestedifternary;

import java.util.Scanner;

public class C03_NestedIf {
    public static void main(String[] args) {
        // Ex: Kullanicidan bir ucgenin 3 kenar uzunlugunu aliniz
        // Herhangi iki kenar uzunlugu esit ise "Ikizkenar Ucgen"
        // Uc Kenari Esit ise "Eskenar"
        // tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen " yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 kenar uzunlugunu giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean ucgen = (a + b > c && c > Math.abs(a - b)) &&
                (a + c > b && b > Math.abs(a - c)) &&
                (b + c > a && a > Math.abs(b - c));

        /*
        if else yapisinda siralama onemlidir.
        Once ikizkenar olma durumuna baksaydik 5,5,5 gibi uc kenar esit datalar
        icin de ikizkenar diyecekti.Elek gibi en mukemmeliyetci
        kod bulogu en yukarida olmali.
         */
        if (a < 1 || b < 1 || c < 1) {
            System.out.println("Lutfen Gecerli bir Kenar Uzunlugu Giriniz");
        } else if (ucgen) {
            if (a == b && b == c && a == c) {
                System.out.println("Eskenar Ucgen");
            } else if (a == b || b == c || a == c) {
                System.out.println("Ikizkenar Ucgen");
            } else {
                System.out.println("Cesitkenar Ucgen");
            }

        } else {
            System.out.println("Ucgen Degildir");
        }
    }
}
