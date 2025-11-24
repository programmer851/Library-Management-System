import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                b.issued = true;
            }
        }
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                b.issued = false;
            }
        }
    }

    public Book search(int id) {
        for (Book b : books) {
            if (b.id == id) return b;
        }
        return null;
    }
}
