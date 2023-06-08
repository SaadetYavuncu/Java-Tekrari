package day05_wrapperClassConcatenationMantikOperatorleri;

public class C01_WrapperClass {


    /*

    Wrapper Class = Sarip Sarmalamak durum demektir.primitive Data Type'lari methodlara sahip
                    olmadi icin Java ara bir cozum uretmistir.Icerisinde hem method hemde
                    Data barindirabilen Wrapper Class'lari olusturmustur. Wrapper Class'lar
                    Non-Primitive Data Type'laridir.

    Primitive       WrapperClass
    byte            Byte
    short           Short
    int             Integer ******
    long            Long
    float           Float
    double          Double
    boolean         Boolean
    char            Character *****

     */
    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = primitiveByte;
        System.out.println(primitiveByte);


        // Ex : byte data type'inin max ve min degerlerini ekrana yazdiriniz

        System.out.println("BYTE min:"+Byte.MIN_VALUE);//-128
        System.out.println("BYTE max:"+Byte.MAX_VALUE);//127
        // short int long data type'larinin max ve min degerlerini ekrana yazdiriniz
        System.out.println("Short max:"+Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println("Integer max:"+Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//2147483648
        System.out.println("Long max:"+Long.MAX_VALUE);//9223372036854775807
        System.out.println(Long.MIN_VALUE);//-9223372036854775808


        // *********************** Autoboxing Primitive Data Type'larinin Wrapper Class'lara cevrilmesine denir ********************
        float primitiveFloat= 5.68F;// kucuk kutu
        Float wrapperFloat = primitiveFloat;//buyuk kutuya yerlestirildi
        System.out.println(wrapperFloat);

        // ************************ Unboxing Wrapper Classlarin Primitive Data TYpe'larina Cevrilmesine Unboxing denir *****************

        Character ch = 'A';
        char primitiveCh = ch;
        System.out.println(primitiveCh);


        // Ex Verilen iki String Datanin toplamini veren kodu yaziniz
        String gomlek1 = "500";
        String gomlek2 = "650";
        System.out.println(gomlek1 + gomlek2);//500650  2 String Data arasinda + oldugu icin
        // yan yana yazdirma Concatination yapar

        System.out.println(Integer.valueOf(gomlek1) + Integer.valueOf(gomlek2));//1150

        // Wrapper Boolean'i primitive boolean'a ceviren kodu yaziniz ==> Unboxing
        Boolean yasliMi = false;
        boolean primitiveBoolean = yasliMi;
        System.out.println(primitiveBoolean);


    }//main
}//class