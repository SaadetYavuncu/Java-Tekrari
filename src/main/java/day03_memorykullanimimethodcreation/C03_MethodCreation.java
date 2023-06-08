package day03_memorykullanimimethodcreation;

public class C03_MethodCreation {


    public static void main(String[] args) {
/*
    methodlar main disinda olusturulur.
    Access  + static + Return Type+ MethodIsmi+ (argumanlar)+ { }
    Modifier
 */
        // Ex: Verilen iki sayiyi toplayan bir method olusturunuz
        toplamaYap(55,10);
        // Ex: Verilen iki sayiyi carpan bir method olusturunuz
        System.out.println("carpmaYap ==> "+carpmaYap(5,8));
        // Ex : Dikdortgenin alanini hesaplayan methodu olusturunuz
        System.out.println("dikdortgeninAlani ==> "+dikdortgeninAlani(6, 90));
        //EX : Verilen bir ondalikli sayinin kupunu yazdiran methodu olusturunuz  7.8 verilsin

        kupunuAl(7.8);
        // Ex : Dikdortgenin Cevresini hesaplayan methodu olusturunuz
        System.out.println("dikdortgeninCevresi ==> "+dikdortgeninCevresi(6, 90));

        //faktöriyel hesepla 4!

        factorialHesapla(4);

    }//main

    private static void factorialHesapla(int i) {
        int num;
        for (num = 1; i > 1; i--) {
            num = num * i;
        }
        System.out.println("num = " + num);
    }

    private static short dikdortgeninCevresi(int a, int b) {
        return (short) (2*(a+b));
    }

    static void kupunuAl(double a) {
        System.out.println("kupunuAl ==> "+a*a*a);
    }

    public static double dikdortgeninAlani(int a, int b) {
        return a*b;
    }

    private static int carpmaYap(int a, int b) {

        return a*b;
    }
    public static void toplamaYap(double a, double b) {
        System.out.println("toplamaYap ==> "+(a+b));
    }

}//class