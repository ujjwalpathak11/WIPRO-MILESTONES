public class testauthor {
    public static void main(String[] args) {
        author info = new author("Vinod", "vi123@gmail.com", 'm');
        System.out.println(info);
        info.setEmail("vi123@gmail.com");
        System.out.println(info);
        System.out.println("name is: " + info.getName());
        System.out.println("gender is: " + info.getGender());
        System.out.println("email is: " + info.getEmail());
    }
}