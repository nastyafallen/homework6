package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Массив массива
        char[][] box = new char[4][4];
        for (int i = 0; i < box.length; i++) {
            for (int a = 0; a < box[0].length; a++) {
                System.out.print(box[a][i] + " ");
            }
            System.out.println();

        }

    // Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " + ");
            }
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    // Задание 2
        Arrays.sort(arr);
        int maxNumber = arr[arr.length - 1];
        int minNumber = arr[0];
        System.out.println("Максимальная сумма трат за день составила = " + maxNumber + " рублей");
        System.out.println("Минимальная сумма трат за день составила = " + minNumber + " рублей");

    // Задание 3
        double sumDaily = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила = " + sumDaily + " рублей");

    // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
