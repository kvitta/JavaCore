package Lesson_2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        System.out.println("Недопустимое значение в ячейке [" + i + "][" + j + "]");
    }
}
