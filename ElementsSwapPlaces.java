package Lesson_3;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class ElementsSwapPlaces <T extends Number> {

    private T array;

    @Contract(pure = true)
    public ElementsSwapPlaces(T array) {
        this.array = array;

    }
    public static void main(String[] args) {
        ElementsSwapPlaces<Integer>[] array = new ElementsSwapPlaces[]{new ElementsSwapPlaces<>(1), new ElementsSwapPlaces<>(2)};
        System.out.println("Элементы массива до преобразования");
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------");
            ElementsSwapPlaces<Integer> a = array[0];
            array[0] = array[array.length - 1];
            array[1] = a;
        System.out.println("Элементы массива после преобразования");
        System.out.println(Arrays.toString(array));
    }
    @Override
    public String toString() {
        return " { " +
                "array = " + array +
                '}';
    }
    public T getArray() {
        return array;
    }
    public void setArray(T array) {
        this.array = array;
    }
}







