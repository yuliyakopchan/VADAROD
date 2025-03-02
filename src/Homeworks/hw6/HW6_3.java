package Homeworks.hw6;

import java.util.Arrays;

public class HW6_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
       int max = 0;
       int min =0;
       for(int i=0; i < array.length; i++){
           if (array[i]> max){
               max=i;
           }
           if (array[i]< min){
               min = i;
           }
        }
        array[max] = 1000;
        array[min] = -1000;
        System.out.println(Arrays.toString(array));
    }
}
//*Создать массив вручную.
// Заменить максимальный и минимальный элемент массива.
// Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.