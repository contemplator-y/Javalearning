package Test;

/*
将输入的整数以二进制的形式打印
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] arr = new char[16];
        int x = 0;
        for(int i = 15;i >= 0;i--) {
            int tmp = (n >> x) & 1;
            if(tmp == 1) {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
            x++;
        }
        String str = new String(arr);
        System.out.println(str);
    }
}
