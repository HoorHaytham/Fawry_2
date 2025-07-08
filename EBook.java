public class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, int yearPublished, double price, String fileType) {
        super(ISBN, title, yearPublished, price);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public double buy(String ISBN, int quantity, String email) {
        if (this.ISBN.equals(ISBN)) {
            MailService.send(email);
            return price * quantity;
        } else
            throw new IllegalArgumentException("ISBN does not match");
    }

    public String toString() {
        return super.toString() + ", File Type: " + fileType;
    }

}
