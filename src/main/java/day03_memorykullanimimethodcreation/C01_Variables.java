package day03_memorykullanimimethodcreation;

public class C01_Variables {
    public static void main(String[] args) {
        /*
        Non Primitive Data Types
        String : Isim adres,yazi iceren matematiksel islem yapilmayacaksa sayilar
                T.C kimlik numarasi gibi sayilar yerlestirilebilir.
                "" cift tirnak icerisinde yazilir.Java tarafindan uretilmistir.
                Non primitive Data Type oldugu icin icrisinde bir cok method barindirir.
         */
        String name="Saadet";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        int yas =40;
        System.out.println(yas);
        char cinsiyet='K';
        System.out.println(cinsiyet);
    }//main
}//class