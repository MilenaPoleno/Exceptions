package exc_HW1;

public class task_3 {
    
    public static void main(String[] args) {
        createArray(new int[5], new int[9]);
        }
    
    public static int[] createArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new DivisionErrorException("Длины массивов не равны!");
        }
        int[] resultArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
          resultArray[i] = arr1[i] / arr2[i];
        }
        return resultArray;
        }
    
}
