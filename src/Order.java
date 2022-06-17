import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Order extends JPanel {

	private JTextField courseIDInputFirld;
	private JLabel searchOrderLabel, order;
	private JButton search;
	private SQL sql = new SQL();

	
	public Order() {
		setBounds(300, 100, 900, 600);
		setLayout(null);

		ImageIcon redBtn = new ImageIcon(this.getClass().getResource("/RedBtn.png"));

		searchOrderLabel = new JLabel("Please input the course ID");
		searchOrderLabel.setBounds(178, 155, 500, 48);
		searchOrderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		searchOrderLabel.setFont(new Font("Corbel Light", Font.PLAIN, 30));
		this.add(searchOrderLabel);

		courseIDInputFirld = new JTextField();
		courseIDInputFirld.setBounds(268, 213, 326, 33);
		this.add(courseIDInputFirld);
		courseIDInputFirld.setColumns(10);

		order = new JLabel("Search orders");
		order.setFont(new Font("Calisto MT", Font.BOLD, 14));
		order.setHorizontalAlignment(SwingConstants.CENTER);
		order.setBounds(355, 256, 144, 61);
		this.add(order);

		search = new JButton("");
		search.setIcon(redBtn);
		search.setOpaque(false);
		search.setContentAreaFilled(false);
		search.setBorderPainted(false);
		search.setBounds(338, 256, 180, 61);
		this.add(search);
		this.setButton();
	}

	public void setButton() {
		this.search.addActionListener(null);
	}
}
