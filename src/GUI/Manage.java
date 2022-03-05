package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Item.Stock;
import GUI.StartFrame.*; 
public class Manage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage frame = new Manage();
					//frame.setLocationRelativeTo(null);
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
	public Manage() {
		setTitle("POS-Manage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD65C\uC131\uD654 \uD14C\uC774\uBE14 : ");
		lblNewLabel.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 83, 126, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox cb_UseTable = new JComboBox();
		cb_UseTable.setModel(new DefaultComboBoxModel(new String[] {"9", "10", "11", "12", "13", "14", "15"}));
		cb_UseTable.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		cb_UseTable.setBounds(206, 73, 51, 41);
		contentPane.add(cb_UseTable);
		
		JLabel label = new JLabel("\uD14C\uC774\uBE14 \uC218\uB7C9 \uC870\uC815");
		label.setForeground(new Color(255, 255, 240));
		label.setFont(new Font("210 골목길 B", Font.PLAIN, 30));
		label.setBounds(29, 10, 201, 41);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC18C\uBAA8\uD488 \uBC1C\uC8FC");
		label_1.setForeground(new Color(255, 255, 240));
		label_1.setFont(new Font("210 골목길 B", Font.PLAIN, 30));
		label_1.setBounds(29, 204, 201, 41);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uBE68\uB300 :");
		label_2.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		label_2.setBounds(71, 275, 47, 20);
		contentPane.add(label_2);
		
		JComboBox cb_StrawNum = new JComboBox();
		cb_StrawNum.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30"}));
		cb_StrawNum.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		cb_StrawNum.setBounds(206, 265, 51, 41);
		contentPane.add(cb_StrawNum);
		
		JLabel label_3 = new JLabel("\uCEF5 & \uD640\uB354");
		label_3.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		label_3.setBounds(71, 326, 126, 20);
		contentPane.add(label_3);
		
		JComboBox cb_CupAndHolderNum = new JComboBox();
		cb_CupAndHolderNum.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30"}));
		cb_CupAndHolderNum.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		cb_CupAndHolderNum.setBounds(206, 316, 51, 41);
		contentPane.add(cb_CupAndHolderNum);
		
		JLabel label_4 = new JLabel("\uC77C\uD68C\uC6A9 \uD3EC\uD06C :");
		label_4.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		label_4.setBounds(71, 377, 126, 20);
		contentPane.add(label_4);
		
		JComboBox cb_ForkNum = new JComboBox();
		cb_ForkNum.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30"}));
		cb_ForkNum.setFont(new Font("210 골목길 B", Font.PLAIN, 20));
		cb_ForkNum.setBounds(206, 367, 51, 41);
		contentPane.add(cb_ForkNum);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 62, 247, 63);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 257, 247, 162);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 191, 434, 3);
		contentPane.add(panel_2);
		
		JButton bt_UseTable = new JButton("변경");
		bt_UseTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////////////////////테이블 갯수//////////////////////
				String Tnum = cb_UseTable.getSelectedItem() + "";
				StartFrame.setTableList(Tnum);
				
			}
		});
		bt_UseTable.setFont(new Font("210 골목길 B", Font.PLAIN, 25));
		bt_UseTable.setBounds(281, 134, 141, 47);
		contentPane.add(bt_UseTable);
		
		JButton bt_Buy = new JButton("발주");
		bt_Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int S = Integer.parseInt((String) cb_StrawNum.getSelectedItem());
				int C = Integer.parseInt((String) cb_CupAndHolderNum.getSelectedItem());
				int F = Integer.parseInt((String) cb_ForkNum.getSelectedItem());
				
				Stock.setStraw(Stock.getStraw()+S); 
				Stock.setCupAndHolder(Stock.getCupAndHolder()+C); 
				Stock.setFork(Stock.getFork()+F);
				StartFrame.SetStockLable();
				
			}
		});
		bt_Buy.setFont(new Font("210 골목길 B", Font.PLAIN, 25));
		bt_Buy.setBounds(281, 424, 141, 47);
		contentPane.add(bt_Buy);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 481, 434, 3);
		contentPane.add(panel_3);
		
		JButton bt_CloseManage = new JButton("\uB2EB\uAE30");
		bt_CloseManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bt_CloseManage.setFont(new Font("210 골목길 B", Font.PLAIN, 25));
		bt_CloseManage.setBounds(331, 494, 91, 37);
		contentPane.add(bt_CloseManage);
	}
}
