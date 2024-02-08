package vn.thienphu.quanlybanhang.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formIndex extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private formTrangChu trangChu = new formTrangChu();
	private formQuanTri quanTri = new formQuanTri();
	private formThanhToan thanhToan = new formThanhToan();
	private formTraCuuThongTin traCuuThongTin = new formTraCuuThongTin();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formIndex frame = new formIndex();
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
	public formIndex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1412, 792);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(123, 104, 238));
		menu.setBounds(0, 0, 267, 753);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(formIndex.class.getResource("/vn/thienphu/quanlybanhang/view/images/cart-remove-icon.png")));
		lblNewLabel_1.setBounds(66, 11, 128, 128);
		menu.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("ThanhHoaShop");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
		lblNewLabel.setBounds(36, 150, 188, 52);
		menu.add(lblNewLabel);
		
		JPanel panel_btnTrangChu = new JPanel();
		panel_btnTrangChu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		panel_btnTrangChu.setBounds(0, 213, 267, 52);
		menu.add(panel_btnTrangChu);
		panel_btnTrangChu.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Trang Chủ");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(71, 11, 118, 30);
		panel_btnTrangChu.add(lblNewLabel_2);
		
		JPanel panel_btn_traCuuThongTin = new JPanel();
		panel_btn_traCuuThongTin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		panel_btn_traCuuThongTin.setLayout(null);
		panel_btn_traCuuThongTin.setBounds(0, 276, 267, 52);
		menu.add(panel_btn_traCuuThongTin);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tra Cứu Thông Tin");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(29, 11, 203, 30);
		panel_btn_traCuuThongTin.add(lblNewLabel_2_1);
		
		JPanel panel_btnQuanTri = new JPanel();
		panel_btnQuanTri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		panel_btnQuanTri.setLayout(null);
		panel_btnQuanTri.setBounds(0, 339, 267, 52);
		menu.add(panel_btnQuanTri);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Quản Trị");
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNewLabel_2_1_1.setBounds(83, 11, 94, 30);
		panel_btnQuanTri.add(lblNewLabel_2_1_1);
		
		JPanel panel_btnThanhToanHoaDon = new JPanel();
		panel_btnThanhToanHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		panel_btnThanhToanHoaDon.setLayout(null);
		panel_btnThanhToanHoaDon.setBounds(0, 402, 267, 52);
		menu.add(panel_btnThanhToanHoaDon);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Thanh Toán Hóa Đơn");
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 22));
		lblNewLabel_2_1_1_1.setBounds(16, 11, 229, 30);
		panel_btnThanhToanHoaDon.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(formIndex.class.getResource("/vn/thienphu/quanlybanhang/view/images/User-icon.png")));
		lblNewLabel_3.setBounds(10, 648, 48, 48);
		menu.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Trần Hoài Thanh");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_1.setBounds(66, 657, 191, 30);
		menu.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 700, 247, 42);
		menu.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Đăng Xuất");
		lblNewLabel_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(84, 11, 75, 19);
		panel_6.add(lblNewLabel_7);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(265, -24, 1131, 777);
		tabbedPane.addTab("Trang Chủ", null, trangChu, null);
		tabbedPane.addTab("Tra Cứu Thông Tin", null, traCuuThongTin, null);
		tabbedPane.addTab("Quản Trị", null, quanTri, null);
		tabbedPane.addTab("Thanh Toán", null, thanhToan, null);
		contentPane.add(tabbedPane);
	}
}
