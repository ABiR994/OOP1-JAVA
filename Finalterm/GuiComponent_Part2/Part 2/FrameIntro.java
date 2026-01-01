import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameIntro extends JFrame implements MouseListener, ActionListener {

    JTextField userTF;
    JPasswordField passPF;
    JButton loginBtn, exitBtn;

    public FrameIntro() {
        super("My First GUI");
        this.setSize(800, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
		panel.setBackground(new Color(102, 205, 170));

        Font myFont = new Font("Arial", Font.BOLD, 14);

        // Labels
        JLabel userLabel = new JLabel("User Name : ");
        userLabel.setBounds(120, 115, 160, 30);
        userLabel.setBackground(Color.PINK);
        userLabel.setOpaque(true);
        userLabel.setForeground(Color.BLUE);
        userLabel.setFont(myFont);
        panel.add(userLabel);

        JLabel passLabel = new JLabel("Password : ");
        passLabel.setBounds(120, 165, 160, 30);
        passLabel.setBackground(Color.PINK);
        passLabel.setOpaque(true);
        passLabel.setForeground(Color.BLUE);
        passLabel.setFont(myFont);
        panel.add(passLabel);

        // Text Fields
        userTF = new JTextField();
        userTF.setBounds(280, 115, 160, 30);
        panel.add(userTF);

        passPF = new JPasswordField();
        passPF.setBounds(280, 165, 160, 30);
		passPF.setEchoChar('*');
        panel.add(passPF);

        // Buttons
        loginBtn = new JButton("Login");
        loginBtn.setBounds(180, 225, 80, 30);
        panel.add(loginBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(300, 225, 80, 30);
        panel.add(exitBtn);

        // Add Listeners
        loginBtn.addMouseListener(this);
        exitBtn.addMouseListener(this);

        loginBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        // Radio Buttons
        JRadioButton r1 = new JRadioButton("OOP1 G");
        r1.setBounds(450, 50, 100, 20);
        panel.add(r1);

        JRadioButton r2 = new JRadioButton("OOP1 C");
        r2.setBounds(450, 80, 100, 20);
        panel.add(r2);

        JRadioButton r3 = new JRadioButton("OOP2 I");
        r3.setBounds(450, 110, 100, 20);
        panel.add(r3);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);

        // Checkboxes
        JCheckBox c1 = new JCheckBox("FST");
        c1.setBounds(570, 50, 100, 20);
        panel.add(c1);

        JCheckBox c2 = new JCheckBox("FE");
        c2.setBounds(570, 80, 100, 20);
        panel.add(c2);

        JCheckBox c3 = new JCheckBox("FBA");
        c3.setBounds(570, 110, 100, 20);
        panel.add(c3);

        // Combo Box
        String items[] = {"CSE", "CS", "CSSE", "SE", "CIS"};
        JComboBox<String> combo = new JComboBox<>(items);
        combo.setBounds(100, 50, 100, 30);
        panel.add(combo);

        // Image
        ImageIcon img = new ImageIcon("oop1g.jpg");
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(450, 150, 200, 112);
        panel.add(imgLabel);

        this.add(panel);
        this.setVisible(true);
    }

    // ---------------------------
    // MouseListener Methods
    // ---------------------------

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == loginBtn) {
            loginBtn.setBackground(Color.GREEN);
            loginBtn.setForeground(Color.BLACK);
        }
        else if (me.getSource() == exitBtn) {
            exitBtn.setBackground(Color.RED);
            exitBtn.setForeground(Color.BLACK);
        }
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == loginBtn) {
            loginBtn.setBackground(Color.BLACK);
            loginBtn.setForeground(Color.WHITE);
        }
        else if (me.getSource() == exitBtn) {
            exitBtn.setBackground(Color.BLACK);
            exitBtn.setForeground(Color.WHITE);
        }
    }

    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseClicked(MouseEvent me) {}

    // ---------------------------
    // ActionListener Method
    // ---------------------------

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (loginBtn.getText().equals(command)) {
            String s1 = userTF.getText();
            String s2 = new String(passPF.getPassword());

            if (s1.equals("admin") && s2.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }
        }
        else if (exitBtn.getText().equals(command)) {
            System.exit(0);
        }
    }

    
    
}
