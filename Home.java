import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HomePic =new JLabel("");
		HomePic.setIcon(new ImageIcon("/Users/fionamartinez/Desktop/Portfolio/1.png"));
		HomePic.setBounds(0, 0, 803, 478);
		contentPane.add(HomePic);
		
		JLabel HomeExit = new JLabel("");
		HomeExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		HomeExit.setBounds(708, 0, 71, 35);
		contentPane.add(HomeExit);
		
		JLabel AbtMeBtn = new JLabel("");
		AbtMeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe AboutMe = new AboutMe();
				AboutMe.setVisible(true);
				dispose();
			}
		});
		AbtMeBtn.setBounds(51, 436, 88, 36);
		contentPane.add(AbtMeBtn);
		
		JLabel AchvmntsBtn = new JLabel("");
		AchvmntsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Achievements Achievements = new Achievements();
				Achievements.setVisible(true);
				dispose();
			}
		});
		AchvmntsBtn.setBounds(195, 436, 117, 36);
		contentPane.add(AchvmntsBtn);
		
		JLabel HbbyBtn = new JLabel("");
		HbbyBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hobby Hobby = new Hobby();
				Hobby.setVisible(true);
				dispose();
			}
		});
		HbbyBtn.setBounds(370, 436, 71, 36);
		contentPane.add(HbbyBtn);
		
		JLabel HrMBtn = new JLabel("");
		HrMBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HireMe HireMe = new HireMe();
				HireMe.setVisible(true);
				dispose();
			}
		});
		HrMBtn.setBounds(503, 435, 78, 37);
		contentPane.add(HrMBtn);
		
		JLabel MySclsBtn = new JLabel("");
		MySclsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MySocials MySocials = new MySocials();
				MySocials.setVisible(true);
				dispose();
			}
		});
		MySclsBtn.setBounds(651, 436, 117, 26);
		contentPane.add(MySclsBtn);
	}
}
