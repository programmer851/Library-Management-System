public class Book {
    public int id;
    public String title;
    public String author;
    public boolean issued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }
}
