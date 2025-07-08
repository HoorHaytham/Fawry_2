public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, int yearPublished, double price, int stock) {
        super(ISBN, title, yearPublished, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double buy(String ISBN, int quantity, String email) {
        if (this.ISBN.equals(ISBN)) {
            if (quantity <= stock) {
                stock -= quantity;
                String address = "dummy string";
                ShippingService.send(address);
                return price * quantity;
            } else {
                throw new IllegalArgumentException("Not enough stock available");
            }
        } else {
            throw new IllegalArgumentException("ISBN does not match");
        }
    }

    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}
