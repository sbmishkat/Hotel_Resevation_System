import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.io.*;

public class Booking extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;
    private Image backgroundImageSingle;
    private Image backgroundImageDouble;
    LoginPage loginPage;

    public Booking() {

        // -------------------------------background image-----------------
        setResizable(false);
        backgroundImage = Toolkit.getDefaultToolkit().getImage("homepic2.jpg");
        backgroundImageSingle = Toolkit.getDefaultToolkit().getImage("singleBed.jpg");
        backgroundImageDouble = Toolkit.getDefaultToolkit().getImage("doubleBed.jpg");
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

        JPanel doublebed = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImageDouble, 0, 0, null);
            }
        };

        doublebed.setBounds(492, 113, 482, 460);
        contentPane.add(doublebed);
        doublebed.setLayout(null);

        JButton DoublePage = new JButton("Proceed");
        DoublePage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginPage = new LoginPage();
                loginPage.doublebed();
                dispose();
            }
        });
        DoublePage.setFont(new Font("Verdana", Font.BOLD, 30));
        DoublePage.setBounds(115, 291, 233, 98);
        doublebed.add(DoublePage);

        JLabel lblDoubleBed = new JLabel("DOUBLE BED");
        lblDoubleBed.setHorizontalAlignment(SwingConstants.CENTER);
        lblDoubleBed.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
        lblDoubleBed.setBounds(145, 55, 183, 70);
        doublebed.add(lblDoubleBed);

        JPanel singlebed = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImageSingle, 0, 0, null);
            }
        };
        singlebed.setBounds(10, 113, 482, 460);
        contentPane.add(singlebed);
        singlebed.setLayout(null);

        JButton singlePage = new JButton("Proceed");
        singlePage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginPage = new LoginPage();
                loginPage.singlebed();
                dispose();
            }
        });
        singlePage.setFont(new Font("Verdana", Font.BOLD, 30));
        singlePage.setBounds(102, 292, 233, 98);
        singlebed.add(singlePage);

        JLabel lblNewLabel = new JLabel("SINGLE BED");
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(118, 59, 183, 70);
        singlebed.add(lblNewLabel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
