package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GUI.MenuFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Item.Stock;
import Program.ClockSystem;
import Program.TableSystem;

public class StartFrame extends JFrame {

	
	public JPanel contentPane;
	public static JTable table;
	public static JLabel lb_Stock ;
	public static JButton bt_t1,bt_t2,bt_t3,bt_t4,bt_t5,bt_t6,bt_t7,bt_t8,bt_t9,bt_t10, bt_t11, bt_t12, bt_t13, bt_t14, bt_t15, bt_TO;
	public static JLabel lb_Clock;
	private static JLabel lb_stock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					new ClockSystem();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void SetRow(int i)
	{
		table.setValueAt("사용 가능", i-1, 1);
		table.setValueAt("", i-1, 2);
		
	}

	

	void FrameSet(int type) {
		MenuFrame frame = new MenuFrame(type);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);	
	}
	
	
	static void SetStockLable() {
		lb_stock.setText("< 재고 > 빨대 : "+ String.valueOf(Stock.getStraw()) + "개  컵&홀더 : " + 
		String.valueOf(Stock.getCupAndHolder()) + "개  포크 : " + String.valueOf(Stock.getFork()) + "개");
	}

	
	public StartFrame() {
		
		String[][] Raw = null;
		TableSystem.one = new TableSystem(1,Raw,1);
		TableSystem.two = new TableSystem(2,Raw,1);
		TableSystem.three = new TableSystem(3,Raw,1);
		TableSystem.four = new TableSystem(4,Raw,1);
		TableSystem.five = new TableSystem(5,Raw,1);
		TableSystem.six = new TableSystem(6,Raw,1);
		TableSystem.seven = new TableSystem(7,Raw,1);
		TableSystem.eight = new TableSystem(8,Raw,-1);
		TableSystem.nine = new TableSystem(9,Raw,1);
		TableSystem.ten = new TableSystem(10,Raw,-1);
		TableSystem.ten_one = new TableSystem(11,Raw,-1);
		TableSystem.ten_two = new TableSystem(12,Raw,-1);
		TableSystem.ten_three = new TableSystem(13,Raw,-1);
		TableSystem.ten_four = new TableSystem(14,Raw,-1);
		TableSystem.ten_five = new TableSystem(15,Raw,-1);
		
		setResizable(false);
		setTitle("Sengamasvin POS - Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255,243,218));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bt_t7 = new JButton("테이블 7");
		bt_t7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(7);
			}
		});
		
		bt_t1 = new JButton("테이블 1");
		bt_t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(1);
			}
		});
		bt_t1.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t1.setForeground(new Color(139, 69, 19));
		bt_t1.setBackground(new Color(255, 204, 102));
		bt_t1.setBounds(35, 125, 111, 49);
		contentPane.add(bt_t1);
		
		bt_t2 = new JButton("테이블 2");
		bt_t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(2);
			}
		});
		bt_t2.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t2.setForeground(new Color(139, 69, 19));
		bt_t2.setBackground(new Color(255, 204, 102));
		bt_t2.setBounds(151, 125, 111, 49);
		contentPane.add(bt_t2);
		
		bt_t3 = new JButton("테이블 3");
		bt_t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(3);
			}
		});
		bt_t3.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t3.setForeground(new Color(139, 69, 19));
		bt_t3.setBackground(new Color(255, 204, 102));
		bt_t3.setBounds(267, 125, 111, 49);
		contentPane.add(bt_t3);
		
		bt_t4 = new JButton("테이블 4");
		bt_t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(4);
			}
		});
		bt_t4.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t4.setForeground(new Color(139, 69, 19));
		bt_t4.setBackground(new Color(255, 204, 102));
		bt_t4.setBounds(35, 184, 111, 49);
		contentPane.add(bt_t4);
		
		bt_t5 = new JButton("테이블 5");
		bt_t5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(5);
			}
		});
		bt_t5.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t5.setForeground(new Color(139, 69, 19));
		bt_t5.setBackground(new Color(255, 204, 102));
		bt_t5.setBounds(151, 184, 111, 49);
		contentPane.add(bt_t5);
		
		bt_t6 = new JButton("테이블 6");
		bt_t6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(6);
			}
		});
		bt_t6.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t6.setForeground(new Color(139, 69, 19));
		bt_t6.setBackground(new Color(255, 204, 102));
		bt_t6.setBounds(267, 184, 111, 49);
		contentPane.add(bt_t6);
		
		bt_t7.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t7.setForeground(new Color(139, 69, 19));
		bt_t7.setBackground(new Color(255, 204, 102));
		bt_t7.setBounds(35, 243, 111, 49);
		contentPane.add(bt_t7);
		
		bt_t8 = new JButton("테이블 8");
		bt_t8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(8);
			}
		});
		bt_t8.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t8.setForeground(new Color(139, 69, 19));
		bt_t8.setBackground(new Color(255, 204, 102));
		bt_t8.setBounds(151, 243, 111, 49);
		contentPane.add(bt_t8);
		
		bt_t9 = new JButton("테이블 9");
		bt_t9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(9);
			}
		});
		bt_t9.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t9.setForeground(new Color(139, 69, 19));
		bt_t9.setBackground(new Color(255, 204, 102));
		bt_t9.setBounds(267, 243, 111, 49);
		contentPane.add(bt_t9);
		
		bt_t10 = new JButton("테이블 10");
		bt_t10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(10);
			}
		});
		bt_t10.setEnabled(false);
		bt_t10.setForeground(new Color(139, 69, 19));
		bt_t10.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t10.setBackground(new Color(255, 204, 102));
		bt_t10.setBounds(35, 302, 111, 49);
		contentPane.add(bt_t10);
		
		bt_t11 = new JButton("테이블 11");
		bt_t11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(11);
			}
		});
		bt_t11.setEnabled(false);
		bt_t11.setForeground(new Color(139, 69, 19));
		bt_t11.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t11.setBackground(new Color(255, 204, 102));
		bt_t11.setBounds(151, 302, 111, 49);
		contentPane.add(bt_t11);
		
		bt_t12 = new JButton("테이블 12");
		bt_t12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(12);
			}
		});
		bt_t12.setEnabled(false);
		bt_t12.setForeground(new Color(139, 69, 19));
		bt_t12.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t12.setBackground(new Color(255, 204, 102));
		bt_t12.setBounds(267, 302, 111, 49);
		contentPane.add(bt_t12);
		
		bt_t13 = new JButton("테이블 13");
		bt_t13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(13);
			}
		});
		bt_t13.setEnabled(false);
		bt_t13.setForeground(new Color(139, 69, 19));
		bt_t13.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t13.setBackground(new Color(255, 204, 102));
		bt_t13.setBounds(35, 361, 111, 49);
		contentPane.add(bt_t13);
		
		bt_t14 = new JButton("테이블 14");
		bt_t14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(14);
			}
		});
		bt_t14.setEnabled(false);
		bt_t14.setForeground(new Color(139, 69, 19));
		bt_t14.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t14.setBackground(new Color(255, 204, 102));
		bt_t14.setBounds(151, 361, 111, 49);
		contentPane.add(bt_t14);
		
		bt_t15 = new JButton("테이블 15");
		bt_t15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(15);
			}
		});
		bt_t15.setEnabled(false);
		bt_t15.setForeground(new Color(139, 69, 19));
		bt_t15.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_t15.setBackground(new Color(255, 204, 102));
		bt_t15.setBounds(267, 361, 111, 49);
		contentPane.add(bt_t15);
		
		bt_TO = new JButton("테이크 아웃");
		bt_TO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame.index = 0;
				FrameSet(0);
			}
		});
		bt_TO.setForeground(new Color(255, 255, 255));
		bt_TO.setFont(new Font("210 국민체조 B", Font.PLAIN, 19));
		bt_TO.setBackground(new Color(255, 153, 102));
		bt_TO.setBounds(236, 419, 142, 56);
		contentPane.add(bt_TO);
		
	
		
		
		JLabel lb_Tablelist = new JLabel("< 테이블 리스트 >");
		lb_Tablelist.setBackground(new Color(255, 255, 255));
		lb_Tablelist.setFont(new Font("210 국민체조 B", Font.PLAIN, 23));
		lb_Tablelist.setBounds(544, 75, 170, 26);
		contentPane.add(lb_Tablelist);
		
		JPanel pn_Top = new JPanel();
		pn_Top.setBackground(new Color(205, 92, 92));
		pn_Top.setBounds(0, 0, 894, 33);
		contentPane.add(pn_Top);
		pn_Top.setLayout(null);
		
		lb_Clock = new JLabel();
		lb_Clock.setForeground(new Color(255, 255, 240));
		lb_Clock.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
		lb_Clock.setBounds(634, 0, 260, 33);
		pn_Top.add(lb_Clock);
				
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(419, 128, 421, 265);
				contentPane.add(scrollPane);
				
				table = new JTable();
				table.getTableHeader().setResizingAllowed(false);
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{"테이블 1", "사용 가능", ""},	{"테이블 2", "사용 가능", ""},	{"테이블 3", "사용 가능", ""},	{"테이블 4", "사용 가능", ""},
						{"테이블 5", "사용 가능", ""},	{"테이블 6", "사용 가능", ""},	{"테이블 7", "사용 가능", ""},	{"테이블 8", "사용 가능", ""},	
						{"테이블 9", "사용 가능", ""},	{"테이블 10", "비활성", ""},	{"테이블 11", "비활성", ""},	{"테이블 12", "비활성", ""},	
						{"테이블 13","비활성", ""}, {"테이블 14", "비활성", ""},	{"테이블 15", "비활성", ""},
					},
					new String[] {
						"테이블", "상태", "주문 리스트"
					}
				));
				table.getColumnModel().getColumn(2).setPreferredWidth(316);
				scrollPane.setViewportView(table);
				
				JPanel panel = new JPanel();
				panel.setBackground(new Color(250, 128, 114));
				panel.setBounds(405, 111, 448, 299);
				contentPane.add(panel);
				//////////////////디테일 테이블 구현/////////////////////////////////
				JButton bt_Detail = new JButton("테이블 상세 정보");
				bt_Detail.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {	
						TableSelect frame = new TableSelect();
						frame.setVisible(true);
				}});
				bt_Detail.setForeground(Color.WHITE);
				bt_Detail.setFont(new Font("210 국민체조 B", Font.PLAIN, 16));
				bt_Detail.setBackground(new Color(165, 42, 42));
				bt_Detail.setBounds(711, 419, 142, 56);
				contentPane.add(bt_Detail);
				
				JButton bt_Log = new JButton("판매 기록");
				bt_Log.setForeground(Color.WHITE);
				bt_Log.setFont(new Font("210 국민체조 B", Font.PLAIN, 16));
				bt_Log.setBackground(new Color(165, 42, 42));
				bt_Log.setBounds(574, 419, 142, 56);
				contentPane.add(bt_Log);
				
				JButton bt_ManageMode = new JButton("재고 & 테이블");
				bt_ManageMode.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Manage frame = new Manage();
						frame.setVisible(true);
					}
				});
				bt_ManageMode.setForeground(new Color(255, 255, 240));
				bt_ManageMode.setBackground(new Color(205, 133, 63));
				bt_ManageMode.setFont(new Font("210 국민체조 B", Font.PLAIN, 15));
				bt_ManageMode.setBounds(532, 517, 142, 33);
				contentPane.add(bt_ManageMode);
				
				lb_stock = new JLabel("<재고> 컵&홀더 : "+ Stock.getCupAndHolder()+"   빨대 : "+Stock.getStraw()+ "   포크 : " + Stock.getFork());
				lb_stock.setForeground(new Color(250, 128, 114));
				lb_stock.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
				lb_stock.setBackground(new Color(204, 51, 51));
				lb_stock.setBounds(12, 508, 474, 49);
				contentPane.add(lb_stock);
		
		
	}
	static boolean Empty(JTable tb,int num) {
		if(tb.getValueAt(num, 2) =="") 		
			return true;
		return false;	
	}
	static boolean EnUseable(JTable tb, int num)
	{
		
		return false;
	}
	static void setTableList(String TNum) {
		
		if(TNum.equals("9"))
		{
			bt_t10.setEnabled(false);bt_t11.setEnabled(false);bt_t12.setEnabled(false);
			bt_t13.setEnabled(false);bt_t14.setEnabled(false);bt_t15.setEnabled(false);
			table.setValueAt("비활성", 9,1);
			table.setValueAt("비활성", 10,1);
			table.setValueAt("비활성", 11,1);
			table.setValueAt("비활성", 12,1);
			table.setValueAt("비활성", 13,1);
			table.setValueAt("비활성", 14,1);
		}
		if(TNum.equals("10"))
		{
			bt_t9.setEnabled(true);bt_t10.setEnabled(true);bt_t11.setEnabled(false);bt_t12.setEnabled(false);
			bt_t13.setEnabled(false);bt_t14.setEnabled(false);bt_t15.setEnabled(false);
			if(Empty(table,9))
				table.setValueAt("사용 가능", 9,1);
			table.setValueAt("비활성", 10,1);
			table.setValueAt("비활성", 11,1);
			table.setValueAt("비활성", 12,1);
			table.setValueAt("비활성", 13,1);
			table.setValueAt("비활성", 14,1);
		}
		if(TNum.equals("11"))
		{
			bt_t9.setEnabled(true);bt_t10.setEnabled(true);bt_t11.setEnabled(true);bt_t12.setEnabled(false);
			bt_t13.setEnabled(false);bt_t14.setEnabled(false);bt_t15.setEnabled(false);
			if(Empty(table,9))
				table.setValueAt("사용 가능", 9,1);
			if(Empty(table,10))
				table.setValueAt("사용 가능", 10,1);
			table.setValueAt("비활성", 11,1);
			table.setValueAt("비활성", 12,1);
			table.setValueAt("비활성", 13,1);
			table.setValueAt("비활성", 14,1);
		}
		if(TNum.equals("12"))
		{
			bt_t9.setEnabled(true);bt_t10.setEnabled(true);bt_t11.setEnabled(true);bt_t12.setEnabled(true);
			bt_t13.setEnabled(false);bt_t14.setEnabled(false);bt_t15.setEnabled(false);
			if(Empty(table,9))
				table.setValueAt("사용 가능", 9,1);
			if(Empty(table,10))
				table.setValueAt("사용 가능", 10,1);
			if(Empty(table,11))
				table.setValueAt("사용 가능", 11,1);
			table.setValueAt("비활성", 12,1);
			table.setValueAt("비활성", 13,1);
			table.setValueAt("비활성", 14,1);
			
		}
		if(TNum.equals("13"))
		{
			bt_t9.setEnabled(true);bt_t10.setEnabled(true);bt_t11.setEnabled(true);bt_t12.setEnabled(true);
			bt_t13.setEnabled(true);bt_t14.setEnabled(false);bt_t15.setEnabled(false);
			if(Empty(table,9))
				table.setValueAt("사용 가능", 9,1);
			if(Empty(table,10))
				table.setValueAt("사용 가능", 10,1);
			if(Empty(table,11))
				table.setValueAt("사용 가능", 11,1);
			if(Empty(table,12))
				table.setValueAt("사용 가능", 12,1);
			table.setValueAt("비활성", 13,1);
			table.setValueAt("비활성", 14,1);
		}
		if(TNum.equals("14"))
		{
			bt_t9.setEnabled(true);bt_t10.setEnabled(true);bt_t11.setEnabled(true);bt_t12.setEnabled(true);
			bt_t13.setEnabled(true);bt_t14.setEnabled(true);bt_t15.setEnabled(false);
			if(Empty(table,9))
				table.setValueAt("사용 가능", 9,1);
			if(Empty(table,10))
				table.setValueAt("사용 가능", 10,1);
			if(Empty(table,11))
				table.setValueAt("사용 가능", 11,1);
			if(Empty(table,12))
				table.setValueAt("사용 가능", 12,1);
			if(Empty(table,13))
				table.setValueAt("사용 가능", 13,1);
			table.setValueAt("비활성", 14,1);
		}
		if(TNum.equals("15"))
		{
			bt_t9.setEnabled(true);bt_t10.setEnabled(true);bt_t11.setEnabled(true);bt_t12.setEnabled(true);
			bt_t13.setEnabled(true);bt_t14.setEnabled(true);bt_t15.setEnabled(true);
			if(Empty(table,9))
				table.setValueAt("사용 가능", 9,1);
			if(Empty(table,10))
				table.setValueAt("사용 가능", 10,1);
			if(Empty(table,11))
				table.setValueAt("사용 가능", 11,1);
			if(Empty(table,12))
				table.setValueAt("사용 가능", 12,1);
			if(Empty(table,13))
				table.setValueAt("사용 가능", 13,1);
			if(Empty(table,14))
				table.setValueAt("사용 가능", 14,1);
		}
	}

	static void setTableMenu(String[][] orderList, int type) {
		String[][] miniMenu = new String[orderList.length][2];
		// 간략화 시킨 메뉴를 담을 배열
		// 미니 메뉴는 같은 음료의 옵션이 달라도 같음 음료로 취급
		// orderlist[0]제품이름, [2]제품개수를 필요로해

		// 미니 메뉴를 ""로 초기화
		for(int a = 0; a<orderList.length; a++) {
			for(int b = 0; b < 2; b++) {
				miniMenu[a][b] = ""; 
				} 
			}
			
		// 메뉴를 싹다 불러 왔으니 이름비교해서 이전에 없었던거면 새로 추가하고 있었던거면 개수끼리 더해준다 마지막엔 미니메뉴 글자끼리 더해준다
		String MM = "";
		int MMIndex=0;
		boolean RT = true;
		
		for(int i = 0; i < orderList.length; i++) {			//i는 orderList만큼 반복할거고
			
			for(int j =0; j < orderList.length; j++)
			{
				RT = true;
				//System.out.println(miniMenu[j][0]+ "오더리스트" + orderList[i][0]);
				if(miniMenu[j][0].equals(orderList[i][0]))
				{
					miniMenu[j][1] = String.valueOf(Integer.parseInt(orderList[i][2]) + Integer.parseInt(miniMenu[j][1]));
					RT = false;
					break;
				}
			}
			if(RT)
			{
					miniMenu[MMIndex][0] = orderList[i][0];
					miniMenu[MMIndex][1] = orderList[i][2];
					MMIndex++;
			}	
		}
		for(int k = 0; k<MMIndex; k++)
		{
			MM += miniMenu[k][0]+"("+miniMenu[k][1] + ")" +" ";
		}
		StartFrame.table.setValueAt(MM, type-1, 2);
		StartFrame.table.setValueAt("사용중", type-1, 1);
	}
	
	
}