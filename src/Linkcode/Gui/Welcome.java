package Linkcode.Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class Welcome implements ActionListener {
JFrame mainframe;
JLabel Backgroud,greet;
JPanel heading,imgpanel,textpnl;
JButton enter;
Font f1=new Font("Courier",Font.BOLD,40);
public Welcome() {
	//frame Intialise
	mainframe=new JFrame("Linkcode Services");
	mainframe.setSize(1366, 768);
	mainframe.setVisible(true);
	
	//background Image
	ImageIcon img=new ImageIcon("D:/images/welcomepgeimg1.jpg");
	Backgroud=new JLabel(img);
	mainframe.add(Backgroud);
	
	//adding Panel --------------------------heading------------------------
	heading=new JPanel();
	heading.setBackground(new Color(255,255,255,40));
	heading.setBounds(283,80,883,100);
	Backgroud.add(heading);
		//panel Componets
			//company name
		JLabel companyname=new JLabel("LinKcode Services");
		companyname.setForeground(Color.white );
		companyname.setFont(f1);
		companyname.setBounds(483,170,300,50);
		heading.add(companyname);
			//company promo
		JLabel companypromo=new JLabel("---------------------- The Way Towards Efficiency ----------------------");
		companypromo.setForeground(Color.white);
		f1=new Font("Courier",Font.HANGING_BASELINE,20);
		companypromo.setFont(f1);
		heading.add(companypromo);
		
	//panel 2------------------------------------second Image ------------------------------
	imgpanel=new JPanel();
	imgpanel.setBackground(new Color(0,0,0,0));
	imgpanel.setBounds(700,300,600,400);
	Backgroud.add(imgpanel);
	  // adding Image 
			img=new ImageIcon("D:/images/welcomepgeimg2.jpg");
			Image temp=img.getImage();
			Image finImage=temp.getScaledInstance(600,400, Image.SCALE_SMOOTH);
			img=new ImageIcon(finImage);
			JLabel serviimg=new JLabel(img);
			imgpanel.add(serviimg);
	//=====================================Welcome Speech =======================================
	textpnl=new JPanel();
	textpnl.setBackground(new Color(255, 255, 255,20));
	textpnl.setBounds(70,250,530,470);
	textpnl.setLayout(null);
	Backgroud.add(textpnl);
		// text
				JLabel gret=new JLabel("Hello !! Bonjour !! Namaste !!");
				f1=new Font("Courier",Font.PLAIN,28);
				gret.setForeground(Color.white);
				gret.setBounds(20,50,800,30);
				gret.setFont(f1);
				textpnl.add(gret);
				
				JLabel detail=new JLabel("We LinKcode Services Welcomes You Our ");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setFont(f1);
				detail.setBounds(40,100,460,20);
				textpnl.add(detail);
				
				detail=new JLabel("Application. We Provide The Best Recharge  ");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,125,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel("Services Than Any Application So Our Motto Is");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,146,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel("      \"The Way Towards Efficiency\" ");
				f1=new Font("Courier",Font.BOLD,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,176,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel("In Similar Way We Focus on Customers ");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setBounds(40,216,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel("Satisfaction And Efficient Working .We  ");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,236,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel("Provide The Best Userfriendly Services And ");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,256,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel("Secured Transactions.");
				f1=new Font("Courier",Font.PLAIN,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,276,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				
				detail=new JLabel(" We Want To Make Our Services Helpful To You.");
				f1=new Font("Courier",Font.BOLD,17);
				detail.setForeground(Color.white);
				detail.setBounds(10,306,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
				detail=new JLabel(" To Try Our efficient Services Click Down.. ");
				f1=new Font("Courier",Font.BOLD,17);
				detail.setForeground(Color.white);
				detail.setBounds(30,326,460,20);
				detail.setFont(f1);
				textpnl.add(detail);
				
		//button Adding
				enter=new JButton(" To Services ");
				enter.setForeground(Color.white);
				enter.setBackground(new Color(0,0,0,20));
				f1=new Font("Courier",Font.BOLD,17);
				enter.setFont(f1);
				enter.setBounds(140,356,250,50);
				textpnl.add(enter);
				
		//adding Action To BUtton 
				enter.addActionListener(this);
				
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==enter)
	{
		User u1=new User();
		mainframe.dispose();
	}
	
}
}
