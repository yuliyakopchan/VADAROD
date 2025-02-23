package Homeworks.hw5;

public class HW5_1 {
    public static void main(String[] args) {

        int b=100;
        for ( int i =1; i<=b; i++){
            if (i%3==0 || i%7==0){
                System.out.println(i);
            }
        }

    }
}
//Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)