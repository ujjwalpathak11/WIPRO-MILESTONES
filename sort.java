import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}