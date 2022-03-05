package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Program.TableSystem;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;


import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DetailTable extends JFrame {
	public static int CurSel=0;
	public static JLabel lb_Per;
	public static JButton tb_CleanUp;
	private JPanel contentPane;
	private JTable table;
	
	Vector <String> userColumn = new Vector<String>();
	Vector<String> userRow;
	DefaultTableModel model;

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
	public DetailTable(TableSystem Select) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 398);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_TableInfo = new JLabel(Select.TableNum+"\uBC88 \uD14C\uC774\uBE14");
		lb_TableInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_TableInfo.setFont(new Font("210 국민체조 B", Font.PLAIN, 30));
		lb_TableInfo.setBounds(175, 10, 154, 30);
		contentPane.add(lb_TableInfo);
		
		
		userColumn.addElement("번호");
		userColumn.addElement("메뉴");   
		userColumn.addElement("수량");
		userColumn.addElement("비고");
		model = new DefaultTableModel(userColumn,0);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uC774\uB984", "\uC635\uC158", "\uC218\uB7C9"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(62);
		table.getColumnModel().getColumn(2).setPreferredWidth(48);
		for(int i = 0; i < Select.OrderList.length; i++)
		{
			for(int j = 0; j <3; j++)
			{
				table.setValueAt(Select.OrderList[i][j],i,j);
			}
		}
		

		userRow = new Vector<String>();

		userRow.addElement("번호");
		userRow.addElement("이름");
		userRow.addElement("수량");
		userRow.addElement("기타");
		
		model.addRow(userRow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 50, 320, 188);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
		
		tb_CleanUp = new JButton("테이블 정리");
		tb_CleanUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurSel == 1)
				{
					TableSystem.one = new TableSystem(1,null,1);
					StartFrame.SetRow(1);
					StartFrame.bt_t1.setEnabled(true);
				}
				
				
				if(CurSel == 2)
				{
					TableSystem.two = new TableSystem(2,null,1);
					StartFrame.SetRow(2);
					StartFrame.bt_t2.setEnabled(true);
				}
					
				if(CurSel == 3)
				{
					TableSystem.three = new TableSystem(3,null,1);
					StartFrame.SetRow(3);
					StartFrame.bt_t3.setEnabled(true);
				}
					
				if(CurSel == 4)
				{
					TableSystem.four = new TableSystem(4,null,1);
					StartFrame.SetRow(4);
					StartFrame.bt_t4.setEnabled(true);
				}
					
				if(CurSel == 5)
				{
					TableSystem.five = new TableSystem(5,null,1);
					StartFrame.SetRow(5);
					StartFrame.bt_t5.setEnabled(true);
				}
					
				if(CurSel == 6)
				{
					TableSystem.six= new TableSystem(6,null,1);
					StartFrame.SetRow(6);
					StartFrame.bt_t6.setEnabled(true);
				}
					
				if(CurSel == 7)
				{
					TableSystem.seven = new TableSystem(7,null,1);
					StartFrame.SetRow(7);
					StartFrame.bt_t7.setEnabled(true);
				}
					
				if(CurSel == 8)
				{
					TableSystem.eight = new TableSystem(8,null,1);
					StartFrame.SetRow(8);
					StartFrame.bt_t8.setEnabled(true);
				}
				
				if(CurSel == 9)
				{
					TableSystem.nine = new TableSystem(9,null,1);
					StartFrame.SetRow(9);
					StartFrame.bt_t9.setEnabled(true);
				}
					
				if(CurSel == 10)
				{
					TableSystem.ten = new TableSystem(10,null,1);
					StartFrame.SetRow(10);
					StartFrame.bt_t11.setEnabled(true);
				}
					
				if(CurSel == 11)
				{
					TableSystem.ten_one = new TableSystem(11,null,1);
					StartFrame.SetRow(11);
					StartFrame.bt_t11.setEnabled(true);
				}	
				if(CurSel == 12)
				{
					TableSystem.ten_two = new TableSystem(12,null,1);
					StartFrame.SetRow(12);
					StartFrame.bt_t12.setEnabled(true);
				}
					
				if(CurSel == 13)
				{
					TableSystem.ten_three = new TableSystem(13,null,1);
					StartFrame.SetRow(13);
					StartFrame.bt_t13.setEnabled(true);
				}	
				if(CurSel == 14) 
				{
					TableSystem.ten_four = new TableSystem(14,null,1);
					StartFrame.SetRow(14);
					StartFrame.bt_t14.setEnabled(true);
				}
					
				if(CurSel == 15)
				{
					TableSystem.ten_five = new TableSystem(15,null,1);
					StartFrame.SetRow(15);
					StartFrame.bt_t5.setEnabled(true);
				}
					
				dispose();
			}
		});
		tb_CleanUp.setEnabled(false);
		tb_CleanUp.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
		tb_CleanUp.setBackground(new Color(255, 218, 185));
		tb_CleanUp.setBounds(17, 268, 143, 77);
		contentPane.add(tb_CleanUp);
		
		JButton bt_Back = new JButton("뒤로가기");
		bt_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bt_Back.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
		bt_Back.setBackground(new Color(255, 218, 185));
		bt_Back.setBounds(177, 268, 143, 77);
		contentPane.add(bt_Back);
		
		lb_Per = new JLabel(Select.Percent + "%");
		lb_Per.setForeground(new Color(51, 204, 255));
		lb_Per.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Per.setFont(new Font("210 국민체조 B", Font.PLAIN, 30));
		lb_Per.setBounds(9, 10, 77, 30);
		contentPane.add(lb_Per);
	}
}
