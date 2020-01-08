package com.company;

public class UseStatic {
   private static int a =3;
   private static int b;

    public static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    static{
        System.out.println ( "Cтaтичecкий блок инициализирован .") ;
        b = a * 4;
    }
}
