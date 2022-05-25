package Lesson_4;

import java.util.*;

public class PhoneBook {
    private Map<Integer, String> map;

    public PhoneBook (){
        this.map = new HashMap<>();
    }
    public void add (Integer number,String lastName ){
        map.put(number,lastName);

}
    public void get(String lastName) {
        Set<Map.Entry<Integer, String>> set = map.entrySet();// передаем Entry(пару ключ-значение)из map в Set set
            for (Map.Entry<Integer, String> temp : set) {//проходимся по set
                if (temp.getValue().equals(lastName)) {//и если значение равно lastName
                    System.out.println(temp.getValue() + " : " + temp.getKey());// то выводим в консоль значение и соответствующий ключ
                }

            }

        }

    public static void main (String[] args){
         PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(555555, "Иванов");
        phoneBook.add(555556, "Иванова");
        phoneBook.add(555557, "Сидоров");
        phoneBook.add(555558, "Иванов");
        phoneBook.add(555559, "Петров");

        System.out.println("Поиск по фамилии");
        phoneBook.get("Иванов");
    }
}
