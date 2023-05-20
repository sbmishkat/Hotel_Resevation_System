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

public class LoginPage extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;
    private JTextField s5;
    private JTextField s6;
    private JTextField s4;
    File file;
    JButton submit;
    private JTextField s7;

    public LoginPage() {
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

        JLabel s2 = new JLabel("Name ");
        s2.setHorizontalAlignment(SwingConstants.CENTER);
        s2.setBounds(44, 89, 70, 31);
        contentPane.add(s2);

        JLabel s3 = new JLabel("Mobile");
        s3.setHorizontalAlignment(SwingConstants.CENTER);
        s3.setBounds(44, 140, 70, 31);
        contentPane.add(s3);

        JLabel s1 = new JLabel("Room Number");
        s1.setHorizontalAlignment(SwingConstants.CENTER);
        s1.setBounds(101, 47, 70, 31);
        contentPane.add(s1);

        submit = new JButton("Submit");

        submit.setBounds(121, 256, 183, 70);
        contentPane.add(submit);

        JLabel lblCreditCard = new JLabel("Credit Card");
        lblCreditCard.setHorizontalAlignment(SwingConstants.CENTER);
        lblCreditCard.setBounds(44, 200, 70, 31);
        contentPane.add(lblCreditCard);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 446, 492);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void singlebed() {
        s5 = new JTextField();
        s5.setBounds(134, 94, 218, 20);
        contentPane.add(s5);
        s5.setColumns(10);
        s6 = new JTextField();
        s6.setColumns(10);
        s6.setBounds(134, 145, 218, 20);
        contentPane.add(s6);
        s4 = new JTextField();
        s4.setColumns(10);
        s4.setBounds(191, 52, 38, 20);
        contentPane.add(s4);
        s7 = new JTextField();
        s7.setBounds(152, 205, 152, 20);
        contentPane.add(s7);
        s7.setColumns(10);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String card = s7.getText();
                String roomNum = s4.getText();
                String name = s5.getText();
                String mobile = s6.getText();
                try{
                    int n = Integer.parseInt(roomNum);

                    if (n > 0 && n < 101) {
                        if (name.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "All information required");
                        } else {
                            if (card.isEmpty() || mobile.isEmpty() || roomNum.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "All information required");
                            } else {
                                try {
                                    Integer.parseInt(mobile);
                                    Integer.parseInt(roomNum);
                                    Long.parseLong(card);
                                    file = new File("Single Beds/" + roomNum + ".txt");
                                    if (file.exists()) {
                                        JOptionPane.showMessageDialog(null, "Already exist");
                                    } else {
                                        try {
                                            FileWriter file = new FileWriter("Single Beds/" + roomNum + ".txt");
                                            file.write(roomNum + "\n" + name + "\n" + mobile);
                                            file.close();
                                            dispose();
                                        } catch (Exception e1) {
                                            dispose();
                                        }
                                    }
                                } catch (NumberFormatException e1) {
                                    JOptionPane.showMessageDialog(null, "Wrong input");
                                }

                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Does not exist");
                    }
                }catch(Exception e3){
                    JOptionPane.showMessageDialog(null, "Wrong input");
                }
            }
        });

    }

    public void doublebed() {
        s5 = new JTextField();
        s5.setBounds(134, 94, 218, 20);
        contentPane.add(s5);
        s5.setColumns(10);
        s6 = new JTextField();
        s6.setColumns(10);
        s6.setBounds(134, 145, 218, 20);
        contentPane.add(s6);
        s4 = new JTextField();
        s4.setColumns(10);
        s4.setBounds(191, 52, 38, 20);
        contentPane.add(s4);
        s7 = new JTextField();
        s7.setBounds(152, 205, 152, 20);
        contentPane.add(s7);
        s7.setColumns(10);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String card = s7.getText();
                String roomNum = s4.getText();
                String name = s5.getText();
                String mobile = s6.getText();
                try{
                    int n = Integer.parseInt(roomNum);
                    if (n > 0 && n < 51) {
                        if (name.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "All information required");
                        } else {
                            if (card.isEmpty() || mobile.isEmpty() || roomNum.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "All information required");
                            } else {
                                try {
                                    Integer.parseInt(mobile);
                                    Integer.parseInt(roomNum);
                                    Long.parseLong(card);
                                    file = new File("Double Beds/" + roomNum + ".txt");
                                    if (file.exists()) {
                                        JOptionPane.showMessageDialog(null, "Already exist");
                                    } else {
                                        try {
                                            FileWriter file = new FileWriter("Double Beds/" + roomNum + ".txt");
                                            file.write(roomNum + "\n" + name + "\n" + mobile);
                                            file.close();
                                            dispose();
                                        } catch (Exception e1) {
                                            dispose();
                                        }
                                    }
                                } catch (NumberFormatException e1) {
                                    JOptionPane.showMessageDialog(null, "Wrong input");
                                }

                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Does not exist");
                    }
                }catch(Exception e3){
                    JOptionPane.showMessageDialog(null, "Wrong input");
                }


            }
        });

    }
}
