import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.io.*;

public class Avaibility extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;
    int sl, dl;
    private int singleAvle = 100, doubleAvble = 50;

    public Avaibility() {
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
        // ------------------------checking files--------------

        try {
            File singleFile = new File("Single Beds");
            File doubleFile = new File("Double Beds");
            String[] singleFileCount = singleFile.list();
            String[] doubleFileCount = doubleFile.list();
            sl = singleFileCount.length;
            dl = doubleFileCount.length;
        } catch (Exception e) {
            System.out.println(e);
        }

        // -------------------------------content pane-----------------
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new LineBorder(new Color(0, 128, 192), 4));
        panel.setBackground(new Color(64, 0, 128));
        panel.setBounds(10, 131, 964, 409);
        contentPane.add(panel);

        JLabel SingleBed = new JLabel("Single Bed");
        SingleBed.setHorizontalAlignment(SwingConstants.CENTER);
        SingleBed.setForeground(Color.WHITE);
        SingleBed.setFont(new Font("Verdana", Font.ITALIC, 36));
        SingleBed.setBackground(new Color(45, 58, 225));
        SingleBed.setBounds(10, 5, 469, 45);
        panel.add(SingleBed);

        JLabel SingleBed_1 = new JLabel("Double Bed");
        SingleBed_1.setHorizontalAlignment(SwingConstants.CENTER);
        SingleBed_1.setForeground(Color.WHITE);
        SingleBed_1.setFont(new Font("Verdana", Font.ITALIC, 36));
        SingleBed_1.setBounds(484, 5, 470, 45);
        panel.add(SingleBed_1);

        JLabel lblTotalNumberOf = new JLabel("Total number of single bed rooms : 100");
        lblTotalNumberOf.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotalNumberOf.setForeground(Color.WHITE);
        lblTotalNumberOf.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblTotalNumberOf.setBounds(35, 83, 416, 45);
        panel.add(lblTotalNumberOf);

        JLabel singleVariable = new JLabel("Availabe : " + (singleAvle - sl));
        singleVariable.setHorizontalAlignment(SwingConstants.CENTER);
        singleVariable.setForeground(Color.WHITE);
        singleVariable.setFont(new Font("Verdana", Font.PLAIN, 18));
        singleVariable.setBounds(75, 139, 316, 45);
        panel.add(singleVariable);

        JLabel lblOccupied = new JLabel("");
        lblOccupied.setHorizontalAlignment(SwingConstants.CENTER);
        lblOccupied.setForeground(Color.WHITE);
        lblOccupied.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblOccupied.setBounds(35, 195, 316, 45);
        panel.add(lblOccupied);

        JLabel lblNumberOfSingle = new JLabel("Total number of double bed rooms : 50 ");
        lblNumberOfSingle.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumberOfSingle.setForeground(Color.WHITE);
        lblNumberOfSingle.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblNumberOfSingle.setBounds(525, 83, 408, 45);
        panel.add(lblNumberOfSingle);

        JLabel doubleVariable = new JLabel("Availabe : " + (doubleAvble - dl));
        doubleVariable.setHorizontalAlignment(SwingConstants.CENTER);
        doubleVariable.setForeground(Color.WHITE);
        doubleVariable.setFont(new Font("Verdana", Font.PLAIN, 18));
        doubleVariable.setBounds(571, 139, 316, 45);
        panel.add(doubleVariable);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(469, 5, 10, 399);
        panel.add(panel_1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
