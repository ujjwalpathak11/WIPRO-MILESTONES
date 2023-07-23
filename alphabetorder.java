import java.util.*;

public class alphabetorder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first character");
        char c1 = s.next().charAt(0);
        System.out.println("Enter second character");
        char c2 = s.next().charAt(0);
        if (c1 > c2) {
            System.out.println(c2 + " " + c1);
        } else {
            System.out.println(c1 + " " + c2);
        }
    }
}
