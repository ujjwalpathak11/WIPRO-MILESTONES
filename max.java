public class max {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please provide 9 integer numbers as command-line arguments.");
            return;
        }
        int[][] array = new int[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }
        int max = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The biggest number in the array is: " + max);
    }
}
