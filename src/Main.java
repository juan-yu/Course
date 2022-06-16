import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Main {
	//TODO
	//Test 09:50pm from dt
	private static JFrame frame;
	private JTextField studentIDField;
	private JPasswordField passwordField;
	private JTabbedPane tabbedPane;
	private JPanel order,comment,note,logInPanel;
	private JLabel CommentSearchFrame;
	private JLabel MainFrame;
	private JLabel lblLoginReg;
	private JLabel OrderSearchFrame;
	private JLabel NoteSearchFrame,lblLogOut,lblLogOut2;

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
	/*public static JFrame getFrame() {
		return frame;
	}*/

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		order=new Order();
		comment=new Comment();
		note=new Note();
		
		ImageIcon mainFrame = new ImageIcon(this.getClass().getResource("/MainScreen.png"));
		ImageIcon SearchFrame = new ImageIcon(this.getClass().getResource("/SearchFrame2.png"));
		ImageIcon Button = new ImageIcon(this.getClass().getResource("/YellowBtn.png"));
		ImageIcon redBtn = new ImageIcon(this.getClass().getResource("/RedBtn.png"));
		
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
		order.add(lblLogOut);
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setFont(new Font("Calisto MT", Font.BOLD, 12));
		
		lblLogOut2 = new JLabel("Log Out");
		lblLogOut2.setBounds(771, 30, 59, 15);
		lblLogOut2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut2.setFont(new Font("Calisto MT", Font.BOLD, 12));
		comment.add(lblLogOut2);
		
		
		JButton logOutButton = new JButton("");
		logOutButton.setVisible(false);
		logOutButton.setIcon(null);
		logOutButton.setOpaque(false);
		logOutButton.setContentAreaFilled(false);
		logOutButton.setBorderPainted(false);
		logOutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logInPanel.setVisible(true);
				tabbedPane.setVisible(false);
				logOutButton.setVisible(false);
			}
		});
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
		
		JButton logInRegisterButton = new JButton("");
		logInRegisterButton.setIcon(Button);
		logInRegisterButton.setBounds(18, 212, 188, 71);
		logInRegisterButton.setOpaque(false);
		logInRegisterButton.setContentAreaFilled(false);
		logInRegisterButton.setBorderPainted(false);
		logInPanel.add(logInRegisterButton);
		logInRegisterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText("");
				logInPanel.setVisible(false);
				tabbedPane.setVisible(true);
				logOutButton.setVisible(true);
			}
		});
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
		
		tabbedPane.add("order",order);
		tabbedPane.add("comment",comment);
		tabbedPane.add("note",note);
		
		OrderSearchFrame = new JLabel("");
		OrderSearchFrame.setIcon(SearchFrame);
		OrderSearchFrame.setBounds(-85, 0, 985, 537);
		order.add(OrderSearchFrame);

		CommentSearchFrame = new JLabel("");
		CommentSearchFrame.setIcon(SearchFrame);
		CommentSearchFrame.setBounds(-85, 0, 985, 537);
		comment.add(CommentSearchFrame);
		comment.setLayout(null);
		
		
		NoteSearchFrame = new JLabel("");
		NoteSearchFrame.setIcon(SearchFrame);
		NoteSearchFrame.setBounds(-85, 0, 985, 537);
		note.add(NoteSearchFrame);
		note.setLayout(null);
		
		MainFrame = new JLabel("New label");
		MainFrame.setIcon(mainFrame);
		MainFrame.setBounds(-85, 0, 985, 537);
		frame.getContentPane().add(MainFrame);
	}
}
