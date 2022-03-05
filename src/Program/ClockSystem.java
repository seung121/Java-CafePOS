package Program;

import java.util.Calendar;

import javax.swing.JFrame;
import GUI.DetailTable;
import GUI.StartFrame;

public class ClockSystem extends JFrame implements Runnable {

	public ClockSystem() {
		Thread t = new Thread(this);
		t.start();
	}
	
	public static void main(String[] args) {
		new ClockSystem();
	}
	
	public String CalenderFrame() {
		 Calendar now = Calendar.getInstance();
	        int year = now.get(Calendar.YEAR);
	        int month = now.get(Calendar.MONTH) + 1;
	        int date = now.get(Calendar.DATE);
	        int hour = now.get(Calendar.HOUR_OF_DAY);
	        int minute = now.get(Calendar.MINUTE);
	        int second = now.get(Calendar.SECOND);
	        String sHour = "";
	        String sMinute = "";
	        String sSecond = "";
	        if(hour < 10) {
	            sHour = "0" + hour;
	        } else {
	            sHour = String.valueOf(hour);
	        }
	        if(minute < 10) {
	            sMinute = "0" + minute;
	        } else {
	            sMinute = String.valueOf(minute);
	        }
	        if(second < 10) {
	            sSecond = "0" + second;
	        } else {
	            sSecond = String.valueOf(second);
	        }
	        return year + "년 " + month + "월 " + date + "일 " + sHour + ":" + sMinute + ":" + sSecond;
	}
	
	public void Drink() {
		if(DetailTable.CurSel == 1)
			DetailTable.lb_Per.setText(TableSystem.one.Percent+"%");
		
		if(DetailTable.CurSel == 2)
			DetailTable.lb_Per.setText(TableSystem.two.Percent+"%");
		
		if(DetailTable.CurSel == 3)
			DetailTable.lb_Per.setText(TableSystem.three.Percent+"%");
		
		if(DetailTable.CurSel == 4)
			DetailTable.lb_Per.setText(TableSystem.four.Percent+"%");
		
		if(DetailTable.CurSel == 5)
			DetailTable.lb_Per.setText(TableSystem.five.Percent+"%");
		
		if(DetailTable.CurSel == 6)
			DetailTable.lb_Per.setText(TableSystem.six.Percent+"%");
		
		if(DetailTable.CurSel == 7)
			DetailTable.lb_Per.setText(TableSystem.seven.Percent+"%");
		
		if(DetailTable.CurSel == 8)
			DetailTable.lb_Per.setText(TableSystem.eight.Percent+"%");
		
		if(DetailTable.CurSel == 9)
			DetailTable.lb_Per.setText(TableSystem.nine.Percent+"%");

		if(DetailTable.CurSel == 10)
			DetailTable.lb_Per.setText(TableSystem.ten.Percent+"%");
		
		if(DetailTable.CurSel == 11)
			DetailTable.lb_Per.setText(TableSystem.ten_one.Percent+"%");
		
		if(DetailTable.CurSel == 12)
			DetailTable.lb_Per.setText(TableSystem.ten_two.Percent+"%");
		
		if(DetailTable.CurSel == 13)
			DetailTable.lb_Per.setText(TableSystem.ten_three.Percent+"%");
		
		if(DetailTable.CurSel == 14)
			DetailTable.lb_Per.setText(TableSystem.ten_four.Percent+"%");
		
		if(DetailTable.CurSel == 15)
			DetailTable.lb_Per.setText(TableSystem.ten_five.Percent+"%");
		
		
	}
	@Override
	public void run() {
		while (true) {
			StartFrame.lb_Clock.setText(CalenderFrame());
			if(TableSystem.one.Percent != 0)
				TableSystem.one.Percent -= 5;
			else
				{StartFrame.table.setValueAt("청소",0,1);
				DetailTable.tb_CleanUp.setEnabled(true);
				}
			
			if(TableSystem.two.Percent != 0)
				TableSystem.two.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",1,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.three.Percent != 0)
				TableSystem.three.Percent -= 5;
			else
			{	StartFrame.table.setValueAt("청소",2,1);
			DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.four.Percent != 0)
				TableSystem.four.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",3,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.five.Percent != 0)
				TableSystem.five.Percent -= 5;
			else
			{
				DetailTable.tb_CleanUp.setEnabled(true);StartFrame.table.setValueAt("청소",4,1);
			}
			
			if(TableSystem.six.Percent != 0)
				TableSystem.six.Percent -= 5;
			else
			{
				DetailTable.tb_CleanUp.setEnabled(true);
				StartFrame.table.setValueAt("청소",5,1);
			}
			if(TableSystem.seven.Percent != 0)
				TableSystem.seven.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",6,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.eight.Percent != 0)
				TableSystem.eight.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",7,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.nine.Percent != 0)
				TableSystem.nine.Percent -= 5;
			else
			{	StartFrame.table.setValueAt("청소",8,1);
			DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.ten.Percent != 0)
				TableSystem.ten.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",9,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.ten_one.Percent != 0)
				TableSystem.ten_one.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",10,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.ten_two.Percent != 0)
				TableSystem.ten_two.Percent -= 5;
			else
			{
				StartFrame.table.setValueAt("청소",11,1);
				DetailTable.tb_CleanUp.setEnabled(true);
			}
			
			if(TableSystem.ten_three.Percent != 0)
				TableSystem.ten_three.Percent -= 5;
			else
			{		DetailTable.tb_CleanUp.setEnabled(true);
			StartFrame.table.setValueAt("청소",12,1);
			}
			
			if(TableSystem.ten_four.Percent != 0)
				TableSystem.ten_four.Percent -= 5;
			else
			{		DetailTable.tb_CleanUp.setEnabled(true);
			StartFrame.table.setValueAt("청소",13,1);
			}
			
			if(TableSystem.ten_five.Percent != 0)
				TableSystem.ten_five.Percent -= 5;
			else
			{		DetailTable.tb_CleanUp.setEnabled(true);
			StartFrame.table.setValueAt("청소",14,1);
			}
		
			Drink();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}