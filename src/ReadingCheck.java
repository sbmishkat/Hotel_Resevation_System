import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class ReadingCheck extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;
    private JTextField s5;
    private JTextField s6;
    private JTextField s4;
    File file;
    private JButton submit;
    private JTextField roomNum;
    JLabel name;
    JLabel mobile;

    public ReadingCheck() {
        // -------------------------------background image-----------------
        setResizable(false);
        backgroundImage = Toolkit.getDefaultToolkit().getImage("homepic2.jpg");
        contentPane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, null);
                repaint();
            }
        };

        // -------------------------------content pane-----------------
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel s1 = new JLabel("Room Number");
        s1.setHorizontalAlignment(SwingConstants.CENTER);
        s1.setBounds(101, 47, 70, 31);
        contentPane.add(s1);

        submit = new JButton("Submit");

        submit.setBounds(121, 256, 183, 70);
        contentPane.add(submit);

        mobile = new JLabel();
        mobile.setHorizontalAlignment(SwingConstants.CENTER);
        mobile.setBounds(121, 138, 183, 38);
        contentPane.add(mobile);
        s4 = new JTextField();
        s4.setBounds(186, 52, 86, 20);
        contentPane.add(s4);
        s4.setColumns(10);
        name = new JLabel();
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setBounds(121, 89, 183, 38);
        contentPane.add(name);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 446, 492);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void singlebed() {

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String roomNum = s4.getText();
                try {
                    BufferedReader  file =new BufferedReader (new FileReader("Single Beds/" + roomNum + ".txt"));
                    String roomNumber = file.readLine();
                    String name1 = file.readLine();
                    name.setText(name1);
                    String mobile1 = file.readLine();
                    mobile.setText(mobile1);

                    file.close(); // close the FileReader
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Does not exist");
                }
            }
        });
    }

    public void doublebed() {
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String roomNum = s4.getText();
                try {
                    BufferedReader  file =new BufferedReader (new FileReader("Double Beds/" + roomNum + ".txt"));
                    String roomNumber = file.readLine();
                    String name1 = file.readLine();
                    name.setText(name1);
                    String mobile1 = file.readLine();
                    mobile.setText(mobile1);

                    file.close(); // close the FileReader
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Does not exist");
                }
            }
        });

    }
}
