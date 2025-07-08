import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class BookStore {
    private HashMap<String, Book> books;

    public BookStore() {
        books = new HashMap<>();
    }

    public void add(Book book) {
        books.put(book.ISBN, book);
    }

    public void remove(String ISBN, int numberOfYears) {
        if (books.containsKey(ISBN) && (Year.now().getValue() - books.get(ISBN).getYearPublished()) > numberOfYears) {
            books.remove(ISBN);
        }
    }

    public void buy(String ISBN, int quantity, String email) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            book.buy(ISBN, quantity, email);
        } else {
            throw new IllegalArgumentException("Book not found");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            sb.append(entry.getValue())
                    .append("\n");
        }
        return sb.toString();
    }

}
