abstract class Book {
    String ISBN;
    String title;
    int yearPublished;
    double price;

    public Book(String ISBN, String title, int yearPublished, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }

    abstract public double buy(String ISBN, int quantity, String email);

    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Year: " + yearPublished + ", Price: " + price;
    }
}