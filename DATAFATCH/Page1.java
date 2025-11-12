import javax.swing.*;
public class Page1 extends JFrame {
    public Page1() {
        JTextField nameField = new JTextField(10);
        JButton nextButton = new JButton("Next Page");

        nextButton.addActionListener(e -> {
            String name = nameField.getText();
            new Page2(name);
            this.dispose();
        });

        add(nameField);
        add(nextButton);
        setLayout(new java.awt.FlowLayout());
        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Page1();
    }
}
