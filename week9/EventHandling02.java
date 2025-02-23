import java.awt.event.*;

public class EventHandling02 implements ActionListener {
    private TellerGUI gui;
    public EventHandling02(TellerGUI gui){
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Deposit")){
            gui.account.deposit(Double.parseDouble(gui.txt2.getText()));
        }
        else if (ae.getActionCommand().equals("Withdraw")){
            gui.account.withdraw(Double.parseDouble(gui.txt2.getText()));
        }
        else if (ae.getActionCommand().equals("Exit")){
            System.exit(0);
        }
        gui.getTxt1().setText(String.valueOf(gui.account.balance));
    }

}
