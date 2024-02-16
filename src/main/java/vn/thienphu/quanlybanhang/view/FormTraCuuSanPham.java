package vn.thienphu.quanlybanhang.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormTraCuuSanPham extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FormTraCuuSanPham() {
		setSize(1131, 700);
		setLayout(null);
		
		JLabel lblTraCuSn = new JLabel("TRA CỨU SẢN PHẨM");
		lblTraCuSn.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblTraCuSn.setBounds(412, 11, 313, 55);
		add(lblTraCuSn);
		
		JLabel lblNewLabel = new JLabel("Mã Sản Phẩm");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 368, 100, 38);
		add(lblNewLabel);
		
		JLabel lblTnSnPhm = new JLabel("Tên Sản Phẩm");
		lblTnSnPhm.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblTnSnPhm.setBounds(60, 417, 107, 38);
		add(lblTnSnPhm);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(177, 371, 214, 38);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(177, 420, 214, 38);
		add(textField_1);
		
		JLabel lblLoiSnPhm = new JLabel("Loại Sản Phẩm");
		lblLoiSnPhm.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblLoiSnPhm.setBounds(60, 466, 107, 38);
		add(lblLoiSnPhm);
		
		JLabel lblLoiSnPhm_1 = new JLabel("Giá Sản Phẩm");
		lblLoiSnPhm_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblLoiSnPhm_1.setBounds(67, 515, 100, 38);
		add(lblLoiSnPhm_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setBounds(177, 469, 214, 38);
		add(comboBox);
		
		table = new JTable();
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"ID S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Lo\u1EA1i S\u1EA3n Ph\u1EA9m", "Gi\u00E1 S\u1EA3n Ph\u1EA9m"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(412, 79, 709, 593);
		add(scrollPane);
		
		
		JLabel lblThngTinSn = new JLabel("Thông Tin Sản Phẩm");
		lblThngTinSn.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblThngTinSn.setBounds(97, 79, 204, 38);
		add(lblThngTinSn);
		
		JButton btnTmKim = new JButton("Tìm kiếm");
		btnTmKim.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnTmKim.setBackground(Color.WHITE);
		btnTmKim.setBounds(177, 564, 135, 44);
		add(btnTmKim);
		
		JLabel lblnh = new JLabel("Ảnh");
		lblnh.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblnh.setBounds(126, 327, 41, 30);
		add(lblnh);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(177, 128, 214, 227);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 2, 214, 227);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(177, 515, 214, 38);
		add(textField_2);
		
	}
}
