package Homeworks.hw5;

import java.util.Scanner;

public class HW5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        int a = in.nextInt();

        int number = 0;

        while (a != 0) {
            int lastDigit = a % 10;
            number = number * 10 + lastDigit;
            a /= 10;}
        System.out.println("Число в обратном порядке: " + number);
    }
}
//Ввести число с консоли, которое не заканчивается на 0.
//Вывести число в обратном порядке.
// Использовать оператор %. (цикл while,наподобие задачи, которую разбирали в конце занятия)