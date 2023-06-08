package day04_objectCreationScanner;

public class Runner {
    public static void main(String[] args) {

        //Obje nasıl olusturulur?

          Car           corolla     =    new        Car();
     //Class ismi     Object ismi        new    Constructor() ==Anne,muteahit

        System.out.println(corolla.fiyat);
        System.out.println(corolla.model);
        corolla.hareket();
        corolla.dur();
        corolla.vitesDegistir(2);

        Student saadet = new Student();
        System.out.println(saadet.name);
        System.out.println(saadet.grade);
        System.out.println(saadet.adress);
        saadet.study();
        saadet.feed();
        saadet.sleep();

    }//Main
}//Class
