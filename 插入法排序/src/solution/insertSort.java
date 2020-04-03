package solution;

public class insertSort {
    public static void main(String[] args) {
      int[] arr = {7,6,5,4,3,2,1};
      insertSrot(arr);
      for(int i : arr) {
          System.out.print(i + " ");
      }
    }
    //按照升序排列
    public static void insertSrot(int[] arr) {
        for(int i = 0; i < arr.length - 1;i++) {
            int cur = arr[i + 1];
            int j = i;
            for ( ; j >= 0; j--) {
                if(cur < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = cur;
                    break;
                }
            }
            if(j == -1) {
                arr[0] = cur;
            }
        }
    }
}
