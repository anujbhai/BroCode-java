import javax.swing.*;
import java.awt.*;

public class AdditionalWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Come now have a listen lads, and hear me tell my tale..");

    AdditionalWindow() {
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}
