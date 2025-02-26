import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel pn, pbt, pninfo, lackpn;
    private JLabel balance, amount;
    private JTextField text1, text2;
    private JButton bdep, bwit, bex;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(2, 1));
        fr.setSize(400,300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pninfo = new JPanel();
        pninfo.setLayout(new GridLayout(2, 1));
        balance = new JLabel("Balance");
        amount = new JLabel("amount");
        pninfo.add(balance);
        pninfo.add(amount);
        
        pn = new JPanel();
        pn.setLayout(new GridLayout(2, 1));
        text1 = new JTextField("6000");
        text1.setEditable(false);
        text2 = new JTextField();
        pn.add(text1);
        pn.add(text2);
        
        pbt = new JPanel();
        bdep = new JButton("Deposit");
        bwit = new JButton("Withdraw");
        bex = new JButton("Exit");
        pbt.add(bdep);
        pbt.add(bwit);
        pbt.add(bex);
        
        lackpn = new JPanel();
        lackpn.setLayout(new GridLayout(1, 2));
        lackpn.add(pninfo);
        lackpn.add(pn);
        
        fr.add(lackpn);
        fr.add(pbt);
        fr.setVisible(true);
    }
}
