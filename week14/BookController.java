import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BookController implements ActionListener{
    private BookView view;
    private ArrayList<Book> bookList = new ArrayList<>();
    private int currentIndex = -1;

    BookController(BookView view) {
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == view.btn1){
            showPreviousBook();
        } else if (e.getSource() == view.btn2){
            showNextBook();
        } else if (e.getSource() == view.btn3){
            new BookAdd(this);
        } else if (e.getSource() == view.btn4){
            updateBook();
        } else if (e.getSource() == view.btn5){
            deleteBook();
        }
    }
    
    public void displayBook(){
        if (currentIndex >= 0 && currentIndex < bookList.size()){
            Book book = bookList.get(currentIndex);
            view.txt1.setText(book.getName());
            view.txt2.setText(String.valueOf(book.getPrice()));
            view.cb.setSelectedItem(book.getType());
            view.txt3.setText((currentIndex + 1) + "/" + bookList.size());
        } else {
            view.txt1.setText("");
            view.txt2.setText("");
            view.cb.setSelectedIndex(0);
            view.txt3.setText("0/0");
        }
    }
    
    public void addBook(Book book){
        bookList.add(book);
        currentIndex = bookList.size() - 1;
        displayBook();
    }    
    public void showPreviousBook(){
        if (currentIndex > 0){
            currentIndex--;
            displayBook();
        }
    }
    public void showNextBook(){
        if (currentIndex < bookList.size() - 1){
            currentIndex++;
            displayBook();
        }
    }
    public void updateBook(){
        if (currentIndex >= 0){
            Book book = bookList.get(currentIndex);
            book.setName(view.txt1.getText());
            book.setPrice(Double.parseDouble(view.txt2.getText()));
            book.setType((String) view.cb.getSelectedItem());
            JOptionPane.showMessageDialog(view.fr, "Done it.");
        }
    }
    public void deleteBook(){
        if (currentIndex >= 0){
            bookList.remove(currentIndex);
            currentIndex = (bookList.size() > 0) ? 0 : -1;
            JOptionPane.showMessageDialog(view.fr, "Done it.");
        }
    }
}
