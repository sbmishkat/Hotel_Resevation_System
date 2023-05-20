import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.io.*;
public class Admin extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;
    private JTextField id;
    private JTextField password;
    private JPanel adminPanel;
    JPanel singleShowPanel;
    JPanel doubleShowPanel;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;

    public Admin() {
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

        adminPanel = new JPanel();
        adminPanel.setBounds(333, 10, 318, 55);
        contentPane.add(adminPanel);
        adminPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblNewLabel = new JLabel("ID");
        adminPanel.add(lblNewLabel);

        id = new JTextField();
        adminPanel.add(id);
        id.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Password");
        adminPanel.add(lblNewLabel_1);

        password = new JTextField();
        adminPanel.add(password);
        password.setColumns(10);

        JButton enterButton = new JButton("Enter");
        adminPanel.add(enterButton);

        singleShowPanel = new JPanel();
        singleShowPanel.setBounds(10, 66, 475, 584);
        contentPane.add(singleShowPanel);

        lblNewLabel_2 = new JLabel("Delete Single Bed");
        singleShowPanel.add(lblNewLabel_2);

        doubleShowPanel = new JPanel();
        doubleShowPanel.setBounds(483, 66, 491, 584);
        contentPane.add(doubleShowPanel);

        lblNewLabel_3 = new JLabel("Delete Double bed");
        doubleShowPanel.add(lblNewLabel_3);
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String idt = id.getText();
                String pass = password.getText();
                if (!idt.isEmpty() && !pass.isEmpty()) {
                    if (!idt.equals("group1") && !pass.equals("12345678")) {
                        JOptionPane.showMessageDialog(null, "Invalid Credintenals");
                    } else {
                        adminPanel.setVisible(false);
                        showRoomS();
                        showRoomB();
                    }
                }
            }
        });
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void showRoomS() {
        File singleFile = new File("Single Beds");
        String[] singleFileCount = singleFile.list();
        int sl = singleFileCount.length;
        JButton[] buttons = new JButton[sl];
        for (int i = 0; i < sl; i++) {
            JButton button = new JButton(singleFileCount[i]);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File singleFile = new File("Single Beds/" + ((JButton) e.getSource()).getText());
                    singleFile.delete();

                }
            });
            buttons[i] = button;
            singleShowPanel.add(button);
        }
    }

    public void showRoomB() {
        File singleFile = new File("Double Beds");
        String[] singleFileCount = singleFile.list();
        int sl = singleFileCount.length;
        JButton[] buttons = new JButton[sl];
        for (int i = 0; i < sl; i++) {
            JButton button = new JButton(singleFileCount[i]);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File singleFile = new File("Double Beds/" + ((JButton) e.getSource()).getText());
                    singleFile.delete();

                }
            });
            buttons[i] = button;
            doubleShowPanel.add(button);
        }
    }

}
