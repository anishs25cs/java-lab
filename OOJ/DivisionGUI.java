import javax.swing.*;
import java.awt.event.*;

public class DivisionGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton b = new JButton("Divide");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        t3.setBounds(50, 150, 100, 30);
        b.setBounds(50, 200, 100, 30);

        b.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());
                t3.setText("" + (a / c));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, ex);
            }
        });

        f.add(t1); f.add(t2); f.add(t3); f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
