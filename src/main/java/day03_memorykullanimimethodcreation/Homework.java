package day03_memorykullanimimethodcreation;

public class Homework {
    public static void main(String[] args) {
        // 1) Dairenin Cevresini hesaplayan methodu int return type ile
        System.out.println("Dairenin Cevresi : " + daireninCevresi(6));// (2*3.14*r)


        // 2) Dairenin Alanini hesaplayan methodu void return type ile olusturunuz
        daireninAlanı(6); //(3.14*r*r)

    }

    private static void daireninAlanı(int r) {
        System.out.println("DaireninAlanı : " +(3.14*r*r));
    }

    private static int daireninCevresi(int r) {
        return (int) (2*3.14*r);
    }
}
