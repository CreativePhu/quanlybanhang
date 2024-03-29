package vn.thienphu.quanlybanhang.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class FormQuanTriTaiKhoan extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public FormQuanTriTaiKhoan() {
		setSize(1120, 680);
		setLayout(null);
		
		JLabel lblQuanLyNhn = new JLabel("QUẢN LÝ TÀI KHOẢN");
		lblQuanLyNhn.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblQuanLyNhn.setBounds(431, 11, 313, 55);
		add(lblQuanLyNhn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 63, 313, 606);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên tài khoản");
		lblNewLabel.setBounds(13, 87, 94, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(117, 87, 186, 29);
		panel.add(textField);
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		textField.setColumns(10);
		
		JLabel lblHoVaTn = new JLabel("Mật khẩu");
		lblHoVaTn.setBounds(13, 127, 94, 29);
		panel.add(lblHoVaTn);
		lblHoVaTn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel lblEmail = new JLabel("Quyền hạn");
		lblEmail.setBounds(13, 163, 94, 29);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel lblGiiTinh = new JLabel("Trạng Thái");
		lblGiiTinh.setBounds(13, 199, 94, 29);
		panel.add(lblGiiTinh);
		lblGiiTinh.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kích hoạt");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(117, 203, 109, 23);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton rdbtnN = new JRadioButton("Tắt");
		rdbtnN.setBackground(new Color(255, 255, 255));
		rdbtnN.setBounds(117, 239, 109, 23);
		panel.add(rdbtnN);
		rdbtnN.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel lblChcNng = new JLabel("Chức năng");
		lblChcNng.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblChcNng.setBounds(10, 497, 94, 29);
		panel.add(lblChcNng);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(10, 537, 293, 39);
		panel.add(panel_3);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Cập nhật");
		panel_3.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Xóa");
		panel_3.add(rdbtnNewRadioButton_1_1_1);
		rdbtnNewRadioButton_1_1_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel lblThngTinTai = new JLabel("Thông Tin Tài Khoản");
		lblThngTinTai.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblThngTinTai.setBounds(57, 25, 201, 30);
		panel.add(lblThngTinTai);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passwordField.setEditable(false);
		passwordField.setBounds(117, 127, 186, 29);
		panel.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		comboBox.setEditable(true);
		comboBox.setBounds(117, 167, 186, 29);
		panel.add(comboBox);
		
		JButton btnXacNhn = new JButton("Xác nhận");
		btnXacNhn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnXacNhn.setBounds(117, 269, 100, 29);
		panel.add(btnXacNhn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(333, 63, 775, 606);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDanhSachNhn = new JLabel("Danh sách tài khoản");
		lblDanhSachNhn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblDanhSachNhn.setBounds(10, 0, 168, 30);
		panel_2.add(lblDanhSachNhn);
		
		table = new JTable();
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		table.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Tên tài khoản", "Mật khẩu", "Quyền hạn", "Trạng thái"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 41, 755, 554);
		panel_2.add(scrollPane);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnNewButton.setBounds(676, 6, 89, 23);
		panel_2.add(btnNewButton);
		
	}
}
