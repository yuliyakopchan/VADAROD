package Homeworks;

public class HW2 {
    public static void main(String[] args) {
//        Task1
//        Дано уравнение x/6+25=98. Найти x и вывести его в консоль
        int y = 25;
        int sum = 98;
        int i = sum - y;   //x/6=i
        int x = i * 6;
        System.out.println("x = " + x);

//        //Task2
//        // x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, чтобы результат не изменился. x=8; y=9; z=12;
//        // (операции присваивания, нужно просто написать по-другому)
        int r=8;
        int l =9;
        int z=12;
        r+=3;
        l*=9;
        z-=6;
        System.out.println("r = " + r);
        System.out.println("l = " + l);
        System.out.println("z = " + z);
//        //  или System.out.println(x+ " " +y+ " " +z+" ");


//        //Task3
//        // Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 иначе, присвоить числу c значение 10.
//        // (тернарный оператор)
//
        int a =35;
        int b =65;
        int c = a > b ? 5:10;
        System.out.println("c = " + c);

        //Task4
        //Даны значения: x=5; y=2; c=x*y;
        // Расставьте операции инкремента декремента так,
        // чтобы после выполнения операции (c=x*y) с равнялось 12, x=равнялось 6, y=1
        // Выведите полученные значения в консоль.
        int inc=5;
        int dec=2;
        int result=++inc*dec--;
        System.out.println("inc = " + inc + " "+ "dec = "+ dec + " " + "result = " + result + " ");

    }
    }





