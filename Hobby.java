import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hobby extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hobby frame = new Hobby();
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
	public Hobby() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HobbyPic = new JLabel("");
		HobbyPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HireMe HireMe = new HireMe();
				HireMe.setVisible(true);
				dispose();
			}
		});
		HobbyPic.setIcon(new ImageIcon("/Users/fionamartinez/Desktop/Portfolio/4.png"));
		HobbyPic.setBounds(0, 0, 884, 478);
		contentPane.add(HobbyPic);
		
		JLabel HbbyBack = new JLabel("");
		HbbyBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home Home = new Home();
				Home.setVisible(true);
				dispose();
			}
		});
		HbbyBack.setBounds(6, 19, 46, 28);
		contentPane.add(HbbyBack);
		
		JLabel HrMe = new JLabel("New label");
		HrMe.setBounds(534, 30, 61, 16);
		contentPane.add(HrMe);
	}

}
