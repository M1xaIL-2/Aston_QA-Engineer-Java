package com.company;
import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Задаём массив целых чисел
        for (int x = 0; x < myArr.length; x++) {      // задаём условия цикла по всему массиву
            if (myArr[x] % 2 == 0)  // проверка каждого числа из массива на чётность (деление на 2 без остатка) число 0 можно не проверять
                System.out.print(myArr[x] + " чётное число" + "; ");  // вывод в консоль подходящие данные
        }
    }
}