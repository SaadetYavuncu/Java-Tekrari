package day06_modulesTypeCastingAsciiValue;

public class C04_MatematikselIslemler {

    public static void main(String[] args) {

        System.out.println(4*(5+2)/3); //9

        System.out.println(6*16/8); //12

        double sonuc = (4*(5+2)/3);
        System.out.println(sonuc); //9.0 //Java soldan sağa dogru çalışır


        sonuc = (double)4*(5+2)/3;
        System.out.println("sonuc : " + sonuc); //9.3333333

        int sayi1 = 45;
        int sayi2 = 9;
        double sayi3 = 89.78;
        System.out.println(sayi1 + sayi2 + sayi3); //143.78

        int result = (int) (sayi1+sayi2+sayi3);
        System.out.println(result);//143

    }
}
