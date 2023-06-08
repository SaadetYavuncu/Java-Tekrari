package day11_nestedifternary;

public class C04_NestedIf {
    public static void main(String[] args) {
          /*
    Password'un ilk karakteri harf olmali
    ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdirin;
     degilse gecersiz password yazdirin.
    Passwordun ilk harfi kucuk harf ise
    'z' olursa gecerli password yazdirin;
    degilse gecersiz password yazdirin.

    A ==> gecerli
    B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z==> gecersiz

    a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y ==> gecersiz
    z ==>gecerli

     */
        String pwd = "Ady 59?";
        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {//A B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z
            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {//a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y z
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        } else {
            System.out.println("Ilk Karakter Harf Olmali");
        }
    }
}
