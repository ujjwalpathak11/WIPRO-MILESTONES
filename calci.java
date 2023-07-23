class calci {
    static double p1;
    static double p2;

    static double powerInt(int n1, int n2) {
        p1 = Math.pow(n1, n2);
        return p1;
    }

    static double powerDouble(int n3, int n4) {
        p2 = Math.pow(n3, n4);
        return p2;
    }

    public static void main(String[] args) {
        double pp1 = calci.powerInt(2, 5);
        double pp2 = calci.powerDouble(2, 1);
        System.out.println("Power int result:" + pp1);
        System.out.println("Power double result:" + pp2);
    }
}
