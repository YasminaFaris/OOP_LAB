package one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PoringConstructor {
    private JFrame fr;
    private JButton addButton;
    private ArrayList<Poring> porings;

    public PoringConstructor() {
        porings = new ArrayList<>();

        fr = new JFrame("Poring Generator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);

        addButton = new JButton("Add");
        addButton.setFont(new Font("Arial", Font.BOLD, 16));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Poring p = new Poring();
                porings.add(p);
            }
        });

        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                for (Poring p : porings) {
                    p.close();
                }
            }
        });

        fr.setLayout(new FlowLayout(FlowLayout.CENTER));
        fr.add(addButton);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new PoringConstructor();
    }
}
