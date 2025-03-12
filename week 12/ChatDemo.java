import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ChatDemo {
    private JFrame fr;
    private JPanel pn;
    private JTextArea ar;
    private JTextField text;
    private JButton btn1, btn2;
    private HandleEvent handle;

    public ChatDemo(){
        fr = new JFrame("ChatDemo");
        pn = new JPanel();
        ar = new JTextArea(20,45);
        text = new JTextField(45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        handle = new HandleEvent(this);
        
        pn.setLayout(new FlowLayout());
        pn.add(btn1);
        pn.add(btn2);
        btn1.addActionListener(handle);
        btn2.addActionListener(handle);
        
        fr.setLayout(new BorderLayout());
        ar.setEditable(false);
        fr.add(ar ,BorderLayout.NORTH);
        fr.add(text ,BorderLayout.CENTER);
        fr.add(pn ,BorderLayout.SOUTH);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        }
    
    public JFrame getFr(){
        return fr;
    }
    public void setFR(JFrame fr){
        this.fr = fr;
    }
    public JPanel getPn(){
        return pn;
    }
    public void setPn(JPanel pn){
        this.pn = pn;
    }
    public JTextArea getAr(){
        return ar;
    }
    public void setAr(JTextArea ar){
        this.ar = ar;
    }
    public JTextField getText(){
        return text;
    }
    public void setText(JTextField text){
        this .text = text;
    }
    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    //public HandleEvent getHandle() {
        //return handle;
    //}

    //public void setHandle(HandleEvent handle) {
        //this.handle = handle;
    //}
}
