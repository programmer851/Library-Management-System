import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class LibraryGUI extends JFrame {

    ArrayList<Book> books = new ArrayList<>();
    DefaultTableModel model;

    public LibraryGUI() {
        setTitle("Library Management System - GUI");
        setSize(600,400);
        setLayout(null);

        JTextField idField = new JTextField();
        idField.setBounds(100,20,100,30);
        add(idField);

        JTextField titleField = new JTextField();
        titleField.setBounds(100,60,200,30);
        add(titleField);

        JTextField authorField = new JTextField();
        authorField.setBounds(100,100,200,30);
        add(authorField);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(20,150,100,30);
        add(addBtn);

        model = new DefaultTableModel(new String[]{"ID","Title","Author","Issued"},0);
        JTable table = new JTable(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20,200,550,150);
        add(sp);

        addBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String author = authorField.getText();

            Book b = new Book(id,title,author);
            books.add(b);
            model.addRow(new Object[]{id,title,author,false});
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LibraryGUI();
    }
}
