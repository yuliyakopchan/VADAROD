package Homeworks.hw4;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите с");
        int c = in.nextInt();
         if (a%2==0){
             System.out.println("Число " + a + " четное");
         }
         else if (b%2==0){
             System.out.println("Число " + b + " четное");
         }
         else if (c%2==0){
             System.out.println("Число " + c + " четное");
         }else {
             System.out.println("Ни одно из введенных чисел не является четным");
         }


    }
}


//На вход даны 3 числа. Вывести в консоль только четные числа