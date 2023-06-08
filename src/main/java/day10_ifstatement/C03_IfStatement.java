package day10_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        // Kullanıcı gün numarasını girsin kod gun ismini yazsın
        //INPUT 1==>Pazar 2==>Pazartesi ......6==>Cuma 7==>Cumartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz... \n 1:Pazar" +
                "2:Pazartesi 3:Sali" +
                "4:Carsamba 5:Persembe" +
                "6:Cuma 7:Cumartesi");
        byte gun = input.nextByte();

        if (gun == 1) {
            System.out.println("Pazar");
        } else if (gun == 2) {
            System.out.println("Pazartesi");
        } else if (gun == 3) {
            System.out.println("Salı");
        } else if (gun == 4) {
            System.out.println("Carsamba");
        } else if (gun == 5) {
            System.out.println("Persembe");
        } else if (gun == 6) {
            System.out.println("Cuma");
        } else if (gun == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Lutfen gecerli bir gun numarası giriniz\n  1:Pazar\"\n" +
                    " \"2:Pazartesi 3:Sali\"+\n" +
                    " \"4:Carsamba 5:Persembe\"+\n" +
                    " \"6:Cuma 7:Cumartesi\"");
        }

    }
}
