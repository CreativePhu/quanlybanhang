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

public class FormQuanTriHoaDon  extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMaHD;
	private JTextField txtTenNV;
	private JTextField txtNgayLap;
	private JTextField txtTongTien;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FormQuanTriHoaDon () {
		setSize(1120, 680);
		setLayout(null);
		
		JLabel lblQLHD = new JLabel("QUẢN LÝ HÓA ĐƠN");
		lblQLHD.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblQLHD.setBounds(431, 11, 313, 55);
		add(lblQLHD);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 63, 313, 606);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblMaHD = new JLabel("Mã hóa đơn");
		lblMaHD.setBounds(10, 140, 94, 29);
		panel.add(lblMaHD);
		lblMaHD.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		txtMaHD = new JTextField();
		txtMaHD.setBounds(114, 140, 186, 29);
		panel.add(txtMaHD);
		txtMaHD.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtMaHD.setColumns(10);
		
		JLabel lblTenNV = new JLabel("Tên nhân viên");
		lblTenNV.setBounds(10, 216, 94, 29);
		panel.add(lblTenNV);
		lblTenNV.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		txtTenNV = new JTextField();
		txtTenNV.setBounds(114, 216, 186, 29);
		panel.add(txtTenNV);
		txtTenNV.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtTenNV.setColumns(10);
		
		JLabel lblNgayLap = new JLabel("Ngày Lập");
		lblNgayLap.setBounds(10, 296, 94, 29);
		panel.add(lblNgayLap);
		lblNgayLap.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		txtNgayLap = new JTextField();
		txtNgayLap.setBounds(114, 296, 186, 29);
		panel.add(txtNgayLap);
		txtNgayLap.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtNgayLap.setColumns(10);
		
		txtTongTien = new JTextField();
		txtTongTien.setBounds(114, 378, 186, 29);
		panel.add(txtTongTien);
		txtTongTien.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtTongTien.setColumns(10);
		
		JLabel lblTongTien = new JLabel("Tổng Tiền");
		lblTongTien.setBounds(10, 378, 94, 29);
		panel.add(lblTongTien);
		lblTongTien.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel lblChcNng = new JLabel("Chức năng");
		lblChcNng.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblChcNng.setBounds(10, 479, 94, 29);
		panel.add(lblChcNng);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(10, 518, 293, 39);
		panel.add(panel_3);
		
		JRadioButton rdbtnThm = new JRadioButton("Thêm");
		panel_3.add(rdbtnThm);
		rdbtnThm.setBackground(new Color(255, 255, 255));
		rdbtnThm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Cập nhật");
		panel_3.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Xóa");
		panel_3.add(rdbtnNewRadioButton_1_1_1);
		rdbtnNewRadioButton_1_1_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel lblThngTinHD = new JLabel("Thông tin hóa đơn");
		lblThngTinHD.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		lblThngTinHD.setBounds(38, 39, 313, 55);
		panel.add(lblThngTinHD);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(333, 63, 775, 606);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDanhSachHD = new JLabel("Danh sách hóa đơn");
		lblDanhSachHD.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblDanhSachHD.setBounds(10, 0, 168, 30);
		panel_2.add(lblDanhSachHD);
		
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
				"Mã hóa đơn", "Tên nhân viên", "tổng tiền", "ngày lập hóa đơn"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 41, 755, 554);
		panel_2.add(scrollPane);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnTimKiem.setBounds(676, 6, 89, 23);
		panel_2.add(btnTimKiem);
		
	}
}
