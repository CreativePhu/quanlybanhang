package vn.thienphu.quanlybanhang.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormThanhToan extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private JTextField txtSL0;
    private JTextField txtSL1;

    /**
     * Create the panel.
     */
    public FormThanhToan() {
        setBackground(new Color(123, 104, 238));
        setBounds(0, 0, 1131, 753);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("THANH TOÁN");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30)); // Bold font
        lblNewLabel.setBounds(10, 10, 223, 43);
        add(lblNewLabel);

        // Panel for displaying employee name, invoice code, and date
        JPanel panelThongTin = new JPanel();
        panelThongTin.setBounds(10, 63, 780, 71);
        add(panelThongTin);
        panelThongTin.setLayout(null);

        JLabel lblTenNV = new JLabel("Tên nhân viên");
        lblTenNV.setBounds(0, 0, 117, 71);
        lblTenNV.setFont(new Font("Segoe UI Black", Font.PLAIN, 14)); // Bold font, adjust size if necessary
        panelThongTin.add(lblTenNV);

        JLabel lblInvoiceCode = new JLabel("Mã hóa đơn:");
        lblInvoiceCode.setBounds(264, 0, 100, 71);
        lblInvoiceCode.setFont(new Font("Segoe UI Black", Font.PLAIN, 14)); // Bold font, adjust size if necessary
        panelThongTin.add(lblInvoiceCode);

        JLabel lblDate = new JLabel("Ngày:");
        lblDate.setBounds(546, 0, 107, 71);
        lblDate.setFont(new Font("Segoe UI Black", Font.PLAIN, 14)); // Bold font, adjust size if necessary
        panelThongTin.add(lblDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        JLabel lblDateValue = new JLabel(dateFormat.format(new Date()));
        lblDateValue.setBounds(663, 0, 117, 71);
        lblDateValue.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Bold font, adjust size if necessary
        panelThongTin.add(lblDateValue);
        
        JLabel txtTenNV = new JLabel("Tên nhân viên");
        txtTenNV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtTenNV.setBounds(126, 12, 117, 49);
        panelThongTin.add(txtTenNV);
        
        JLabel txtMaHD = new JLabel("Tên nhân viên");
        txtMaHD.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtMaHD.setBounds(384, 0, 117, 71);
        panelThongTin.add(txtMaHD);

        // Panel for displaying product information
        JPanel panelTable = new JPanel();
        panelTable.setBounds(10, 144, 780, 600);
        add(panelTable);
        panelTable.setLayout(new GridLayout(1, 1, 0, 0));

        String[] columnNames = {"Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền" };
        Object[][] data = {
            { "Sản phẩm 1", 5, 10000, 50000 },
            { "Sản phẩm 2", 3, 15000, 45000 },
            { "Sản phẩm 3", 2, 20000, 40000 }
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        panelTable.add(new JScrollPane(table));
        table.setRowHeight(25);
		table.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setForeground(new Color(0, 0, 0));

        // Set column headers
        for (int i = 0; i < columnNames.length; i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setHeaderValue(columnNames[i]);
        }
        table.getTableHeader().repaint();

        // Panel for adding product
        JPanel panelSP = new JPanel();
        panelSP.setBounds(800, 0, 315, 753);
        add(panelSP);
        panelSP.setLayout(null);

        JLabel lblTenSP = new JLabel("Tên SP:");
        lblTenSP.setFont(new Font("Segoe UI Black", Font.PLAIN, 13)); // Bold font, adjust size if necessary
        lblTenSP.setBounds(28, 236, 86, 20);
        panelSP.add(lblTenSP);

        JLabel lblDonGia = new JLabel("Đơn giá:");
        lblDonGia.setFont(new Font("Segoe UI Black", Font.PLAIN, 13)); // Bold font, adjust size if necessary
        lblDonGia.setBounds(28, 292, 86, 20);
        panelSP.add(lblDonGia);

        JLabel lblProductType = new JLabel("Loại:");
        lblProductType.setFont(new Font("Segoe UI Black", Font.PLAIN, 14)); // Bold font, adjust size if necessary
        lblProductType.setBounds(28, 404, 86, 20);
        panelSP.add(lblProductType);

        JButton btnThemSP = new JButton("Thêm sản phẩm");
        btnThemSP.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        btnThemSP.setBounds(59, 129, 199, 40);
        panelSP.add(btnThemSP);

        JButton btnXoaSP = new JButton("Xóa sản phẩm");
        btnXoaSP.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        btnXoaSP.setBounds(162, 481, 142, 40);
        panelSP.add(btnXoaSP);

        JButton btnSuaSP = new JButton("Sửa sản phẩm");
        btnSuaSP.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        
        btnSuaSP.setBounds(10, 481, 142, 40);
        panelSP.add(btnSuaSP);

        JButton btnThanhToan = new JButton("Thanh toán");
        btnThanhToan.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        btnThanhToan.setBounds(10, 648, 295, 50);
        panelSP.add(btnThanhToan);
        
        JButton btnTimSP = new JButton("Tìm kiếm sản phẩm");
        btnTimSP.setBounds(182, 10, 123, 33);
        panelSP.add(btnTimSP);
        
        JLabel lblMaSP = new JLabel("Mã sản phẩm :");
        lblMaSP.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        lblMaSP.setBounds(28, 41, 108, 27);
        panelSP.add(lblMaSP);
        
        JLabel txtMaSP = new JLabel("SP0001");
        txtMaSP.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtMaSP.setBounds(146, 49, 45, 13);
        panelSP.add(txtMaSP);
        
        JLabel lblSL0 = new JLabel("Số lượng :");
        lblSL0.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        lblSL0.setBounds(28, 88, 68, 20);
        panelSP.add(lblSL0);
        
        txtSL0 = new JTextField();
        txtSL0.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtSL0.setColumns(10);
        txtSL0.setBounds(146, 86, 86, 27);
        panelSP.add(txtSL0);
        
        JLabel lblThongTinSP = new JLabel("Thông Tin Sản Phẩm");
        lblThongTinSP.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
        lblThongTinSP.setBounds(44, 187, 271, 33);
        panelSP.add(lblThongTinSP);
        
        JLabel lblSL1 = new JLabel("Số lượng :");
        lblSL1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblSL1.setBounds(28, 351, 86, 20);
        panelSP.add(lblSL1);
        
        txtSL1 = new JTextField();
        txtSL1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtSL1.setColumns(10);
        txtSL1.setBounds(146, 349, 96, 27);
        panelSP.add(txtSL1);
        
        JLabel txtSP = new JLabel("Sách lớp");
        txtSP.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtSP.setBounds(146, 231, 159, 30);
        panelSP.add(txtSP);
        
        JLabel txtDonGia = new JLabel("200000");
        txtDonGia.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtDonGia.setBounds(146, 292, 148, 24);
        panelSP.add(txtDonGia);
        
        JLabel txtLoai = new JLabel("aaaaaa");
        txtLoai.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtLoai.setBounds(146, 399, 148, 33);
        panelSP.add(txtLoai);
    }
}
