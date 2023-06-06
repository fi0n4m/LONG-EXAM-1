import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HireMe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HireMe frame = new HireMe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HireMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HireMePic = new JLabel("");
		HireMePic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MySocials MySocials = new MySocials();
				MySocials.setVisible(true);
				dispose();
			}
		});
		HireMePic.setIcon(new ImageIcon("/Users/fionamartinez/Desktop/Portfolio/5.png"));
		HireMePic.setBounds(0, 0, 800, 472);
		contentPane.add(HireMePic);
		
		JLabel HrMBack = new JLabel("");
		HrMBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home Home = new Home();
				Home.setVisible(true);
				dispose();
			}
		});
		HrMBack.setBounds(6, 17, 46, 24);
		contentPane.add(HrMBack);
		
		JLabel MySclbtn = new JLabel("New label");
		MySclbtn.setBounds(665, 17, 115, 24);
		contentPane.add(MySclbtn);
	}

}
