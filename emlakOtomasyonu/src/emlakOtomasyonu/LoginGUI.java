package emlakOtomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginGUI extends JFrame {

	private JPanel w_pane;
	private JTextField fld_email;
	private JTextField fld_password;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Emlak Otomasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 560);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(240, 240, 240));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("logo.jpg")));
		lbl_logo.setBounds(322, 10, 140, 100);
		w_pane.add(lbl_logo);
		
		JTabbedPane w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBounds(10, 178, 766, 335);
		w_pane.add(w_tabpane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		w_tabpane.addTab("Customer Login", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(126, 62, 114, 31);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		fld_email = new JTextField();
		fld_email.setBounds(299, 62, 281, 31);
		panel.add(fld_email);
		fld_email.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(126, 117, 114, 31);
		panel.add(lblPassword);
		
		fld_password = new JTextField();
		fld_password.setColumns(10);
		fld_password.setBounds(299, 117, 281, 31);
		panel.add(fld_password);
		
		JButton btn_signUp = new JButton("Sign Up");
		btn_signUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signUp.setBounds(126, 176, 200, 59);
		panel.add(btn_signUp);
		
		JButton btn_signIn = new JButton("Sign In");
		btn_signIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signIn.setBounds(380, 176, 200, 59);
		panel.add(btn_signIn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		w_tabpane.addTab("Admin Login", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(152, 54, 114, 31);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(325, 54, 281, 31);
		panel_1.add(textField);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword_1.setBounds(152, 109, 114, 31);
		panel_1.add(lblPassword_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(325, 109, 281, 31);
		panel_1.add(textField_1);
		
		JButton btn_signUp_1 = new JButton("Sign Up");
		btn_signUp_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signUp_1.setBounds(152, 168, 200, 59);
		panel_1.add(btn_signUp_1);
		
		JButton btn_signIn_1 = new JButton("Sign In");
		btn_signIn_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signIn_1.setBounds(406, 168, 200, 59);
		panel_1.add(btn_signIn_1);
		
		JLabel lblNewLabel_1 = new JLabel("Property Management System");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(278, 120, 235, 44);
		w_pane.add(lblNewLabel_1);
	}
}
