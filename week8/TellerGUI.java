import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel pn, pnInfo, pnbt, lackpn;
    private JButton bnwd, bndp, bnex;
    private JLabel balance, amount;
    private TextField textb, textfill;

    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,400);
        fr.setLayout(new GridLayout(2,1));

        lackpn = new JPanel();
        lackpn.setLayout(new GridLayout(1,2));

        pnInfo = new JPanel();
        pnInfo.setLayout(new GridLayout(2,1));

        balance = new JLabel("Balance");
        amount = new JLabel("Amount");

        pn = new JPanel();
        pn.setLayout(new GridLayout(2,1));
        textb = new TextField("6000");
        textb.setEditable(false);
        textfill = new TextField();

        lackpn.add(pnInfo);
        lackpn.add(pn);

        pnbt = new JPanel();
        pnbt.setLayout(new FlowLayout());
        bndp = new JButton("Deposit");
        bnwd = new JButton("Withdraw");
        bnex = new JButton("Exit");

        pnInfo.add(balance);
        pnInfo.add(amount);
        pnbt.add(bndp);
        pnbt.add(bnwd);
        pnbt.add(bnex);
        lackpn.add(pnInfo);
        pn.add(textb);
        pn.add(textfill);
        lackpn.add(pn);
        fr.add(lackpn);
        fr.add(pnbt);
        fr.setVisible(true);

    }
}