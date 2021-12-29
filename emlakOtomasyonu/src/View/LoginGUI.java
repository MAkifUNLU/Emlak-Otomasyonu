package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.*;
import Model.Admin;
//import emlakOtomasyonu.dataBase;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginGUI extends JFrame {

	private JPanel w_pane;
	private JTextField fld_email;
	private JTextField fld_adminEmail;
	private JTextField textField_2;
	private JPasswordField fld_adminPw;
	private JPasswordField fld_stuffPw;
	private JPasswordField fld_customerPw;
	// private dataBase conn = new dataBase();
	private DBConnection conn = new DBConnection();

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
		setBounds(100, 100, 750, 500);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(240, 240, 240));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);

		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("logo.jpg")));
		lbl_logo.setBounds(321, 10, 140, 100);
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

		JButton btn_signUp = new JButton("Sign Up");
		btn_signUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signUp.setBounds(126, 176, 200, 59);
		panel.add(btn_signUp);

		JButton btn_signIn = new JButton("Sign In");
		btn_signIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signIn.setBounds(380, 176, 200, 59);
		panel.add(btn_signIn);

		fld_customerPw = new JPasswordField();
		fld_customerPw.setBounds(299, 117, 281, 31);
		panel.add(fld_customerPw);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		w_tabpane.addTab("Admin Login", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(152, 54, 114, 31);
		panel_1.add(lblNewLabel_2);

		fld_adminEmail = new JTextField();
		fld_adminEmail.setColumns(10);
		fld_adminEmail.setBounds(325, 54, 281, 31);
		panel_1.add(fld_adminEmail);

		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword_1.setBounds(152, 109, 114, 31);
		panel_1.add(lblPassword_1);

		JButton btn_signIn_1 = new JButton("Sign In");
		btn_signIn_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (fld_adminEmail.getText().length() == 0 || fld_adminPw.getText().length() == 0) {
					Helper.showMsg("fill");
				} else {
					try {
						Connection con = conn.connDb();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM public.user");
						while (rs.next()) {
							if (fld_adminEmail.getText().equals(rs.getString("email"))
									&& fld_adminPw.getText().equals(rs.getString("password"))) {
								Admin admin = new Admin();
								admin.setId(rs.getInt("id"));
								admin.setName(rs.getString("name"));
								admin.setSureName(rs.getString("surename"));
								admin.setEmail(rs.getString("email"));
								admin.setPassword(rs.getString("password"));
								AdminGUI aGUI = new AdminGUI(admin);
								aGUI.setVisible(true);
								//dispose nesnenin anýnda bellekten atýlmasý için kullanýlýr
								dispose();
							}
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btn_signIn_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signIn_1.setBounds(152, 168, 454, 59);
		panel_1.add(btn_signIn_1);

		fld_adminPw = new JPasswordField();
		fld_adminPw.setBounds(325, 111, 281, 31);
		panel_1.add(fld_adminPw);

		JPanel panel_2 = new JPanel();
		w_tabpane.addTab("Stuff Login", null, panel_2, null);
		panel_2.setLayout(null);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(0, 0, 761, 308);
		panel_2.add(panel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Email:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(152, 54, 114, 31);
		panel_1_1.add(lblNewLabel_2_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(325, 54, 281, 31);
		panel_1_1.add(textField_2);

		JLabel lblPassword_1_1 = new JLabel("Password:");
		lblPassword_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword_1_1.setBounds(152, 109, 114, 31);
		panel_1_1.add(lblPassword_1_1);

		JButton btn_signIn_1_1 = new JButton("Sign In");
		btn_signIn_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_signIn_1_1.setBounds(152, 168, 454, 59);
		panel_1_1.add(btn_signIn_1_1);

		fld_stuffPw = new JPasswordField();
		fld_stuffPw.setBounds(325, 109, 281, 31);
		panel_1_1.add(fld_stuffPw);

		JLabel lblNewLabel_1 = new JLabel("Property Management System");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(278, 120, 235, 44);
		w_pane.add(lblNewLabel_1);

		// dataBase.connect();

	}
}
