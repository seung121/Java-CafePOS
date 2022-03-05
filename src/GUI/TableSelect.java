package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Program.*;

public class TableSelect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TableSelect() {
		setTitle("Table choice");
		setBackground(new Color(255, 239, 213));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.one);
			    frame.setVisible(true);
			    DetailTable.CurSel = 1;
			    dispose();
			}
		});
		num1.setForeground(new Color(51, 51, 51));
		num1.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num1.setBackground(new Color(255, 218, 185));
		num1.setBounds(41, 112, 60, 50);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.two);
			    frame.setVisible(true);
			    DetailTable.CurSel = 2;
			    dispose();
			}
		});
		num2.setForeground(new Color(51, 51, 51));
		num2.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num2.setBackground(new Color(255, 218, 185));
		num2.setBounds(103, 112, 60, 50);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.three);
			    frame.setVisible(true);
			    DetailTable.CurSel = 3;
			    dispose();
			}
		});
		num3.setForeground(new Color(51, 51, 51));
		num3.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num3.setBackground(new Color(255, 218, 185));
		num3.setBounds(165, 112, 60, 50);
		contentPane.add(num3);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.four);
			    frame.setVisible(true);
			    DetailTable.CurSel = 4;
			    dispose();
			}
		});
		num4.setForeground(new Color(51, 51, 51));
		num4.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num4.setBackground(new Color(255, 218, 185));
		num4.setBounds(227, 112, 60, 50);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.five);
			    frame.setVisible(true);
			    DetailTable.CurSel = 5;
			    dispose();
			}
		});
		num5.setForeground(new Color(51, 51, 51));
		num5.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num5.setBackground(new Color(255, 218, 185));
		num5.setBounds(289, 112, 60, 50);
		contentPane.add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.six);
			    frame.setVisible(true);
			    DetailTable.CurSel = 6;
			    dispose();
			}
		});
		num6.setForeground(new Color(51, 51, 51));
		num6.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num6.setBackground(new Color(255, 218, 185));
		num6.setBounds(41, 164, 60, 50);
		contentPane.add(num6);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.seven);
			    frame.setVisible(true);
			    DetailTable.CurSel = 7;
			    dispose();
			}
		});
		num7.setForeground(new Color(51, 51, 51));
		num7.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num7.setBackground(new Color(255, 218, 185));
		num7.setBounds(103, 164, 60, 50);
		contentPane.add(num7);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.eight);
			    frame.setVisible(true);
			    DetailTable.CurSel = 8;
			    dispose();
			}
		});
		num8.setForeground(new Color(51, 51, 51));
		num8.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num8.setBackground(new Color(255, 218, 185));
		num8.setBounds(165, 164, 60, 50);
		contentPane.add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.nine);
			    frame.setVisible(true);
			    DetailTable.CurSel = 9;
			    dispose();
			}
		});
		num9.setForeground(new Color(51, 51, 51));
		num9.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num9.setBackground(new Color(255, 218, 185));
		num9.setBounds(227, 164, 60, 50);
		contentPane.add(num9);
		
		JButton num10 = new JButton("10");
		num10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.ten);
			    frame.setVisible(true);
			    DetailTable.CurSel = 10;
			    dispose();
			}
		});
		num10.setForeground(new Color(51, 51, 51));
		num10.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num10.setBackground(new Color(255, 218, 185));
		num10.setBounds(289, 164, 60, 50);
		contentPane.add(num10);
		
		JButton num11 = new JButton("11");
		num11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.ten_one);
			    frame.setVisible(true);
			    DetailTable.CurSel = 11;
			    dispose();
			}
		});
		num11.setForeground(new Color(51, 51, 51));
		num11.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num11.setBackground(new Color(255, 218, 185));
		num11.setBounds(41, 216, 60, 50);
		contentPane.add(num11);
		
		JButton num12 = new JButton("12");
		num12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.ten_two);
			    frame.setVisible(true);
			    DetailTable.CurSel = 12;
			    dispose();
			}
		});
		num12.setForeground(new Color(51, 51, 51));
		num12.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num12.setBackground(new Color(255, 218, 185));
		num12.setBounds(103, 216, 60, 50);
		contentPane.add(num12);
		
		JButton num13 = new JButton("13");
		num13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.ten_three);
			    frame.setVisible(true);
			    DetailTable.CurSel = 13;
			    dispose();
			}
		});
		num13.setForeground(new Color(51, 51, 51));
		num13.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num13.setBackground(new Color(255, 218, 185));
		num13.setBounds(165, 216, 60, 50);
		contentPane.add(num13);
		
		JButton num14 = new JButton("14");
		num14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.ten_four);
			    frame.setVisible(true);
			    DetailTable.CurSel = 14;
			    dispose();
			}
		});
		num14.setForeground(new Color(51, 51, 51));
		num14.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num14.setBackground(new Color(255, 218, 185));
		num14.setBounds(227, 216, 60, 50);
		contentPane.add(num14);
		
		JButton num15 = new JButton("15");
		num15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailTable frame = new DetailTable(TableSystem.ten_five);
			    frame.setVisible(true);
			    DetailTable.CurSel = 15;
			    dispose();
			}
		});
		num15.setForeground(new Color(51, 51, 51));
		num15.setFont(new Font("210 국민체조 B", Font.BOLD, 17));
		num15.setBackground(new Color(255, 218, 185));
		num15.setBounds(289, 216, 60, 50);
		contentPane.add(num15);
		
		JLabel lblNewLabel = new JLabel("조회할 테이블 선택");
		lblNewLabel.setForeground(new Color(250, 128, 114));
		lblNewLabel.setFont(new Font("210 골목길 B", Font.PLAIN, 25));
		lblNewLabel.setBounds(106, 40, 180, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(205, 92, 92));
		panel_1.setBounds(0, 0, 392, 33);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel();
		label.setForeground(new Color(255, 255, 240));
		label.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
		label.setBounds(634, 0, 260, 33);
		panel_1.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 224));
		panel.setBounds(26, 98, 339, 180);
		contentPane.add(panel);
	}
}
