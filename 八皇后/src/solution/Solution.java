package solution;

/*
在8*8的棋盘中放入8个皇后，要求没行每列，以及每条对角线上最多只有一个皇后
 */

public class Solution {
    public static void reverse(int[] arr,int start,int end) {
        while(start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
    //根据一个1-8的排列产生下一个排列
    public static void givePerms(int[] arr) {
        //从最后一个元素开始找到第一个开始下降的元素
        int start = -1;
        for(int i = arr.length - 1;i >= 1;i--) {
            if(arr[i] > arr[i - 1]) {
                start = i - 1;
                break;
            }
        }
        if(start == -1) {
            return;
        }
        //从start的右边找到最后一个大于start位置的元素
        int end = -1;
        for (int i = start + 1;i < arr.length;i++) {
            if (arr[i] < arr[start]) {
                end = i - 1;
                break;
            }
        }
        if (end == -1) {
            end = arr.length - 1;
        }
        //交换start和end位置的元素
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        //将start后面的元素逆置
        reverse(arr,start + 1,arr.length - 1);
    }
    static boolean judgeOk(int[] arr) {
        //判断产生的排列是否满足要求
        int a = 0,b = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i + arr[i] == 7) {
                b++;
            }
            if(i == arr[i]) {
                a++;
            }
        }
        if(a <= 1 && b <= 1) {
            return true;
        }
        return false;
    }

    static void printChessbord(int[] arr) {
        int[][] chessbord = new int[8][8];
        for (int i = 0; i < chessbord.length; i++) {
            int pos = arr[i];
            chessbord[i][pos] = 1;
        }
        for(int[] i : chessbord) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[] arr = {0, 1 , 2 , 3, 4, 5, 6, 7};
         while(true) {
            givePerms(arr);
            boolean flag = judgeOk(arr);
            if(flag == true) {
                printChessbord(arr);
                break;
            }
        }
    }
}
