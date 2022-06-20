package ru.gorban;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        int len = 2;
        int initialValue = 5;
        System.out.println("Здравствуйте, Сабина");
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        System.out.println("Задание №5!");
        taskFive( len, initialValue );
        System.out.println(Arrays.toString(taskFive(len, initialValue)));
        System.out.println("Спасибо за проверку!");
    }

    public static void taskOne() {
        int[] taskOne = {1, 1, 0, 0, 0};
        System.out.println("Задание №1");
        System.out.println("Данные до преобразования" + Arrays.toString(taskOne));
        for (int i = 0; i < taskOne.length; i++) {
            if (taskOne[i] == 1) {
                taskOne[i] = 0;
            } else {
                taskOne[i] = 1;
            }
        }
        System.out.println("Данные после преобразования" + Arrays.toString(taskOne));
    }

    public static void taskTwo() {
        System.out.println("Задание №2");
        int[] taskTwo = new int[100];
        for (int i = 0; i < taskTwo.length; i++) {
            taskTwo[i] = i + 1;
        }
        System.out.println("Данные после преобразования" + Arrays.toString(taskTwo));
    }

    public static void taskThree() {
        System.out.println("Задание №3");
        int[] taskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Данные до преобразования" + Arrays.toString(taskThree));
        for (int i = 0; i < taskThree.length; i++) {
            if (taskThree[i] < 6) {
                taskThree[i] = taskThree[i] * 2;
            }
        }
        System.out.println("Данные после преобразования" + Arrays.toString(taskThree));
    }

    public static void taskFour() {
        System.out.println("Задание №4");
        int a = 1;
        int[][] taskFour = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taskFour[i][j] = a;
                System.out.print(taskFour[i][j] + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static int[] taskFive(int len, int initialValue) {
        int[] taskFive = new int[len];
        Arrays.fill(taskFive, initialValue);
        return taskFive;
    }
}

