package com.company;

public class Main {

    public static void kvadrati() {
        final int x = 5;
        final int y = 5;
        final int width = 10;
        final int height = 10;
        Rectangle rectangle = new Rectangle(x, y, width, height);
        Square square = new Square(x, y, width, height);
        System.out.println(rectangle);
        System.out.println(square);
    }

    public static void Overload() {
        OverloadDemo overloadDemo = new OverloadDemo();
        double result;
        overloadDemo.test();
        overloadDemo.test(10);
        overloadDemo.test(10, 20);
        result = overloadDemo.test(123.25);
        System.out.println("Результат вывода ob.test(123.25): " + result);
    }

    public static void PassOb(){
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);
        System.out.println("ob1 == ob2: "+ ob1.equals(ob2));
        System.out.println("ob1 == ob3: "+ ob1.equals(ob3));
    }

    public static void RetOb(){
        Test2 ob1 = new Test2(2);
        Test2 ob2;
        ob2 = ob1.incrByTen();
        System.out.println(ob1);
        System.out.println(ob2);
        ob2=ob2.incrByTen();
        System.out.println(ob2);
    }

    public static void Recursion(){
        Factorial f = new Factorial();
        System.out.println("Факториал 3 равен "+ f.fact(3));
        System.out.println("Факториал 4 равен "+ f.fact(4));
        System.out.println("Факториал 5 равен "+ f.fact(5));
    }


    public static final int FILE_NEW = 1;
    public static final int FILE_OPEN = 2;
    public static final int FILE_SAVE = 3;
    public static final int FILE_SAVEAS = 4;
    public static final int FILE_QUIT = 5;
    public static void FinalUse(){

        /* Поскольку это final - его изменять нельзя
        FILE_NEW=FILE_NEW+1;
        Так делать не нужно
         */
        System.out.println("Use final FILE_NEW: "+FILE_NEW);
        System.out.println("Use final FILE_OPEN: "+FILE_OPEN);
        System.out.println("Use final FILE_SAVE: "+FILE_SAVE);
        System.out.println("Use final FILE_SAVEAS: "+FILE_SAVEAS);
        System.out.println("Use final FILE_QUIT: "+FILE_QUIT);
    }

    public static void main(String[] args) {
        kvadrati();
        Simpleinheritance.doNasledovanie();
        Overload();
        PassOb();
        RetOb();
        Recursion();
        UseStatic.meth(42);
        FinalUse();
    }



}
