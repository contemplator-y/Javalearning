package Game;

import java.util.Scanner;
import java.util.Random;
public class tctactoeGame {

    public static void printChessboard(int[][] chessboard) {
        for (int[] i : chessboard) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkWin(int[][] chessboard) {
            if (chessboard[0][0] == chessboard[1][1] &&
                    chessboard[2][2] == chessboard[0][0]
                && chessboard[0][0] != 0) {
                return true;
            }
            if(chessboard[2][0] == chessboard[1][1] &&
                chessboard[2][0] == chessboard[0][2]
                && chessboard[2][0] != 0) {
                return true;
            }
            for(int i = 0; i < 3; i++) {
                if (chessboard[i][0] == chessboard[i][1] &&
                    chessboard[i][1] == chessboard[i][2]
                    && chessboard[i][0] != 0) {
                    return true;
                }
                if(chessboard[0][i] == chessboard[1][i] &&
                    chessboard[1][i] == chessboard[2][i]
                    && chessboard[0][i] != 0) {
                    return true;
                }
            }
            return false;
    }
    public static void game() {
        int[][] chessboard = new int[3][3];
        System.out.println("1表示玩家落子处，2表示电脑落子处.");
        while (true) {
            printChessboard(chessboard);
            playerDo(chessboard);
            if (checkWin(chessboard) == true) {
                System.out.println("恭喜你，你赢了！");
                printChessboard(chessboard);
                break;
            }
            if (checkOver(chessboard) == true) {
                System.out.println("你真菜，和电脑下成平手！");
                printChessboard(chessboard);
                break;
            }
            computerDo(chessboard);
            if(checkWin(chessboard) == true) {
                System.out.println("你真菜，连电脑都下不过！");
                printChessboard(chessboard);
                break;
            }
            if (checkOver(chessboard) == true) {
                System.out.println("你真菜，和电脑下成平手！");
                printChessboard(chessboard);
                break;
            }
        }
    }
    public  static void playerDo(int[][] chessboard) {
            System.out.print("请输入落子的坐标：");
            Scanner input = new Scanner(System.in);
            while (true) {
                int row = input.nextInt();
                int col = input.nextInt();
                if (row < 0 || row > 2 || col < 0 || col > 2 || chessboard[row][col] != 0) {
                    System.out.println("您的输入有误，请重新输入！");
                    continue;
                }
                chessboard[row][col] = 1;
                break;
            }
    }
    public static void computerDo(int[][] chessboard) {
        while(true) {
            Random ra = new Random();
            int row = ra.nextInt(3);
            int col = ra.nextInt(3);
            if(chessboard[row][col] == 0) {
                chessboard[row][col] = 2;
                break;
            }
        }

    }
    public static boolean checkOver(int[][] chessboard) {
        for (int i = 0;i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if (chessboard[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static  void main(String[] args) {
        game();
    }
}
