package vn.thienphu.quanlybanhang.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormTraCuuThongTin extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public FormTraCuuThongTin() {
		setSize(1131, 753);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 112, 214));
		panel.setBounds(0, 0, 1131, 753);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRA CỨU THÔNG TIN");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(435, 274, 331, 119);
		panel.add(lblNewLabel);
	}

}
