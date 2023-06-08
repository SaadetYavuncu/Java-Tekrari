package day07_incrementDecrementStringManipulations;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        int a = 12;
        int b = a++;//Post Increment  Increment  Artirma Post = sonradan
        System.out.println(b);//13 12
        System.out.println(a);//13
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x);//14
        System.out.println(y);//15
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m);//22
        System.out.println(n);//22
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);//31
        System.out.println(u);//31
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int sayı = 10;
        sayı++;
        System.out.println(sayı);//11
        sayı++;
        System.out.println("pre-incrementten once " + sayı);//12
        System.out.println(" pre-increment satırında " + ++sayı);//13
        System.out.println("pre-incrementden  sonra" + sayı);//13

        System.out.println("post-increment satırında" + sayı++);//13
        System.out.println("post-incrementdan sonra " + sayı);//14
        System.out.println(9f / 2f);//4.5
        System.out.println(9 / 2);//4

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);
        System.out.println(num);

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;

        sayı2 = sayı1++;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//11,10,30

        sayı3 = ++sayı1;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//12 10 12    11 10 12

        System.out.println(sayı3++);//12

        System.out.println(--sayı2);//9

        System.out.println(sayı3++);//13

        System.out.println(sayı3);//14

        int c = 5;
        System.out.println(c);//5

        //Increment 1:
        c = c + 2;
        System.out.println(c);//7

        //Example 1: Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.
        int d = 10;
        System.out.println(d);//10
        // Birinci Yol
        d = d + 5;
        System.out.println(d);//15
        //Ikinci Yol Recomended Tercih Edilen Az Code cok is clean code onemlidir
        d += 5;
        System.out.println(d);//20

        //Decrement
        int e = 8;
        System.out.println(e);//8

        e = e - 3;
        System.out.println(e);//5

        e -= 3;
        System.out.println(e);//2

        //Increment 2:
        int f = 6;
        System.out.println(f);//6

        f = f * 2;
        System.out.println(f);//12

        f *= 2;
        System.out.println(f);//24

        //Decrement 2:
        int g = 24;
        System.out.println(g);//24

        g = g / 2;
        System.out.println(g);//12

        g /= 2;
        System.out.println(g);//6

        //"1" ile increment (artirma)
        int h = 12;


        //"1" ile decrement
        int j = 10;



        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++;

        System.out.println(k);//10
        System.out.println(i);//11

        int p = 15;
        System.out.println(p);//15
        int r = ++p;

        System.out.println(p);//16
        System.out.println(r);//16

        //"post-decrement" ve "pre-decrement"
        int number = 17;
        int v = number--;
        System.out.println(number);//17 16
        System.out.println(v);

        int s = 20;
        int finish = --s;//Pre Decrement
        System.out.println(s);//19
        System.out.println(finish);//19

    }
}
