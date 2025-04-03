import javax.swing.*;
import  java.awt.*;
import java.util.ArrayList;

public class BookView {
    public JFrame fr;
    public JPanel pn1, pn2, pn3;
    public JLabel lb1, lb2, lb3;
    public JTextField txt1, txt2, txt3;
    public JComboBox cb;
    public JButton btn1, btn2, btn3, btn4, btn5;
    
    private ArrayList<Book> booklist = new ArrayList<>();
    private int currentIndex = -1;
    
    public BookView(){
        fr = new JFrame("Book View");
        fr.setSize(300,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        
        pn1 = new JPanel(new GridLayout(3,2));
        pn2 = new JPanel(new GridLayout(1,3));
        pn3 = new JPanel(new FlowLayout());
        
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(3);
        //txt3.setHorizontalAlignment(JTextField.CENTER);
        txt3.setEditable(false);
        
        btn1 = new JButton("<<<");
        btn2 = new JButton(">>>");
        btn3 = new JButton("Add");
        btn4 = new JButton("Update");
        btn5 = new JButton("Delete");
        
        String list[] = {"General","Computer","Math&Sci","Photo"};
        cb = new JComboBox(list);
        
        pn1.add(lb1); pn1.add(txt1);
        pn1.add(lb2); pn1.add(txt2);
        pn1.add(lb3); pn1.add(cb);
        
        pn2.add(btn1); pn2.add(txt3); pn2.add(btn2);
        
        pn3.add(btn3); pn3.add(btn4); pn3.add(btn5);

        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        
        BookController controller = new BookController(this);
                
        btn1.addActionListener(controller);
        btn2.addActionListener(controller);
        btn3.addActionListener(controller);
        btn4.addActionListener(controller);
        
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
        new BookView();
    }
}
