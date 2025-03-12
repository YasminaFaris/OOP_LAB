import javax.swing.*;
import java.awt.*;

public class StudentView {
    private JFrame fr;
    private JPanel pn1, pn2;
    private JButton deposit, withdraw;
    private JLabel id, name, money;
    private JTextField txt1, txt2, txt3;
    private StdEvent se;
    
    public StudentView(){
        fr = new JFrame("Student Bank");
        pn1 = new JPanel();
        pn2 = new JPanel();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        id = new JLabel("ID:");
        name = new JLabel("Name:");
        money = new JLabel("Money:");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField("0");
        txt3.setEditable(false);
        se = new StdEvent(this);
        
        fr.setLayout(new BorderLayout());
        fr.add(pn1 ,BorderLayout.CENTER);
        fr.add(pn2 ,BorderLayout.SOUTH);
        
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(id);
        pn1.add(txt1);
        pn1.add(name);
        pn1.add(txt2);
        pn1.add(money);
        pn1.add(txt3);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(deposit);
        pn2.add(withdraw);
        
        fr.addWindowListener(se);
        deposit.addActionListener(se);
        withdraw.addActionListener(se);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPn() {
        return pn1;
    }

    public void setPn(JPanel pn) {
        this.pn1 = pn;
    }

    public JPanel getPn2() {
        return pn2;
    }

    public void setPn2(JPanel pn2) {
        this.pn2 = pn2;
    }

    public JButton getDeposit() {
        return deposit;
    }

    public void setDeposit(JButton deposit) {
        this.deposit = deposit;
    }

    public JButton getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(JButton withdraw) {
        this.withdraw = withdraw;
    }

    public JLabel getId() {
        return id;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public JLabel getName() {
        return name;
    }

    public void setName(JLabel name) {
        this.name = name;
    }

    public JLabel getMoney() {
        return money;
    }

    public void setMoney(JLabel money) {
        this.money = money;
    }

    public StdEvent getSe() {
        return se;
    }

    public void setSe(StdEvent se) {
        this.se = se;
    }

    public JTextField getTxt1() {
        return txt1;
    }

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }

    public JTextField getTxt2() {
        return txt2;
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }

    public JTextField getTxt3() {
        return txt3;
    }

    public void setTxt3(JTextField txt3) {
        this.txt3 = txt3;
    }
}
