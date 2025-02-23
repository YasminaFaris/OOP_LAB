import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel pn;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn0,bnc,bnminus,bnplus,bnx,bnslash,bnresult;
    private JTextField TextFill;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,400);
        fr.setLayout(new BorderLayout());
        TextFill = new JTextField();
        fr.add(TextFill, BorderLayout.NORTH);
        
        pn = new JPanel();
        pn.setLayout(new GridLayout(4,4));
        bn1 = new JButton("1");bn2 = new JButton("2");bn3 = new JButton("3");
        bn4 = new JButton("4");bn5 = new JButton("5");bn6 = new JButton("6");
        bn7 = new JButton("7");bn8 = new JButton("8");bn9 = new JButton("9");
        bn0 = new JButton("0");bnc = new JButton("c");bnresult = new JButton("=");
        bnplus = new JButton("+");bnminus = new JButton("-");bnx = new JButton("x");bnslash = new JButton("/");
        
        pn.add(bn7);
        pn.add(bn8);
        pn.add(bn9);
        pn.add(bnplus);
        pn.add(bn4);
        pn.add(bn5);
        pn.add(bn6);
        pn.add(bnminus);
        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bnx);
        pn.add(bn0);
        pn.add(bnc);
        pn.add(bnresult);
        pn.add(bnslash);
        
        fr.add(pn, BorderLayout.CENTER);
        fr.setVisible(true);
    }

}
