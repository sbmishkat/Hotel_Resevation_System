import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class RoomInfo extends JFrame {

    private JPanel contentPane;
    private Image backgroundImage;

    public RoomInfo() {
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

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 128, 192), 4));
        panel.setBackground(new Color(64, 0, 128));
        panel.setBounds(10, 125, 964, 409);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel SingleBed = new JLabel("Single Bed");
        SingleBed.setForeground(Color.WHITE);
        SingleBed.setBounds(10, 5, 469, 45);
        panel.add(SingleBed);
        SingleBed.setBackground(new Color(45, 58, 225));
        SingleBed.setFont(new Font("Verdana", Font.ITALIC, 36));
        SingleBed.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel SingleBed_1 = new JLabel("Double Bed");
        SingleBed_1.setForeground(Color.WHITE);
        SingleBed_1.setBounds(484, 5, 470, 45);
        panel.add(SingleBed_1);
        SingleBed_1.setHorizontalAlignment(SwingConstants.CENTER);
        SingleBed_1.setFont(new Font("Verdana", Font.ITALIC, 36));

        JLabel lblNewLabel = new JLabel("Number of single beds : 1");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblNewLabel.setBounds(35, 83, 316, 45);
        panel.add(lblNewLabel);

        JLabel lblAcYes = new JLabel("AC : Yes");
        lblAcYes.setHorizontalAlignment(SwingConstants.CENTER);
        lblAcYes.setForeground(Color.WHITE);
        lblAcYes.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblAcYes.setBounds(135, 139, 316, 45);
        panel.add(lblAcYes);

        JLabel lblFreeBreakfast = new JLabel("Free breakfast : Yes");
        lblFreeBreakfast.setHorizontalAlignment(SwingConstants.CENTER);
        lblFreeBreakfast.setForeground(Color.WHITE);
        lblFreeBreakfast.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblFreeBreakfast.setBounds(35, 195, 316, 45);
        panel.add(lblFreeBreakfast);

        JLabel lblChargePerNight = new JLabel("Charge per night BDT : 5549");
        lblChargePerNight.setHorizontalAlignment(SwingConstants.CENTER);
        lblChargePerNight.setForeground(Color.WHITE);
        lblChargePerNight.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblChargePerNight.setBounds(163, 251, 316, 45);
        panel.add(lblChargePerNight);

        JLabel lblNumberOfSingle = new JLabel("Number of single beds : 2");
        lblNumberOfSingle.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumberOfSingle.setForeground(Color.WHITE);
        lblNumberOfSingle.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblNumberOfSingle.setBounds(638, 83, 316, 45);
        panel.add(lblNumberOfSingle);

        JLabel lblAcYes_1 = new JLabel("AC : Yes");
        lblAcYes_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblAcYes_1.setForeground(Color.WHITE);
        lblAcYes_1.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblAcYes_1.setBounds(484, 139, 316, 45);
        panel.add(lblAcYes_1);

        JLabel lblFreeBreakfast_1 = new JLabel("Free breakfast : Yes");
        lblFreeBreakfast_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblFreeBreakfast_1.setForeground(Color.WHITE);
        lblFreeBreakfast_1.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblFreeBreakfast_1.setBounds(638, 195, 316, 45);
        panel.add(lblFreeBreakfast_1);

        JLabel lblChargePerNight_2 = new JLabel("Charge per night BDT : 8999");
        lblChargePerNight_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblChargePerNight_2.setForeground(Color.WHITE);
        lblChargePerNight_2.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblChargePerNight_2.setBounds(484, 251, 316, 45);
        panel.add(lblChargePerNight_2);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(469, 5, 10, 399);
        panel.add(panel_1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
