package Lesson_5;

import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {

            AppData appData = new AppData();
            appData.take("forDataApp.txt");//берем данные из файла

            System.out.println(Arrays.toString(appData.getHeader()));//выводим Header
            System.out.println(Arrays.deepToString(appData.getData()));//выводим data

            appData.save("forDataAppNew.txt");// созраняем данные в файл
        }
    }

