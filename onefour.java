public class onefour {
    public static void main(String[] args) {
        int[] myArray = { 1, 4, 1, 4, 1, 1 };
        boolean result = checkArray(myArray);
        System.out.println(result);
    }

    public static boolean checkArray(int[] arr) {
        for (int num : arr) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}
