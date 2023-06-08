package day07_incrementDecrementStringManipulations;

public class C01_AsciiValue {
    public static void main(String[] args) {

        // Verilen bir karakterin Ascii Degerini Hesaplatan kodu yaziniz

        char ch = '*';
        asciiHesapla(ch);

    }//main

    private static void asciiHesapla(char ch) {

        int asciiValue = ch;
        System.out.println("Ascii value: " + ch + " karakter için "+asciiValue);
    }
}//class
