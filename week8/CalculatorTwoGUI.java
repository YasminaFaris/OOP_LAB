import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel pn;
    private JTextField textfield;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bplus, bminus, bmulti, bslash, bc, bequal;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        fr.setSize(400, 400);
        fr.setLayout(new BorderLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textfield = new JTextField();
        fr.add(textfield, BorderLayout.NORTH);
        
        pn = new JPanel();
        pn.setLayout(new GridLayout(4, 4));
        
        b1 = new JButton("1");b2 = new JButton("2");b3 = new JButton("3");
        b4 = new JButton("4");b5 = new JButton("5");b6 = new JButton("6");
        b7 = new JButton("7");b8 = new JButton("8");b9 = new JButton("9");
        b0 = new JButton("0");bplus = new JButton("+");bminus = new JButton("-");
        bmulti = new JButton("x");bslash = new JButton("/");bc = new JButton("c");
        bequal = new JButton("=");
        pn.add(b7);
        pn.add(b8);
        pn.add(b9);
        pn.add(bplus);
        pn.add(b4);
        pn.add(b5);
        pn.add(b6);
        pn.add(bminus);
        pn.add(b1);
        pn.add(b2);
        pn.add(b3);
        pn.add(bmulti);
        pn.add(b0);
        pn.add(bc);
        pn.add(bequal);
        pn.add(bslash);
        fr.add(pn, BorderLayout.CENTER);
        
        fr.setVisible(true);
    }
    
}
