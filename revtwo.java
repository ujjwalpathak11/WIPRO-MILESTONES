import java.util.Scanner;

public class revtwo {

    public static void main(String[] args) {
        System.out.println("Enter size of 2D array: ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = col - 1; i >= 0; i--) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}