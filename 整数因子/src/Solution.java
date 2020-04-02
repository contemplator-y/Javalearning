import java.util.*;
/*
 读入一个整数，求它的所有质因子
*/

public class Solution {
    static boolean isPrime(int n) {
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n = input.nextInt();
        boolean flag = isPrime(n);
        if(flag) {
            System.out.println("该数是一个质数！");
            System.exit(0);
        }
        int i = 2;
        while(n != 1) {
            if(isPrime(i) && n % i == 0) {
                System.out.print(i + " ");
                    n /= i;
                    continue;
            }
            i++;
        }
    }
}
