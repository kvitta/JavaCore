package Lesson_3;

import java.util.Arrays;

public class ElementsSwapPlaces <T> {
   private T[] newArray;


    public ElementsSwapPlaces (T...newArray){
    }

    @Override
    public String toString() {
        return "ElementsSwapPlaces{" +
                "newArray=" + Arrays.toString(newArray) +
                '}';
    }

    public static void main(String[] args){
        ElementsSwapPlaces <Integer> newArray = new ElementsSwapPlaces<>(1,2,3,4,5);
        System.out.println(Arrays.toString(newArray);
        newArray.splice
    }
}
