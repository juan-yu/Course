import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class Main {

	private static JFrame frame;
	private JTextField studentIDField;
	private JPasswordField passwordField;
	private JTabbedPane tabbedPane;
	private JPanel order, comment, note, administrator, logInPanel;
	private JLabel CommentSearchFrame, MainFrame, OrderSearchFrame, NoteSearchFrame, AdminFrame;
	private JLabel lblLoginReg, lblLogOut, lblLogOut2, lblLogOut3;
	private JButton logOutButton, logInRegisterButton;
	private int count = 0;
	private ImageIcon mainFrame = new ImageIcon(this.getClass().getResource("/MainScreen.png"));
	private ImageIcon SearchFrame = new ImageIcon(this.getClass().getResource("/SearchFrame2.png"));
	private ImageIcon Button = new ImageIcon(this.getClass().getResource("/YellowBtn.png"));
	private ImageIcon redBtn = new ImageIcon(this.getClass().getResource("/RedBtn.png"));
	
	/*
	 * Last Modified Version By Orange Tsai at 18 Jun, 03:00 
	 * Note: id and password are the same and you can enter the next page 
	 * Add: Function in the login page, including button and textfield
	 * Add: Administrator class(page), but it is still preparing
	 * Add: SQl class, but it is also preparing
	 * Change: local variables to global variables
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	/*
	 * public static JFrame getFrame() { return frame; }
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		order = new Order();
		comment = new Comment();
		note = new Note();
		administrator = new Administrator();

		frame = new JFrame();
		frame.setBounds(300, 20, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		logInPanel = new JPanel();
		logInPanel.setBackground(Color.WHITE);
		logInPanel.setBounds(330, 120, 232, 281);
		logInPanel.setBorder(null);
		frame.getContentPane().add(logInPanel);
		logInPanel.setLayout(null);

		lblLogOut = new JLabel("Log Out");
		lblLogOut.setBounds(771, 30, 59, 15);
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setFont(new Font("Calisto MT", Font.BOLD, 12));
		order.add(lblLogOut);

		lblLogOut2 = new JLabel("Log Out");
		lblLogOut2.setBounds(771, 30, 59, 15);
		lblLogOut2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut2.setFont(new Font("Calisto MT", Font.BOLD, 12));
		comment.add(lblLogOut2);

		lblLogOut3 = new JLabel("Log Out");
		lblLogOut3.setBounds(771, 30, 59, 15);
		lblLogOut3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut3.setFont(new Font("Calisto MT", Font.BOLD, 12));
		administrator.add(lblLogOut3);

		logOutButton = new JButton("");
		logOutButton.setVisible(false);
		logOutButton.setIcon(null);
		logOutButton.setOpaque(false);
		logOutButton.setContentAreaFilled(false);
		logOutButton.setBorderPainted(false);
		logOutButton.setBounds(756, 46, 93, 31);
		frame.getContentPane().add(logOutButton);

		lblLoginReg = new JLabel("Login | Register");
		lblLoginReg.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginReg.setFont(new Font("Calisto MT", Font.BOLD, 14));
		lblLoginReg.setBounds(45, 224, 133, 47);
		logInPanel.add(lblLoginReg);

		JLabel studentID = new JLabel("Student ID:");
		studentID.setBounds(0, 0, 232, 40);
		logInPanel.add(studentID);
		studentID.setFont(new Font("Corbel Light", Font.PLAIN, 26));

		JLabel password = new JLabel("Password:");
		password.setBounds(0, 100, 232, 40);
		logInPanel.add(password);
		password.setFont(new Font("Corbel Light", Font.PLAIN, 26));

		passwordField = new JPasswordField();
		passwordField.setBounds(0, 150, 232, 40);
		logInPanel.add(passwordField);
		password.setFont(new Font("Corbel Light", Font.PLAIN, 28));

		logInRegisterButton = new JButton("");
		logInRegisterButton.setIcon(Button);
		logInRegisterButton.setBounds(18, 212, 188, 71);
		logInRegisterButton.setOpaque(false);
		logInRegisterButton.setContentAreaFilled(false);
		logInRegisterButton.setBorderPainted(false);
		logInPanel.add(logInRegisterButton);

		logInRegisterButton.setFont(new Font("PMingLiU", Font.PLAIN, 20));

		studentIDField = new JTextField();
		studentIDField.setFont(new Font("PMingLiU", Font.PLAIN, 17));
		studentIDField.setBounds(0, 50, 232, 40);
		logInPanel.add(studentIDField);
		studentIDField.setColumns(10);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 900, 600);
		tabbedPane.setVisible(false);
		frame.getContentPane().add(tabbedPane);

		tabbedPane.add("order", order);
		tabbedPane.add("comment", comment);
		tabbedPane.add("note", note);

		OrderSearchFrame = new JLabel("");
		OrderSearchFrame.setIcon(SearchFrame);
		OrderSearchFrame.setBounds(-85, 0, 985, 537);
		order.add(OrderSearchFrame);

		CommentSearchFrame = new JLabel("");
		CommentSearchFrame.setIcon(SearchFrame);
		CommentSearchFrame.setBounds(-85, 0, 985, 537);
		comment.add(CommentSearchFrame);
		comment.setLayout(null);

		AdminFrame = new JLabel("");
		AdminFrame.setIcon(SearchFrame);
		AdminFrame.setBounds(-85, 0, 985, 537);
		administrator.add(AdminFrame);
		administrator.setLayout(null);

		NoteSearchFrame = new JLabel("");
		NoteSearchFrame.setIcon(SearchFrame);
		NoteSearchFrame.setBounds(-85, 0, 985, 537);
		note.add(NoteSearchFrame);
		note.setLayout(null);

		MainFrame = new JLabel("New label");
		MainFrame.setIcon(mainFrame);
		MainFrame.setBounds(-85, 0, 985, 537);
		frame.getContentPane().add(MainFrame);

		this.setButton();
		this.setTextField();
	}

	/*
	 * setButton():set all the buttons' action
	 */
	private void setButton() {

		// login/register button
		this.logInRegisterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.this.login();
			}
		});

		// logout button
		this.logOutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure to logout the system?", "Logout?",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if (result == 0) { // yes
					logInPanel.setVisible(true);
					tabbedPane.setVisible(false);
					logOutButton.setVisible(false);
				} else if (result == 1) { // no
				}
			}
		});

	}

	/*
	 * setTextField():set all the textFields' action
	 */
	private void setTextField() {

		// studentIDField
		this.studentIDField.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent event) {
				if (Main.this.passwordField.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Please input your password", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		// passwordField
		this.passwordField.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent event) {
				login();
			}
		});
	}

	// TODO: set condition
	private void login() {
		String id = Main.this.studentIDField.getText();
		String password = Main.this.passwordField.getText();
		if (id.length() == 0) {
			JOptionPane.showMessageDialog(null, "Please input your StudentID", "Error Message",
					JOptionPane.ERROR_MESSAGE);
		} else if (password.length() == 0) {
			JOptionPane.showMessageDialog(null, "Please input your password", "Error Message",
					JOptionPane.ERROR_MESSAGE);
		} else if (id.equals(password)) {
			int result = JOptionPane.showConfirmDialog(null, "Are you administrator?", "Confirmation",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (result == 0)
				Main.this.tabbedPane.add("administrator", administrator);
			else Main.this.tabbedPane.remove(administrator);

			this.passwordField.setText("");
			logInPanel.setVisible(false);
			tabbedPane.setVisible(true);
			logOutButton.setVisible(true);
		} else {
			if (count > 5) {
				JOptionPane.showMessageDialog(null,
						"You have inputed the wrong StudentID and password more than 5 times", "Error Message",
						JOptionPane.ERROR_MESSAGE);
				Main.frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "StudentID and Password are wrong", "Error Message",
						JOptionPane.ERROR_MESSAGE);
				this.passwordField.setText("");
				this.count++;
			}
		}
	}
}
