public class testbook {
    public static void main(String[] args) {
        author ahTeck = new author("Vijay", "ahTeck@somewhere.com", 'm');
        System.out.println(ahTeck);
        book dummyBook = new book("Java for dummies", ahTeck, 9.99, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
        book moreDummyBook = new book("Java for more dummies", new author("Peter Lee", "peter@nowhere.com", 'm'), 19.99,
                8);
        System.out.println(moreDummyBook);
    }
}