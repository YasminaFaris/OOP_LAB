import javax.swing.*;
import java.awt.*;
public class TextEditor {
    public JFrame fr;
    public JMenuBar mb;
    public JMenu menu;
    public JMenuItem i1, i2, i3, i4;
    public JTextArea area;
    
    public TextEditor(){
        fr = new JFrame("My Text Editor");
        mb = new JMenuBar();
        menu = new JMenu("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Close");
        area = new JTextArea();
        
        fr.setSize(400,300);
        fr.setJMenuBar(mb);
        mb.add(menu);
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.addSeparator();
        menu.add(i4);
        fr.add(area);
        
        EventHandling eventHandler = new EventHandling(area, fr);
        i1.addActionListener(eventHandler);
        i2.addActionListener(eventHandler);
        i3.addActionListener(eventHandler);
        i4.addActionListener(eventHandler);
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TextEditor();
    }
}
