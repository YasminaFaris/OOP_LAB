
package three;

import four.MyClockPause;
import javax.swing.JFrame;

public class MyFrame2 {
    private JFrame fr;
    private MyClockPause clock;
    private Thread t;

    public MyFrame2() {
        fr = new JFrame("My Clock");
        clock = new MyClockPause();
        t = new Thread(clock);

        t.start();
        fr.add(clock);

        fr.setSize(300, 130);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame2();

    }
}
