import javax.swing.*;

public class Page2 extends JFrame {
    public Page2(String name) {
        JLabel label = new JLabel("Welcome, " + name);
        add(label);
        setSize(300,100);
        setVisible(true);
    }
}
