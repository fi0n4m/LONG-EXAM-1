import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySocials extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySocials frame = new MySocials();
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
	public MySocials() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MySocialsPic = new JLabel("");
		MySocialsPic.setIcon(new ImageIcon("/Users/fionamartinez/Desktop/Portfolio/6.png"));
		MySocialsPic.setBounds(0, 0, 800, 478);
		contentPane.add(MySocialsPic);
		
		JLabel MySclsBack = new JLabel("");
		MySclsBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home Home = new Home();
				Home.setVisible(true);
				dispose();
			}
		});
		MySclsBack.setBounds(6, 19, 46, 26);
		contentPane.add(MySclsBack);
	}

}
