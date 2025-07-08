public class Test {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.add(new DemoBook("1", "Demo Book", 2023, 9.99));
        bookStore.add(new EBook("2", "E-Book", 2022, 14.99, "PDF"));
        bookStore.add(new PaperBook("3", "Paper A", 2021, 19.99, 3));
        bookStore.add(new PaperBook("4", "Paper B", 2020, 29.99, 1));
        System.out.println(bookStore + "\n" + "-------------------");
        bookStore.remove("1", 1);
        System.out.println(bookStore + "\n" + "-------------------");
        bookStore.buy("3", 1, "test@gmail.com");
        System.out.println(bookStore + "\n" + "-------------------");

    }
}
