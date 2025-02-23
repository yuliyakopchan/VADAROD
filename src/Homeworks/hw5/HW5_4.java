package Homeworks.hw5;

import java.util.Scanner;

public class HW5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        int a = in.nextInt();

        while (a != 0) {
            int digit = a % 10;
            a /= 10;
            if (digit%2==0){
                System.out.println("четная цифра "+ digit);}
            else {
                System.out.println("нечетная цифра "+ digit);}
                }

            }
        }


//Ввести число с консоли, которое не заканчивается на 0.
//Вывести чётные и нечётные числа через while and if. Использовать оператор %.