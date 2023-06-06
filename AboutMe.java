import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutMe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
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
	public AboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel AboutMePic = new JLabel("");
		AboutMePic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				Achievements Achievements = new Achievements();
				Achievements.setVisible(true);
				dispose();
				
			}
		});
		AboutMePic.setIcon(new ImageIcon("/Users/fionamartinez/Desktop/Portfolio/2.png"));
		AboutMePic.setBounds(0, 0, 914, 478);
		contentPane.add(AboutMePic);
		
		JLabel AbtMeBack = new JLabel("");
		AbtMeBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home Home = new Home();
				Home.setVisible(true);
				dispose();
			}
		});
		AbtMeBack.setBounds(6, 20, 46, 32);
		contentPane.add(AbtMeBack);
		
		JLabel Achvmnts = new JLabel("New label");
		Achvmnts.setBounds(217, 20, 118, 32);
		contentPane.add(Achvmnts);
	}
}
