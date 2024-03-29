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

import vn.thienphu.quanlybanhang.item.FormTimKiemNhanVien;
import vn.thienphu.quanlybanhang.model.NhanVien;
import vn.thienphu.quanlybanhang.thread.ThreadTimKiemNhanVien;

import javax.swing.JRadioButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class FormTraCuuNhanVien extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FormTraCuuNhanVien() {
		setSize(1120, 680);
		setLayout(null);
		
		JLabel lblTraCuSn = new JLabel("TRA CỨU NHÂN VIÊN");
		lblTraCuSn.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblTraCuSn.setBounds(412, 11, 313, 55);
		add(lblTraCuSn);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 63, 313, 606);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 198, 94, 29);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(114, 198, 186, 29);
		panel.add(textField);
		
		JLabel lblHoVaTn = new JLabel("Họ và tên");
		lblHoVaTn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblHoVaTn.setBounds(10, 238, 94, 29);
		panel.add(lblHoVaTn);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(114, 238, 186, 29);
		panel.add(textField_1);
		
		JLabel lblSinThoai = new JLabel("Số điện thoại");
		lblSinThoai.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblSinThoai.setBounds(10, 278, 94, 29);
		panel.add(lblSinThoai);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(114, 278, 186, 29);
		panel.add(textField_2);
		
		JLabel lblGiiTinh = new JLabel("Giới tính");
		lblGiiTinh.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblGiiTinh.setBounds(10, 314, 94, 29);
		panel.add(lblGiiTinh);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(114, 318, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("Nữ");
		rdbtnN.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		rdbtnN.setBackground(Color.WHITE);
		rdbtnN.setBounds(114, 354, 109, 23);
		panel.add(rdbtnN);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(114, 11, 186, 176);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 186, 176);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblAnhaiDin = new JLabel("Ảnh đại diện");
		lblAnhaiDin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblAnhaiDin.setBounds(10, 158, 94, 29);
		panel.add(lblAnhaiDin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(333, 63, 775, 606);
		add(panel_2);
		
		JLabel lblDanhSachNhn = new JLabel("Danh sách nhân viên");
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
				"Mã nhân viên", "Họ và tên", "Số điện thoại", "Giới tính", "Ảnh đại diện"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 41, 755, 554);
		panel_2.add(scrollPane);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();
				Runnable runnable = new ThreadTimKiemNhanVien(danhSachNhanVien);
				Thread thread = new Thread(runnable);
				thread.run();
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnNewButton.setBounds(676, 6, 89, 23);
		panel_2.add(btnNewButton);
		
	}
}
