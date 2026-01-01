import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SecondPage extends JFrame implements ActionListener {

    JButton exitBtn;

    public SecondPage() {
        super("Welcome Page");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
       this.setLocationRelativeTo(null);

        // Label
        JLabel msg = new JLabel("Thank You for Logging In!", SwingConstants.CENTER);
        msg.setBounds(50, 50, 400, 40);
        msg.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(msg);

        // Exit Button
        exitBtn = new JButton("Exit");
        exitBtn.setBounds(200, 150, 100, 35);
        exitBtn.addActionListener(this);
        this.add(exitBtn);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exitBtn) {
            System.exit(0);
        }
    }
}
