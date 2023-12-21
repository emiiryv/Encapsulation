
public class Main {
    public static void main(String[] args) {
        Kitap book = new Kitap("Harry Potter", 500, "JK Rowling");
        book.setSayfaSayisi(100);

        System.out.println(book.getSayfaSayisi());
    }
}