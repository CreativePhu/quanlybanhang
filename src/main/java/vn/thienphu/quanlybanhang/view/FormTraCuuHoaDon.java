package vn.thienphu.quanlybanhang.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import vn.thienphu.quanlybanhang.controller.MouseControllerFormIndex;
import vn.thienphu.quanlybanhang.controller.MouseControllerFormTraCuuHoaDon;
import com.toedter.calendar.JDateChooser;

public class FormTraCuuHoaDon extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private MouseControllerFormTraCuuHoaDon mouseControllerFormTraCuuHoaDon = new MouseControllerFormTraCuuHoaDon(this);
	private JPopupMenu popupMenu;

	/**
	 * Create the panel.
	 */
	public FormTraCuuHoaDon() {
		setSize(1131, 700);
		setLayout(null);

		JLabel lblTraCuSn = new JLabel("TRA CỨU HÓA ĐƠN");
		lblTraCuSn.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));
		lblTraCuSn.setBounds(412, 11, 291, 55);
		add(lblTraCuSn);

		JLabel lblNewLabel = new JLabel("Mã Hóa Đơn");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(51, 129, 105, 38);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(166, 131, 214, 38);
		add(textField);
		textField.setColumns(10);

		JLabel lblLoiSnPhm = new JLabel("Đến Ngày");
		lblLoiSnPhm.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblLoiSnPhm.setBounds(73, 226, 83, 38);
		add(lblLoiSnPhm);
		
		popupMenu = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Chi Tiết Hóa Đơn");
        popupMenu.add(menuItem);

		table = new JTable();
		table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "Mã Hóa Đơn", "ID Nhân Viên", "Ngày Lập", "Tổng Tiền" }));
		table.addMouseListener(mouseControllerFormTraCuuHoaDon);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(412, 79, 709, 593);
		add(scrollPane);

		JLabel lblThngTinSn = new JLabel("Thông Tin Hóa Đơn");
		lblThngTinSn.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblThngTinSn.setBounds(97, 79, 206, 38);
		add(lblThngTinSn);

		JButton btnTmKim = new JButton("Tìm kiếm");
		btnTmKim.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnTmKim.setBackground(Color.WHITE);
		btnTmKim.setBounds(166, 275, 135, 44);
		add(btnTmKim);
		
		JLabel lblTNgy = new JLabel("Từ Ngày");
		lblTNgy.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblTNgy.setBounds(80, 177, 76, 38);
		add(lblTNgy);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/mm/yyyy");
		dateChooser.setBounds(166, 180, 214, 38);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setDateFormatString("dd/mm/yyyy");
		dateChooser_1.setBounds(166, 226, 214, 38);
		add(dateChooser_1);
	}
	
	public void showPopupMenu(MouseEvent e) {
        int row = table.rowAtPoint(e.getPoint());
        if (row >= 0 && row < table.getRowCount()) {
            table.setRowSelectionInterval(row, row);
            popupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }
}
