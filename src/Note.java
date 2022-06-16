import javax.swing.JPanel;
import javax.swing.JTable;

public class Note extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Note() {
		setBounds(300, 100, 900, 600);
		setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 900, 600);
		add(table);
	}
}
