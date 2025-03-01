package Homeworks.hw4;

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();

        double result = 15.0/x;
        switch ((int)result){ //Результат приводится к int (целому числу).Switch оператор в Java может работать только с целочисленными типами (byte, short, int, char), строками (String) и перечислениями (enum).
            case 3:System.out.println("Результат деления равен 3");
            break;
            case 5: System.out.println("Результат деления равен 5");
            break;
            default:
                System.out.println("Результат деления равен дробному числу " +  result);

        }

    }
}
//Дано 15/x=result, где x-число, которое вводится с командной строки,
// result-результат вычисления.
// Написать программу, которая будет выводит разный текст, в зависимости от значения result.
// В случае result=3, вывести: "Результат деления равен 3"
// В случае result=5вывести: "Результат деления равен 5"
// В других случаях вывести: "Результат деления равен дробному числу".
// При этом в последнем случае вывести точный результат деления (использовать приведение типов)
// Для выполнения задания использовать оператор switch- case.