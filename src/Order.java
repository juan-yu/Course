import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Order extends JPanel {
	private JTextField courseIDInputFirld;
	/**
	 * Create the panel.
	 */
	public Order() {
		setBounds(300, 100, 900, 600);
		setLayout(null);
		
		ImageIcon redBtn = new ImageIcon(this.getClass().getResource("/RedBtn.png"));
		
		JLabel searchOrderLabel = new JLabel("Please input the course ID");
		searchOrderLabel.setBounds(178, 155, 500, 48);
		searchOrderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		searchOrderLabel.setFont(new Font("Corbel Light", Font.PLAIN, 30));
		add(searchOrderLabel);
		
		courseIDInputFirld = new JTextField();
		courseIDInputFirld.setBounds(268, 213, 326, 33);
		add(courseIDInputFirld);
		courseIDInputFirld.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Search orders");
		lblNewLabel.setFont(new Font("Calisto MT", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(355, 256, 144, 61);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(redBtn);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(338, 256, 180, 61);
		add(btnNewButton);
	}
}
