package vn.thienphu.quanlybanhang.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class formLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formLogin frame = new formLogin();
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
	public formLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 531);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 400, 496);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(125, 78, 128, 137);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(formLogin.class.getResource("/vn/thienphu/quanlybanhang/view/images/cart-remove-icon.png")));
		
		JLabel lblNewLabel_3 = new JLabel("<html><div style='text-align: center;'>Thanh Toán Mua Sắm<br>Mọi Lúc Mọi Nơi</div></html>");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(63, 235, 254, 111);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(399, 0, 400, 496);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblNewLabel.setBounds(112, 47, 182, 71);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tài Khoản");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(33, 156, 75, 22);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField.setBounds(33, 189, 335, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật Khẩu");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(33, 241, 75, 22);
		panel_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		passwordField.setBounds(33, 274, 335, 41);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Đăng Nhập");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton.setBounds(33, 326, 111, 41);
		panel_1.add(btnNewButton);
	}
}
