package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class LoginFrame extends JFrame {
	private JPanel contentPane;
	private JPasswordField f_PW;
	private JTextField f_ID;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginFrame() {
		setTitle("POS-Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 220);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_ID = new JLabel("ID :");
		lb_ID.setFont(new Font("210 국민체조 B", Font.PLAIN, 15));
		lb_ID.setBounds(183, 53, 24, 19);
		contentPane.add(lb_ID);
		
		f_PW = new JPasswordField();
		f_PW.setBounds(211, 84, 138, 21);
		contentPane.add(f_PW);
		
		f_ID = new JTextField();
		f_ID.setFont(new Font("210 국민체조 B", Font.PLAIN, 12));
		f_ID.setBounds(211, 53, 138, 21);
		contentPane.add(f_ID);
		f_ID.setColumns(10);
		
		JLabel lb_PW = new JLabel("PW :");
		lb_PW.setFont(new Font("210 국민체조 B", Font.PLAIN, 15));
		lb_PW.setBounds(174, 84, 33, 19);
		contentPane.add(lb_PW);
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("C:\\Users\\\uAC15\uC2B9\uC544\\Desktop\\2\uD559\uB144 2\uD559\uAE30\\KakaoTalk_20191116_165315428.jpg"));
		logo.setBounds(12, 10, 150, 150);
		contentPane.add(logo);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setForeground(new Color(255, 255, 240));
		btnLogin.setBackground(new Color(255, 192, 203));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = f_ID.getText();
				String PW = f_PW.getText();
				
				if(ID.length()==0 || PW.length()==0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하세요.");
					return;
				}
				
				if(ID.equals("admin") && PW.equals("admin")) 
				{
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					dispose();
		
				}
				else
				{
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호 오류입니다.");
				}
			}		
				
		});
		btnLogin.setFont(new Font("210 국민체조 B", Font.PLAIN, 16));
		btnLogin.setBounds(234, 125, 117, 33);
		contentPane.add(btnLogin);
	}
}
