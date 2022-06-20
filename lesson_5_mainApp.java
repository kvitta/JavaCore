package ru.gorban;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;
import java.util.logging.Filter;

class lesson_5_mainApp {
    public static void main(String[] args) {
        System.out.println("Информация о сотрудниках: ");
        lesson_5_employees[] empArray = new lesson_5_employees[5];
        empArray[0] = new lesson_5_employees("Иванов", "Иван", "Иванович", "director", "ivanov@mail.ru", "555555", 800, 45);
        empArray[1] = new lesson_5_employees("Петров", "Петр", "Петрович", "deputy director", "petrov@mail.ru", "555666", 700, 39);
        empArray[2] = new lesson_5_employees("Степанов", "Степан", "Степанович", "accountant", "stepanov@mail.ru", "555777", 600, 43);
        empArray[3] = new lesson_5_employees("Сидорова", "Светлана", "Григорьевна", "sales director", "sidorova@mail.ru", "555888", 500, 41);
        empArray[4] = new lesson_5_employees("Козлов", "Артем", "Петрович", "manager", "kozlov@mail.ru", "555999", 400, 35);
        System.out.println();
        System.out.println("Возраст сотрудников: ");
        for (int i = 0; i < empArray.length; i++) {
            System.out.println(empArray[i].getSurname() + " "+ empArray[i].getAge());
        }
        System.out.println();
        System.out.println("Сотрудники старше 40: ");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                System.out.println(empArray[i]);
            }


        }

    }
}


