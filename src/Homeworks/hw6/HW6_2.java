package Homeworks.hw6;

public class HW6_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int l : array2) {
            System.out.print(l + " ");
        }
    }
}

// Создать массив из 5 чисел и заполните этот массив вручную.
// Создайте второй массив с размерностью больше на 1 чем первый массив.
// Необходимо скопировать первый массив со всеми значениями во второй массив.
// Последний элемент во втором массиве пусть будет 0.
// Выведите второй массив в консоль с помощью цикла for each.