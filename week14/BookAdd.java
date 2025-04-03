import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookAdd {
    private JFrame fr;
    private JPanel pn1, pn2;
    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2;
    private JComboBox cb;
    private JButton btn;
    private BookController controller;
    
    
    public BookAdd(BookController controller){
        this.controller = controller;
        
        fr = new JFrame("Add book");
        fr.setSize(300,180);
        fr.setLayout(new FlowLayout());
        
        pn1 = new JPanel(new GridLayout(3,2));
        pn2 = new JPanel(new FlowLayout());
        
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        btn = new JButton("Insert");
        
        String list[] = {"General","Computer","Math&Sci","Photo"};
        cb = new JComboBox(list);
        
        pn1.add(lb1); pn1.add(txt1);
        pn1.add(lb2); pn1.add(txt2);
        pn1.add(lb3); pn1.add(cb);
        
        pn2.add(btn);
        
        fr.add(pn1);
        fr.add(pn2);
        
        btn.addActionListener(e -> insertBook());
        
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setVisible(true);
    }
    private void insertBook(){
        String name = txt1.getText();
        double price = Double.parseDouble(txt2.getText());
        String type = (String) cb.getSelectedItem();
        
        controller.addBook(new Book(name, price, type));
        JOptionPane.showMessageDialog(fr, "Done it.");
        fr.dispose();
    }
}
