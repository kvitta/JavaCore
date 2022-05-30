package Lesson_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public AppData(){ //конструктор
    }

    public void save(String fileName) {//записываем данные в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(rowToString(header));// записываем данные из header, приведенные к стринге

            for (Integer[] row : data) {//записываем данные из data
                writer.write(rowToString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String rowToString(T[] row) {// приводим   Integer к String
        String result = "";// инициализируем пустую переменную

        for (int i = 0; i < row.length; i++) {// проходимся по переданному на вход массиву
            result = result + row[i].toString();// записываем элементы строчкой
            if (i != row.length - 1) {// Если это не последний элемент,
                result += ";";// то разделяем ";"
            }
        }
        result += "\n";
        return result;// возвращает стрингу из элементов массива
    }

    public void take(String fileName) {// метод чтобы взять данные из файла, на вход подаем имя файла
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {//читаем файл
            header = bufferedReader.readLine().split(";");//
            ArrayList<Integer[]> list = new ArrayList<>();// создаем интовый лист
            String temp;// темповая переменная
            while ((temp = bufferedReader.readLine()) != null) {// пока читается
                list.add(stringToDataRow(temp));// добавляем в list данные из стринги приведенные к integer
            }
            data = list.toArray(new Integer[][]{{}});//data - это наш list приведенный к двумерному массиву
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer[] stringToDataRow(String str) {// приводим String к Integer
        String[] strings = str.split(";");//делаем стринговый массив ,
        // куда подаем элементы из переданной строчки, разделенные ";"

        Integer[] integers = new Integer[strings.length];// создает массив из Integer длинной как стринговый масив
        for (int i = 0; i < strings.length; i++) {// и заполняем его
            integers[i] = Integer.parseInt(strings[i]); // разпарсенными данными из стрингового массива
        }
        return integers; // возвращает интовый массив
    }
    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }
}