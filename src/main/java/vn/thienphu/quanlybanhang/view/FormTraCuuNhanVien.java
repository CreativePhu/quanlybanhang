package vn.thienphu.quanlybanhang.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class FormTraCuuNhanVien extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FormTraCuuNhanVien() {
		setSize(1131, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRA CỨU NHÂN VIÊN");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblNewLabel.setBounds(405, 11, 313, 55);
		add(lblNewLabel);
		
		JLabel lblTmKim = new JLabel("Tìm kiếm");
		lblTmKim.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		lblTmKim.setBounds(58, 77, 123, 55);
		add(lblTmKim);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		textField.setBounds(195, 83, 523, 43);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Kết quả");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnNewButton.setBounds(743, 82, 135, 44);
		add(btnNewButton);
		
		JLabel lblDanhSchNhn = new JLabel("Danh sách nhân viên");
		lblDanhSchNhn.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		lblDanhSchNhn.setBounds(58, 143, 190, 43);
		add(lblDanhSchNhn);
		
		
		table = new JTable();
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID Nhân Viên", "Họ Và Tên", "Giới Tính", "Số Điện Thoại", "Chi Tiết"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(58, 197, 1018, 464);
		add(scrollPane);
		
		
	}
}
