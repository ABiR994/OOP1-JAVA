package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;
import File.*;

public class StudentManagerPage extends JFrame implements ActionListener {

    Font font15 = new Font("Consolas", Font.BOLD, 15);
    JLabel titleLabel, idLabel, nameLabel, cgpaLabel, searchLabel;
    JTextField idTf, nameTf, cgpaTf, searchTf;
    JTextArea screen;
    JButton addBtn, updateBtn, deleteBtn, loadBtn, saveBtn, clearBtn, searchBtn;

    Student[] students = new Student[100];

    public StudentManagerPage() {
        super("Student Manager");
        this.setSize(800, 600);
        this.setLocation(200, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 800, 600);
        panel.setLayout(null);
        panel.setBackground(new Color(230, 230, 250));
        this.add(panel);

        FileIO.loadFromFile(students);

        titleLabel = createLabel(panel, 10, 0, 300, 30, "Student Manager");

        idLabel = createLabel(panel, 10, 50, 100, 30, "Student ID");
        idTf = createTextField(panel, 120, 50, 150, 30, "");

        nameLabel = createLabel(panel, 10, 90, 100, 30, "Name");
        nameTf = createTextField(panel, 120, 90, 150, 30, "");

        cgpaLabel = createLabel(panel, 10, 130, 100, 30, "CGPA");
        cgpaTf = createTextField(panel, 120, 130, 150, 30, "");

        addBtn = createButton(panel, 10, 180, 120, 30, "Add", new Color(70, 130, 180));
        updateBtn = createButton(panel, 140, 180, 120, 30, "Update", new Color(34, 139, 34));
        deleteBtn = createButton(panel, 270, 180, 120, 30, "Delete", new Color(178, 34, 34));

        loadBtn = createButton(panel, 10, 220, 120, 30, "Load", new Color(72, 61, 139));
        saveBtn = createButton(panel, 140, 220, 120, 30, "Save", new Color(123, 104, 238));
        clearBtn = createButton(panel, 270, 220, 120, 30, "Clear", new Color(105, 105, 105));

        searchTf = createTextField(panel, 10, 270, 150, 30, "");
        searchBtn = createButton(panel, 170, 270, 120, 30, "Search", new Color(255, 140, 0));

        screen = new JTextArea();
        screen.setFont(font15);
        JScrollPane scrollPane = new JScrollPane(screen);
        scrollPane.setBounds(10, 320, 760, 220);
        panel.add(scrollPane);

        updateScreen();

        this.setVisible(true);
    }

    JLabel createLabel(JPanel panel, int x, int y, int w, int h, String text) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, w, h);
        label.setFont(font15);
        panel.add(label);
        return label;
    }

    JTextField createTextField(JPanel panel, int x, int y, int w, int h, String text) {
        JTextField tf = new JTextField(text);
        tf.setBounds(x, y, w, h);
        tf.setFont(font15);
        panel.add(tf);
        return tf;
    }

    JButton createButton(JPanel panel, int x, int y, int w, int h, String text, Color bgColor) {
        JButton btn = new JButton(text);
        btn.setBounds(x, y, w, h);
        btn.setFont(font15);
        btn.setBackground(bgColor);
        btn.setForeground(Color.white);
        btn.addActionListener(this);
        panel.add(btn);
        return btn;
    }

    void updateScreen() {
        String all = "";
        for (Student s : students) {
            if (s != null) all += s.getStudentInfo() + "\n";
        }
        screen.setText(all);
    }

 
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == addBtn) {
                String id = idTf.getText();
                if (!idExists(id)) {
                    students[getEmptyIndex()] = new Student(id, nameTf.getText(), Double.parseDouble(cgpaTf.getText()));
                    updateScreen();
                } else JOptionPane.showMessageDialog(this, "ID already exists!");
            } else if (e.getSource() == updateBtn) {
                String id = idTf.getText();
                int idx = getIndexById(id);
                if (idx != -1) {
                    students[idx].setName(nameTf.getText());
                    students[idx].setCgpa(Double.parseDouble(cgpaTf.getText()));
                    updateScreen();
                } else JOptionPane.showMessageDialog(this, "Student not found!");
            } else if (e.getSource() == deleteBtn) {
                String id = idTf.getText();
                int idx = getIndexById(id);
                if (idx != -1) {
                    students[idx] = null;
                    updateScreen();
                } else JOptionPane.showMessageDialog(this, "Student not found!");
            } else if (e.getSource() == loadBtn) {
                FileIO.loadFromFile(students);
                updateScreen();
            } else if (e.getSource() == saveBtn) {
                FileIO.saveChangesInFile(students);
                JOptionPane.showMessageDialog(this, "Saved Successfully!");
            } else if (e.getSource() == clearBtn) {
                idTf.setText(""); nameTf.setText(""); cgpaTf.setText(""); searchTf.setText("");
            } else if (e.getSource() == searchBtn) {
                String id = searchTf.getText();
                int idx = getIndexById(id);
                if (idx != -1) {
                    Student s = students[idx];
                    idTf.setText(s.getId());
                    nameTf.setText(s.getName());
                    cgpaTf.setText(String.valueOf(s.getCgpa()));
                } else JOptionPane.showMessageDialog(this, "Student not found!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numeric CGPA!");
        }
    }

    int getEmptyIndex() {
        for (int i = 0; i < students.length; i++)
            if (students[i] == null) return i;
        return -1;
    }

    int getIndexById(String id) {
        for (int i = 0; i < students.length; i++)
            if (students[i] != null && students[i].getId().equals(id)) return i;
        return -1;
    }

    boolean idExists(String id) {
        return getIndexById(id) != -1;
    }
}
