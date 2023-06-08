package exc_HW1;

public class task_2 {
    
    public static int exc(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
          }
        }
        return sum;
      }
    
}
