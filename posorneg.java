class posorneg {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i > 0) {
            System.out.println(i + "is a positive number");
        } else if (i < 0) {
            System.out.println(i + "is a negative number");
        } else {
            System.out.println(i + "is a zero number");
        }
    }
}
