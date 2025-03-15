package one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Poring implements Runnable {
    private static int count = 0;
    private JFrame frame;
    private JLabel label;
    private Random random;
    private Thread animationThread;
    private boolean running = true;

    public Poring() {
        count++;
        random = new Random();

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon icon;
        try {
            java.net.URL imgURL = Poring.class.getResource("Poring.png");
            if (imgURL != null) {
                icon = new ImageIcon(imgURL);
            } else {
                icon = new ImageIcon("poring.png");
            }

            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImg);

        } catch (Exception e) {
            icon = new ImageIcon("poring.png");
        }

        label = new JLabel(icon);
        label.setText("" + count);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                close();
            }
        });

        frame.add(label);
        frame.pack();

        setRandomPosition();

        frame.setVisible(true);

        animationThread = new Thread(this);
        animationThread.start();
    }

    private void setRandomPosition() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int maxX = (int) screenSize.getWidth() - frame.getWidth();
        int maxY = (int) screenSize.getHeight() - frame.getHeight();

        int x = random.nextInt(maxX);
        int y = random.nextInt(maxY);

        frame.setLocation(x, y);
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(200);

                Point currentLocation = frame.getLocation();
                int offsetX = random.nextInt(21) - 10;
                int offsetY = random.nextInt(21) - 10;

                frame.setLocation(
                        currentLocation.x + offsetX,
                        currentLocation.y + offsetY
                );

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void close() {
        running = false;
        frame.dispose();
    }
}