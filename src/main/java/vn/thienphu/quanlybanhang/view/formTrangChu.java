package vn.thienphu.quanlybanhang.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class formTrangChu extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public formTrangChu() {
		setSize(1131, 753);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 112, 214));
		panel.setBounds(0, 0, 1131, 753);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANG CHỦ");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(534, 270, 193, 70);
		panel.add(lblNewLabel);
	}
}
