package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Order extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtSL;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JTextField txtSB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 199, 678, 224);
		contentPane.add(table);
		
		JComboBox cbFood = new JComboBox();
		cbFood.setBounds(63, 38, 92, 28);
		contentPane.add(cbFood);
		
		txtSL = new JTextField();
		txtSL.setBounds(257, 38, 92, 28);
		contentPane.add(txtSL);
		txtSL.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Món ăn");
		lblNewLabel.setBounds(7, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Số lượng");
		lblNewLabel_1.setBounds(201, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtCT = new JTextArea();
		txtCT.setBounds(63, 96, 487, 81);
		contentPane.add(txtCT);
		
		JLabel lblNewLabel_2 = new JLabel("Chú thích");
		lblNewLabel_2.setBounds(7, 101, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnIm = new JButton("Nhập");
		btnIm.setBounds(571, 154, 89, 23);
		contentPane.add(btnIm);
		
		JLabel lblNewLabel_2_1 = new JLabel("Thành tiền");
		
		lblNewLabel_2_1.setBounds(10, 439, 105, 25);
		contentPane.add(lblNewLabel_2_1);
		textField_1 = new JTextField();
		textField_1.setBounds(602, 434, 86, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Số bàn");
		lblNewLabel_3.setBounds(402, 45, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtSB = new JTextField();
		txtSB.setColumns(10);
		txtSB.setBounds(458, 38, 92, 28);
		contentPane.add(txtSB);
	}
}
