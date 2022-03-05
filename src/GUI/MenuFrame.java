package GUI;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import Program.*;
import Item.*;

public class MenuFrame extends JFrame {

	public static final String lb_Clock = null;
	JPanel contentPane;
	static JTable table;
	static int index = 0;
	JComboBox cb_Count;
	
	/////////////////// 체크박스 리셋
	void CheckSet() {		
		cb_Shot.setEnabled(false);
		cb_Whip.setEnabled(false);
		cb_Tapioca.setEnabled(false);
		cb_Syrup.setEnabled(false);
		cb_Shot.setSelected(false);
		cb_Whip.setSelected(false);
		cb_Tapioca.setSelected(false);
		cb_Syrup.setSelected(false);
		cb_Count.setEnabled(false);
	}
	void IndexSet()
	{
		cb_Shot.setEnabled(false);
		cb_Whip.setEnabled(false);
		cb_Tapioca.setEnabled(false);
		cb_Syrup.setEnabled(false);
		cb_Shot.setSelected(false);
		cb_Whip.setSelected(false);
		cb_Tapioca.setSelected(false);
		cb_Syrup.setSelected(false);
		cb_Count.setEnabled(false);
		table.setValueAt("없음", index,1);
		table.setValueAt("1", index, 2);
		cb_Count.setEnabled(true);
	}
	

	public JCheckBox cb_Shot, cb_Tapioca, cb_Whip, cb_Syrup;

	public MenuFrame(int Menunum) {
		int S_ = 0;
		int F_ = 0;
		int C_ = 0;
		setTitle("Seoungamasvin POS - Order");
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255,243,218));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(160, 82, 45));
		tabbedPane.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		tabbedPane.setBounds(41, 86, 443, 397);
		contentPane.add(tabbedPane);
		
		JPanel pn_Drink = new JPanel();
		pn_Drink.setBackground(new Color(255, 250, 250));
		tabbedPane.addTab("음료", null, pn_Drink, null);
		pn_Drink.setLayout(null);
		
		JButton bt_Ame = new JButton("아메리카노");
		bt_Ame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Shot.setEnabled(true);
				cb_Syrup.setEnabled(true);
				table.setValueAt("아메리카노", index,0);
			
		}
		});
		bt_Ame.setForeground(Color.DARK_GRAY);
		bt_Ame.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Ame.setBackground(new Color(255, 222, 173));
		bt_Ame.setBounds(12, 10, 130, 54);
		pn_Drink.add(bt_Ame);
		
		JButton bt_Cafe = new JButton("카페라떼");
		bt_Cafe.setForeground(Color.DARK_GRAY);
		bt_Cafe.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Cafe.setBackground(new Color(255, 222, 173));
		bt_Cafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Shot.setEnabled(true);
				cb_Syrup.setEnabled(true);
				table.setValueAt("카페라떼", index,0);
			}
		});
		bt_Cafe.setBounds(154, 10, 130, 54);
		pn_Drink.add(bt_Cafe);
		
		JButton bt_Peach = new JButton("아이스티");
		bt_Peach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("아이스티",  index,0);
			}
		});
		bt_Peach.setForeground(Color.DARK_GRAY);
		bt_Peach.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Peach.setBackground(new Color(255, 222, 173));
		bt_Peach.setBounds(296, 10, 130, 54);
		pn_Drink.add(bt_Peach);
		
		JButton bt_Grape = new JButton("청포도에이드");
		bt_Grape.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("청포도에이드",index,0);
			}
		});
		bt_Grape.setForeground(Color.DARK_GRAY);
		bt_Grape.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Grape.setBackground(new Color(255, 222, 173));
		bt_Grape.setBounds(12, 74, 130, 54);
		pn_Drink.add(bt_Grape);
		
		JButton bt_GrapeFruit = new JButton("자몽에이드");
		bt_GrapeFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("자몽에이드",index,0);
			}
		});
		bt_GrapeFruit.setForeground(Color.DARK_GRAY);
		bt_GrapeFruit.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_GrapeFruit.setBackground(new Color(255, 222, 173));
		bt_GrapeFruit.setBounds(154, 74, 130, 54);
		pn_Drink.add(bt_GrapeFruit);
		
		JButton bt_lemon = new JButton("레몬에이드");
		bt_lemon.setForeground(Color.DARK_GRAY);
		bt_lemon.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_lemon.setBackground(new Color(255, 222, 173));
		bt_lemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("레몬에이드", index,0);
			}
		});
		bt_lemon.setBounds(296, 74, 130, 54);
		pn_Drink.add(bt_lemon);
		
		JButton bt_Choco = new JButton("초코 밀크티");
		bt_Choco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();	
				cb_Tapioca.setEnabled(true);
				table.setValueAt("초코밀크티", index,0);
			}
		});
		bt_Choco.setForeground(Color.DARK_GRAY);
		bt_Choco.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Choco.setBackground(new Color(255, 222, 173));
		bt_Choco.setBounds(12, 138, 130, 54);
		pn_Drink.add(bt_Choco);
		
		JButton bt_BrownSugar = new JButton("흑당 밀크티");
		bt_BrownSugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Tapioca.setEnabled(true);
				table.setValueAt("흑당 밀크티", index,0);
			}
		});
		bt_BrownSugar.setForeground(Color.DARK_GRAY);
		bt_BrownSugar.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_BrownSugar.setBackground(new Color(255, 222, 173));
		bt_BrownSugar.setBounds(154, 138, 130, 54);
		pn_Drink.add(bt_BrownSugar);
		
		JButton bt_GreenTea = new JButton("녹차 밀크티");
		bt_GreenTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Tapioca.setEnabled(true);
				table.setValueAt("녹차 밀크티", index,0);
			}
		});
		bt_GreenTea.setForeground(Color.DARK_GRAY);
		bt_GreenTea.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_GreenTea.setBackground(new Color(255, 222, 173));
		bt_GreenTea.setBounds(296, 138, 130, 54);
		pn_Drink.add(bt_GreenTea);
		
		JButton bt_Cheese = new JButton("치즈케익 프라페");
		bt_Cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Whip.setEnabled(true);
				table.setValueAt("치즈케익 프라페", index,0);
			}
			});
		bt_Cheese.setForeground(Color.DARK_GRAY);
		bt_Cheese.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Cheese.setBackground(new Color(255, 222, 173));
		bt_Cheese.setBounds(12, 202, 130, 54);
		pn_Drink.add(bt_Cheese);
		
		JButton bt_Oreo = new JButton("오레오 프라페");
		bt_Oreo.setForeground(Color.DARK_GRAY);
		bt_Oreo.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Oreo.setBackground(new Color(255, 222, 173));
		bt_Oreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Whip.setEnabled(true);
				table.setValueAt("오레오 프라페", index,0);
			}
		});
		bt_Oreo.setBounds(154, 202, 130, 54);
		pn_Drink.add(bt_Oreo);
		
		JButton bt_GrPra = new JButton("녹차 프라페");
		bt_GrPra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				cb_Whip.setEnabled(true);
				table.setValueAt("녹차 프라페", index,0);
			}
		});
		bt_GrPra.setForeground(Color.DARK_GRAY);
		bt_GrPra.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_GrPra.setBackground(new Color(255, 222, 173));
		bt_GrPra.setBounds(296, 202, 130, 54);
		pn_Drink.add(bt_GrPra);
		
		//////////////// 체크박스 옵션
		cb_Whip = new JCheckBox("몽글몽글");	
		cb_Whip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb_Whip.isSelected())
					table.setValueAt("휘핑 크림", index,1);
				else
					table.setValueAt("없음", index,1);
			}
		});cb_Whip.setEnabled(false);	cb_Whip.setFont(new Font("210 국민체조 B", Font.PLAIN, 13));
		cb_Whip.setBackground(new Color(255, 250, 250));	cb_Whip.setBounds(154, 294, 115, 23);	pn_Drink.add(cb_Whip);
		
		cb_Tapioca = new JCheckBox("쫀득쫀득");	
		cb_Tapioca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb_Tapioca.isSelected())
					table.setValueAt("타피오카 펄", index,1);
				else
					table.setValueAt("없음", index,1);
			}
		});cb_Tapioca.setEnabled(false);	cb_Tapioca.setFont(new Font("210 국민체조 B", Font.PLAIN, 13));
		cb_Tapioca.setBackground(new Color(255, 250, 250));	cb_Tapioca.setBounds(12, 294, 115, 23);		pn_Drink.add(cb_Tapioca);
		
		cb_Shot = new JCheckBox("진하게");		
		cb_Shot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb_Shot.isSelected())
					if(cb_Syrup.isSelected())
						table.setValueAt("투 샷 + 시럽",index,1);
					else
						table.setValueAt("투 샷",index,1);
				else
					if(cb_Syrup.isSelected())
						table.setValueAt("시럽", index,1);
					else
						table.setValueAt("없음", index,1);			
			}
		});cb_Shot.setEnabled(false);	cb_Shot.setFont(new Font("210 국민체조 B", Font.PLAIN, 13));	
		cb_Shot.setBackground(new Color(255, 250, 250));	cb_Shot.setBounds(12, 269, 66, 23); pn_Drink.add(cb_Shot);
 		
		cb_Syrup = new JCheckBox("달콤하게");
		cb_Syrup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb_Syrup.isSelected())
				{
					if(cb_Shot.isSelected())
						table.setValueAt("투 샷 + 시럽",index,1);
					else
						table.setValueAt("시럽",index,1);
				}
				else
					if(cb_Shot.isSelected())
						table.setValueAt("투 샷", index,1);
					else
						table.setValueAt("없음", index,1);
			}
		});
		

		cb_Syrup.setFont(new Font("210 국민체조 B", Font.PLAIN, 13));
		cb_Syrup.setEnabled(false);
		cb_Syrup.setBackground(new Color(255, 250, 250));
		cb_Syrup.setBounds(154, 269, 136, 23);
		pn_Drink.add(cb_Syrup);
		
		JPanel pn_Dessert = new JPanel();
		pn_Dessert.setBackground(new Color(255, 250, 250));	tabbedPane.addTab("디저트", null, pn_Dessert, null);
		pn_Dessert.setLayout(null);
		
		JButton bt_Waffle = new JButton("승아마스빈 와플");
		bt_Waffle.setBackground(new Color(255, 222, 173));
		bt_Waffle.setForeground(Color.DARK_GRAY);
		bt_Waffle.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Waffle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("승아마스빈 와플", index,0);
			}
		});
		bt_Waffle.setBounds(12, 10, 130, 54);
		pn_Dessert.add(bt_Waffle);
		
		JButton bt_ChocoMaca = new JButton("초코 마카롱");
		bt_ChocoMaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("초코 마카롱", index,0);
			}
		});
		bt_ChocoMaca.setBackground(new Color(255, 222, 173));	bt_ChocoMaca.setForeground(Color.DARK_GRAY);
		bt_ChocoMaca.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));	bt_ChocoMaca.setBounds(154, 10, 130, 54);	pn_Dessert.add(bt_ChocoMaca);
		
		JButton bt_StrawMaca = new JButton("딸기 마카롱");
		bt_StrawMaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("딸기 마카롱", index,0);
			}
		});
		bt_StrawMaca.setBackground(new Color(255, 222, 173));	bt_StrawMaca.setForeground(Color.DARK_GRAY);
		bt_StrawMaca.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));	bt_StrawMaca.setBounds(296, 10, 130, 54);	pn_Dessert.add(bt_StrawMaca);
		
		JButton bt_Tiramisu = new JButton("티라미수");
		bt_Tiramisu.setBackground(new Color(255, 222, 173));	bt_Tiramisu.setForeground(Color.DARK_GRAY);
		bt_Tiramisu.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Tiramisu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("티라미수", index,0);
			}
		});
		bt_Tiramisu.setBounds(12, 74, 130, 54);
		pn_Dessert.add(bt_Tiramisu);
		
		JButton bt_CheeseCake = new JButton("치즈 케익");
		bt_CheeseCake.setBackground(new Color(255, 222, 173));
		bt_CheeseCake.setForeground(Color.DARK_GRAY);
		bt_CheeseCake.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_CheeseCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("치즈 케익", index,0);
			}
		});
		bt_CheeseCake.setBounds(154, 74, 130, 54);
		pn_Dessert.add(bt_CheeseCake);
		
		JButton bt_Castella = new JButton("카스테라");
		bt_Castella.setBackground(new Color(255, 222, 173));
		bt_Castella.setForeground(Color.DARK_GRAY);
		bt_Castella.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Castella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("카스테라", index,0);
			}
		});
		bt_Castella.setBounds(296, 74, 130, 54);
		pn_Dessert.add(bt_Castella);
		
		JButton bt_Macadamia = new JButton("마카다미아 쿠키");
		bt_Macadamia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("마카다미아 쿠키", index,0);
			}
		});
		bt_Macadamia.setBackground(new Color(255, 222, 173));
		bt_Macadamia.setForeground(Color.DARK_GRAY);
		bt_Macadamia.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Macadamia.setBounds(12, 138, 130, 54);
		pn_Dessert.add(bt_Macadamia);
		
		/////////////////// 악세사리
		JPanel pn_Acc = new JPanel();	pn_Acc.setLocation(2, 62);	pn_Acc.setBackground(new Color(255, 250, 250));
		tabbedPane.addTab("악세사리", null, pn_Acc, null);	pn_Acc.setLayout(null);
		
		JButton bt_Bookmark = new JButton("책갈피");
		bt_Bookmark.setForeground(Color.DARK_GRAY);
		bt_Bookmark.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Bookmark.setBackground(new Color(255, 222, 173));
		bt_Bookmark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("책갈피", index,0);
			}
		});
		bt_Bookmark.setBounds(12, 10, 130, 54);
		pn_Acc.add(bt_Bookmark);
		
		JButton bt_KeyChain = new JButton("열쇠 고리");
		bt_KeyChain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("열쇠 고리", index,0);
			}
		});
		bt_KeyChain.setForeground(Color.DARK_GRAY);
		bt_KeyChain.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_KeyChain.setBackground(new Color(255, 222, 173));
		bt_KeyChain.setBounds(154, 10, 130, 54);
		pn_Acc.add(bt_KeyChain);
		
		JButton bt_Diary = new JButton("2020년 다이어리");
		bt_Diary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("2020년 다이어리", index,0);
			}
		});
		bt_Diary.setForeground(Color.DARK_GRAY);
		bt_Diary.setFont(new Font("210 국민체조 B", Font.PLAIN, 13));
		bt_Diary.setBackground(new Color(255, 222, 173));
		bt_Diary.setBounds(296, 10, 130, 54);
		pn_Acc.add(bt_Diary);
		
		JButton bt_Tumblur = new JButton("텀블러");	
		bt_Tumblur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("텀블러", index,0);
			}
		});bt_Tumblur.setForeground(Color.DARK_GRAY);
		bt_Tumblur.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Tumblur.setBackground(new Color(255, 222, 173));
		bt_Tumblur.setBounds(12, 74, 130, 54);
		pn_Acc.add(bt_Tumblur);
		
		JButton bt_Thermos = new JButton("보온병");
		bt_Thermos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("보온병", index,0);
			}
		});
		bt_Thermos.setForeground(Color.DARK_GRAY);	bt_Thermos.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Thermos.setBackground(new Color(255, 222, 173));	bt_Thermos.setBounds(154, 74, 130, 54);	pn_Acc.add(bt_Thermos);
		
		JButton bt_Mug = new JButton("머그컵");
		bt_Mug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("머그컵", index,0);
			}
		});
		bt_Mug.setForeground(Color.DARK_GRAY);	bt_Mug.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Mug.setBackground(new Color(255, 222, 173));	bt_Mug.setBounds(296, 74, 130, 54);		pn_Acc.add(bt_Mug);
		
		JButton bt_Blanket = new JButton("담요");
		bt_Blanket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexSet();
				table.setValueAt("담요", index,0);
			}
		});
		bt_Blanket.setForeground(Color.DARK_GRAY);	bt_Blanket.setFont(new Font("210 국민체조 B", Font.PLAIN, 14));
		bt_Blanket.setBackground(new Color(255, 222, 173));	bt_Blanket.setBounds(12, 138, 130, 54);	pn_Acc.add(bt_Blanket);
		
		/////////////////////////////// GUI 구현 버튼
		JButton bt_AllCancle = new JButton("전체 취소");					
		bt_AllCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckSet();
				for(int a = 0; a<12; a++)
					for(int b = 0; b< 3; b++)
						table.setValueAt("", a,b);
					index = 0;
			}
		});
		bt_AllCancle.setForeground(new Color(248, 248, 255));
		bt_AllCancle.setBackground(new Color(250, 128, 114));
		bt_AllCancle.setFont(new Font("210 국민체조 B", Font.PLAIN, 18));
		bt_AllCancle.setBounds(633, 410, 106, 73);
		contentPane.add(bt_AllCancle);
		
		JButton bt_AllOrder = new JButton("주문 하기");
		bt_AllOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Menunum == 0)
				{
					dispose();
					return;
				}
				StartFrame.setTableMenu(GetMenuFrame(Menunum), Menunum);
				{dispose();}	
			}
		});
		
		bt_AllOrder.setForeground(new Color(248, 248, 255));
		bt_AllOrder.setBackground(new Color(250, 128, 114));
		bt_AllOrder.setFont(new Font("210 국민체조 B", Font.PLAIN, 18));
		bt_AllOrder.setBounds(732, 410, 106, 73);
		contentPane.add(bt_AllOrder);
		
		JLabel label = new JLabel("< 주문 현황 >");
		label.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
		label.setBounds(621, 68, 118, 35);
		contentPane.add(label);
		
		JPanel pn_Top = new JPanel();
		pn_Top.setBackground(new Color(205, 92, 92));
		pn_Top.setBounds(0, 0, 894, 33);
		contentPane.add(pn_Top);
		pn_Top.setLayout(null);
		
		JButton bt_CloseMenu = new JButton("뒤로");
		bt_CloseMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}	});
		bt_CloseMenu.setBackground(new Color(233, 150, 122));
		bt_CloseMenu.setFont(new Font("210 국민체조 B", Font.PLAIN, 18));
		bt_CloseMenu.setBounds(761, 495, 77, 40);
		contentPane.add(bt_CloseMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(528, 125, 298, 186);
		contentPane.add(scrollPane);
		
		table = new JTable();

		table.setFont(new Font("210 국민체조 R", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
				{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
			},new String[] {"제품명", "추가 옵션", "갯수"}));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(112);
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		table.getColumnModel().getColumn(2).setPreferredWidth(57);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 128, 114));
		panel.setBounds(515, 111, 325, 214);
		contentPane.add(panel);
		
		JButton bt_OrderDrink = new JButton("선택");
		bt_OrderDrink.setBounds(513, 410, 106, 73);
		contentPane.add(bt_OrderDrink);
		bt_OrderDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getValueAt(index,0) != "")
				{
					if(cb_Shot.isSelected()&&cb_Syrup.isSelected())
						table.setValueAt("투 샷 + 시럽", index,1); 
					else
					{
						if(cb_Shot.isSelected())
						{
							table.setValueAt("투 샷", index,1); 
							cb_Shot.setSelected(false);
						}
						
						if(cb_Syrup.isSelected())
						{
							table.setValueAt("시럽", index,1); 
							cb_Shot.setSelected(false);
						}
						if(cb_Tapioca.isSelected())
						{
							table.setValueAt("타피오카 펄", index,1); 
							cb_Tapioca.setSelected(false);
						}
						if(cb_Whip.isSelected())
						{
							table.setValueAt("휘핑 크림", index,1); 
							cb_Whip.setSelected(false);
						}
					}
					index++;
					CheckSet();
				}
				
			}
		});
		bt_OrderDrink.setBackground(new Color(244, 164, 96));
		bt_OrderDrink.setFont(new Font("210 국민체조 B", Font.PLAIN, 18));
		cb_Count = new JComboBox();
		cb_Count.setBounds(749, 358, 43, 25);
		contentPane.add(cb_Count);
		cb_Count.setEnabled(false);
		cb_Count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object N = cb_Count.getSelectedItem();
				table.setValueAt(N,index,2);
			}
		});
		cb_Count.setFont(new Font("210 국민체조 B", Font.PLAIN, 15));
		cb_Count.setBackground(Color.PINK);
		cb_Count.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		
		JLabel label_1 = new JLabel("개수 : ");
		label_1.setFont(new Font("210 국민체조 B", Font.PLAIN, 20));
		label_1.setBounds(692, 358, 57, 25);
		contentPane.add(label_1);
	}

	static String[][] GetMenuFrame(int type)
	{
		String [][] orderlist = new String[index][3];
		int S_ = 0;
		int F_ = 0;
		int C_ = 0;
		for(int i=0; i<index; i++)
		{
			//[0] = 제품명, [1] = 추가 옵션, [2] = 갯수
			orderlist[i][0] = table.getValueAt(i, 0) + "";
			orderlist[i][1] = table.getValueAt(i, 1) + "";
			orderlist[i][2] = table.getValueAt(i, 2) + "";
		}
		switch(type) {
		case 1:
			TableSystem.one = new TableSystem(1,orderlist,100);
			StartFrame.bt_t1.setEnabled(false);
			break;
		case 2:
			TableSystem.two = new TableSystem(2,orderlist,100);
			StartFrame.bt_t2.setEnabled(false);
			break;
		case 3:
			TableSystem.three = new TableSystem(3,orderlist,100);
			StartFrame.bt_t3.setEnabled(false);
			break;
		case 4:
			TableSystem.four = new TableSystem(4,orderlist,100);
			StartFrame.bt_t4.setEnabled(false);
			break;
		case 5:
			TableSystem.five = new TableSystem(5,orderlist,100);
			StartFrame.bt_t5.setEnabled(false);
			break;
		case 6:
			TableSystem.six = new TableSystem(6,orderlist,100);
			StartFrame.bt_t6.setEnabled(false);
			break;
		case 7:
			TableSystem.seven = new TableSystem(7,orderlist,100);
			StartFrame.bt_t7.setEnabled(false);
			break;
		case 8:
			TableSystem.eight = new TableSystem(8,orderlist,100);
			StartFrame.bt_t8.setEnabled(false);
			break;
		case 9:
			TableSystem.nine = new TableSystem(9,orderlist,100);
			StartFrame.bt_t9.setEnabled(false);
			break;
		case 10:
			TableSystem.ten = new TableSystem(10,orderlist,100);
			StartFrame.bt_t10.setEnabled(false);
			break;
		case 11:
			TableSystem.ten_one = new TableSystem(11,orderlist,100);
			StartFrame.bt_t11.setEnabled(false);
			break;
		case 12:
			TableSystem.ten_two = new TableSystem(12,orderlist,100);
			StartFrame.bt_t13.setEnabled(false);
			break;
		case 13:
			TableSystem.ten_three = new TableSystem(13,orderlist,100);
			StartFrame.bt_t14.setEnabled(false);
			break;
		case 14:
			TableSystem.ten_four = new TableSystem(14,orderlist,100);
			StartFrame.bt_t15.setEnabled(false);
			break;
		case 15:
			TableSystem.ten_five = new TableSystem(15,orderlist,100);
			StartFrame.bt_t12.setEnabled(false);
			break;
		
		}
		return orderlist;
	}

	private static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}