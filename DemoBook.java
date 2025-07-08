public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, int yearPublished, double price) {
        super(ISBN, title, yearPublished, price);
    }

    public double buy(String ISBN, int quantity, String email) {
        throw new IllegalArgumentException("DemoBooks cannot be purchased");
    }

}
