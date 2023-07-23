import java.util.Arrays;

public class mid {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        int[] result = middleElements(a, b);
        System.out.println(Arrays.toString(result));
    }

    public static int[] middleElements(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
}