package Lesson_3.BoxesWithFruit;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Box <Apple> appleBox = new Box <>("Яблоки",5,1.0);//коробка с яблоками
        Box<Orange> orangeBox = new Box<>("Апельсины",10,1.5);//коробка с апельсинами
        Box <Apple> appleBox2 = new Box <>("Яблоки",3,1.0);//коробка 2 с яблоками
        Box<Orange> orangeBox2 = new Box<>("Апельсины",5,1.5);//коробка 2 с апельсинами
        appleBox.addFruit(10);// добавляем фрукты в выбранную коробку
        for (Box box: new Box[]{appleBox,orangeBox,appleBox2,orangeBox2}){// Считаем массу каждой коробки
            System.out.println("Вес коробки "+ box.getType() +" = "+ box.getWeightOfBox() + "кг.");
        }
        appleBox.compare(orangeBox);//сравниваем коробки по массе
        appleBox.pour(appleBox2);//пересыпаем фрукты, в соответствии с сортировкой
        //appleBox.pour(orangeBox);// для проверки, что метод не даст пересыпать яблоки к апельсинам
        orangeBox.pour(orangeBox2);//пересыпаем фрукты, в соответствии с сортировкой
        for (Box box: new Box[]{appleBox,orangeBox,appleBox2,orangeBox2}){// проверим вес коробок после пересыпания фруктов.
            System.out.println("Вес коробки "+ box.getType() +" = "+ box.getWeightOfBox() + "кг.");
        }


    }



}

