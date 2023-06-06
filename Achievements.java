import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Achievements extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achievements frame = new Achievements();
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
	public Achievements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel AchievementsPic = new JLabel("");
		AchievementsPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hobby Hobby = new Hobby();
				Hobby.setVisible(true);
				dispose();
			}
		});
		AchievementsPic.setIcon(new ImageIcon("/Users/fionamartinez/Desktop/Portfolio/3.png"));
		AchievementsPic.setBounds(0, 0, 800, 478);
		contentPane.add(AchievementsPic);
		
		JLabel AchvmntsBack = new JLabel("");
		AchvmntsBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home Home = new Home();
				Home.setVisible(true);
				dispose();
			}
		});
		AchvmntsBack.setBounds(6, 21, 46, 25);
		contentPane.add(AchvmntsBack);
		
		JLabel Hbbytbtn = new JLabel("New label");
		Hbbytbtn.setBounds(397, 21, 61, 29);
		contentPane.add(Hbbytbtn);
	}

}
