package Homeworks.hw4;

import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите с");
        int c = in.nextInt();
        if (a % 2 == 0 & a % 5 == 0) {
            System.out.println("Число " + a + " делится на 2 и на 5 без остатка");
        }
        else if (b % 2 == 0 & b % 5 == 0) {
            System.out.println("Число " + b + " делится на 2 и на 5 без остатка");
        }
        else if (c % 2 == 0 & c % 5 == 0) {
            System.out.println("Число " + c + " делится на 2 и на 5 без остатка");
        } else{
            System.out.println("Ни одно из введенных чисел не делится на 2 и на 5 без остатка");
        }

    }

}
//На вход даны 3 числа. Вывести в консоль только те числа,
//которые делятся на 2 и на 5
//(используйте оператор % для проверки деления без остатка)