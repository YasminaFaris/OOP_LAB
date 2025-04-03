import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class EventHandling implements ActionListener {
    private JFrame fr;
    private JTextArea area;
    //private File currentFile;
    
    public EventHandling(JTextArea area, JFrame fr){
        this.area = area;
        this.fr = fr;
        //this.currentFile = null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) e.getSource();
        
        if (source.getText().equals("New")){
            area.setText("");
            //currentFile = null;
        } else if (source.getText().equals("Open")){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            //currentFile = f;
        } else if (source.getText().equals("Save")){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
            //currentFile = fc.getSelectedFile();
        } else if (source.getText().equals("Close")){
            System.exit(0);
        }
    }
}