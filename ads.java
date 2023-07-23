import java.util.*;

public class ads {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter characters:");
        char ch = s.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("number");
        } else {
            System.out.println("special character");
        }
    }

}
