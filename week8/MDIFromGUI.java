import javax.swing.*;
import java.awt.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu File, Edit, View, New;
    private JMenuItem open, save, exit, window, message;
    private JDesktopPane dk;
    private JInternalFrame inf1, inf2, inf3;
    
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        fr.setSize(600, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inf1 = new JInternalFrame("Application 01", true, true, true, true);
        inf1.setSize(200,250);
        inf1.setVisible(true);
        
        inf2 = new JInternalFrame("Application 02", true, true, true, true);
        inf2.setSize(200,200);
        inf2.setVisible(true);
        
        inf3 = new JInternalFrame("Application 03", true, true, true, true);
        inf3.setSize(300,300);
        inf3.setVisible(true);
        
        dk = new JDesktopPane();
        dk.add(inf1);
        dk.add(inf2);
        dk.add(inf3);
        fr.add(dk, BorderLayout.CENTER);
        
        mb = new JMenuBar();
        fr.setJMenuBar(mb);
        
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        View = new JMenu("View");
        New = new JMenu("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        window = new JMenuItem("Window");
        message = new JMenuItem("Message");
        
        mb.add(File);
        mb.add(Edit);
        mb.add(View);
        File.add(New);
        New.add(window);
        New.addSeparator();
        New.add(message);
        File.add(open);
        File.addSeparator();
        File.add(save);
        File.addSeparator();
        File.add(exit);
        
        fr.setVisible(true);
    }
}
