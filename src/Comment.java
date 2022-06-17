import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Comment extends JPanel {
	
	private JTextField courseIDInputFirld;
	private JButton searchBtn;
	private JLabel searchOrderLabel,comment;
	private SQL sql = new SQL();
	
	
	public Comment() {
		setBounds(300, 100, 900, 600);
		setLayout(null);

		ImageIcon redBtn = new ImageIcon(this.getClass().getResource("/RedBtn.png"));

		searchOrderLabel = new JLabel("Please input the course ID");
		searchOrderLabel.setBounds(178, 155, 500, 48);
		searchOrderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		searchOrderLabel.setFont(new Font("Corbel Light", Font.PLAIN, 30));
		add(searchOrderLabel);

		courseIDInputFirld = new JTextField();
		courseIDInputFirld.setBounds(268, 213, 326, 33);
		add(courseIDInputFirld);
		courseIDInputFirld.setColumns(10);

		comment = new JLabel("Search comments");
		comment.setFont(new Font("Calisto MT", Font.BOLD, 14));
		comment.setHorizontalAlignment(SwingConstants.CENTER);
		comment.setBounds(355, 256, 144, 61);
		add(comment);

		searchBtn = new JButton("");
		searchBtn.setIcon(redBtn);
		searchBtn.setBounds(338, 256, 180, 61);
		searchBtn.setOpaque(false);
		searchBtn.setContentAreaFilled(false);
		searchBtn.setBorderPainted(false);
		add(searchBtn);
		this.setButton();
	}

	private void setButton() {
		searchBtn.addActionListener(null);
	}

}
