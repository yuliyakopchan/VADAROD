package Homeworks.hw6;

public class HW6_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int l : array) {
            System.out.print(l + " ");
        }
        System.out.println();
        for (int r : array) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    array[i] = 0;
                }
            }
            System.out.print(r + " ");
        }
    }
}

//Создать массив из 10 элементов.
// Заполните массив числами и вывести их в консоль(выводите через цикл for each).
//Замените каждый элемент с нечётным индексом на ноль.
// Выведите полученный массив в консоль через цикл for each.