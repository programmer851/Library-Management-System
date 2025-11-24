import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. Issue Book\n3. Return Book\n4. Search\n5. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();

                    lib.addBook(new Book(id, t, a));
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    lib.issueBook(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    Book b = lib.search(sc.nextInt());
                    System.out.println(b != null ? b.title : "Not Found");
                    break;

                case 5:
                    return;
            }
        }
    }
}
