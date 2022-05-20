package Lesson_2;

public class MyArraySizeException extends  ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String недопустимая_длина_массива) {
        super("Недопустимая длина массива");
    }
}
