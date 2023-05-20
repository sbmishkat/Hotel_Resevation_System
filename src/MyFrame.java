import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class MyFrame extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;

    public MyFrame() {
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
        // -------------------------------button-----------------
        JButton btnNewButton = new JButton("Room Details");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RoomInfo roomInfo = new RoomInfo();
            }
        });
        btnNewButton.setBounds(70, 323, 145, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Room Availability");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Avaibility avaibility = new Avaibility();
            }
        });
        btnNewButton_1.setBounds(294, 323, 157, 23);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Booking");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Booking booking = new Booking();
            }
        });
        btnNewButton_2.setBounds(524, 323, 145, 23);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_4 = new JButton("Checkout");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Check check =new Check();
            }
        });
        btnNewButton_4.setBounds(739, 323, 136, 23);
        contentPane.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Exit");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_5.setBounds(396, 391, 190, 23);
        contentPane.add(btnNewButton_5);
        // -------------------------------welcome label-----------------
        JLabel wecomeLabel = new JLabel("Welcome to our Hotel");
        wecomeLabel.setForeground(Color.WHITE);
        wecomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        wecomeLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        wecomeLabel.setBounds(275, 170, 416, 31);
        contentPane.add(wecomeLabel);
        // -------------------------------name of hotel-----------------
        JLabel lblNewLabel = new JLabel("HOTEL GALAXY");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 40));
        lblNewLabel.setBounds(297, 59, 372, 111);
        contentPane.add(lblNewLabel);

        JButton admin = new JButton("Admin");
        admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin admin =new Admin();
            }
        });
        admin.setBounds(820, 575, 108, 37);
        contentPane.add(admin);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
