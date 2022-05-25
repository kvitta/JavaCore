package Lesson_4;
import java.util.*;
public class Words {

    public static void  main (String [] args){
        ArrayList<String> words = new ArrayList<>();//Создаем массив со слвовами
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        HashSet<String> hashWords = new HashSet<String>(words);//выводим список уникальных слов
        System.out.println(hashWords);//Выводим его в консоль

        Map<String, Integer> map = new HashMap<>();//создаем map
        for (String word : words) {//проходимся по созданному массиву циклом и
            map.put(word, map.getOrDefault(word, 0) + 1);// добавляем его элементы в map,
            //за ключ берем слово, а за value- в первом появлении дефолтное значение -0,
            // (т.к. мы указали изначальное только ключи) и к нему плюсуем 1
            // при втором появлении  значение для слова будет уже изместо и метод getOrDefault  вернет его(1)
            // и к нему снова плюсуем 1, и так до конца элементов.
        }
        System.out.println(map);// Выводим карту в консоль




    }


}
