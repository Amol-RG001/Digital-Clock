import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockFrame extends JFrame{
	 //declare variable
	 Calendar calendar;
	 SimpleDateFormat timeFormat;
	 SimpleDateFormat dayFormat;
	 SimpleDateFormat dateFormat;
	 JLabel timeLabel;
	 JLabel dayLabel;
	 JLabel dateLabel;
	 String time;
	 String day;
	 String date;
	 //constructor
	 ClockFrame(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setTitle("Digital Clock");
	  this.setLayout(new FlowLayout());
	  this.setSize(350,225);
	  this.setResizable(false);
	  
	  timeFormat = new SimpleDateFormat("hh:mm:ss a");
	  dayFormat = new SimpleDateFormat("EEEE");
	  dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
	  
	  timeLabel = new JLabel();//create JLabel
	  timeLabel.setFont(new Font("Verdana",Font.PLAIN,45));
	  timeLabel.setForeground(Color.gray);
	  timeLabel.setBackground(Color.black);
	  timeLabel.setOpaque(true);
	  
	  dayLabel = new JLabel();
	  dayLabel.setFont(new Font("Arial Black",Font.PLAIN,40));
	  
	  dateLabel = new JLabel();
	  dateLabel.setFont(new Font("Arial",Font.PLAIN,35));
	  
	  
	  this.add(timeLabel);
	  this.add(dayLabel);
	  this.add(dateLabel);
	  this.setVisible(true);
	  //create method
	  setTime();
	 }
	 
	 public void setTime() {
		 
	  while(true) {
	  //get time from calender	  
	  time = timeFormat.format(Calendar.getInstance().getTime());
	  //set time into timeLabel
	  timeLabel.setText(time);
	  
	  //get day from calender		  
	  day = dayFormat.format(Calendar.getInstance().getTime());
	  //set day into dayLabel
	  dayLabel.setText(day);
	  
	  //get date from calender	  
	  date = dateFormat.format(Calendar.getInstance().getTime());
	  //set date into dateLabel
	  dateLabel.setText(date);
	  
	
 	  }
   }
}

	
