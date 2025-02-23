package Homeworks.hw5;

import java.util.Scanner;

public class HW5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();

        int sum = 0;
        while (a<=b){
            sum=sum+a;
            a++;
        }
        System.out.println(sum);
    }
}


//Ввести 2 положительных числа с консоли с помощью сканера.
// Вывести сумму всех чисел от одного числа до другого.
// (Используйте цикл while).
// Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.