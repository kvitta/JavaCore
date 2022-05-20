package Lesson_2;


public class ArrayException {
public static void main (String [] args){
        String[][] newArray = new String[4][4];// создаем массив 4х4 (для проверки MyArraySizeException меняем на [5][4])
    try {           //обрабатываем  возможные исключения
            arrayCheck(newArray);
        } catch (MyArraySizeException e) {
            System.out.println("Недопустимая длинна массива ");
        } catch (MyArrayDataException e) {
        }
    }
    public static void arrayCheck(String[][] newArray) throws MyArraySizeException, MyArrayDataException {//методу на вход передаем созданный массив
    if (newArray.length != 4) throw new MyArraySizeException("Недопустимая длина массива");// Если массив отличного от заданного размера- выбрасываем исключение
    int sum = 0;
    for (int i = 0; i < newArray.length; i++)
        for (int j = 0; j < newArray.length; j++) {
            newArray[i][j] = "1";
            //newArray[i][j] = "для проверки исключения MyArrayDataException";
            try { // ловим ошибку при преобразовании элемента массива
                sum += Integer.parseInt(newArray[i][j]);
            } catch (NumberFormatException e) {// если преобразование массива не удалось
                throw new MyArrayDataException(i, j);// выбрасываем исключение MyArrayDataException

            }
        }
        System.out.println("Все введенные данные коректны, программа завершена! " );
        System.out.println("Сумма массива = " + sum);
}

}






















