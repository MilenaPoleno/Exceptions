package exc_HW1;

public class task_1 {

    public static void main(String[] args) {
        divideTwoNumbers(4, 0);
        getValue(new int[10], 12);
        createArray(-10);
    }
  
    public static int[] createArray(int sizeArr) {
        if (sizeArr < 0) {
            throw new NegativeArraySizeException("Неверный размер массива!");
        }
        return new int[sizeArr];
    }
  
    public static int getValue(int[] arr, int i) {
        if (i > arr.length) {
            throw new IndexOutOfBoundsException("Такого индекса в массиве нет!");
        }
        return arr[i];
    }
  
    public static int divideTwoNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }

}