package vn.thienphu.quanlybanhang.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import vn.thienphu.quanlybanhang.controller.MouseControllerFormIndex;

public class FormTraCuuThongTin extends JPanel {

	private static final long serialVersionUID = 1L;
	private FormTraCuuNhanVien formTraCuuNhanVien = new FormTraCuuNhanVien();
	private FormTraCuuSanPham formTraCuuSanPham = new FormTraCuuSanPham();
	private FormTraCuuHoaDon formTraCuuHoaDon = new FormTraCuuHoaDon();
	private MouseControllerFormIndex mouseControllerFormIndex;

	/**
	 * Create the panel.
	 */
	public FormTraCuuThongTin() {
		setSize(1133, 753);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 1133, 753);
		add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		tabbedPane.setBounds(0, 0, 1133, 753);
		tabbedPane.addTab("Tra Cứu Nhân Viên", formTraCuuNhanVien);
		tabbedPane.addTab("Tra Cứu Sản Phẩm", formTraCuuSanPham);
		tabbedPane.addTab("Tra Cứu Hóa Đơn", formTraCuuHoaDon);
		panel.add(tabbedPane);
		
	}
}
