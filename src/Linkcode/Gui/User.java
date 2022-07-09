package Linkcode.Gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

import Linkcode.Interface.mouseAdapt;

public class User implements mouseAdapt,ActionListener {
JFrame mainframe;
JPanel westimgpnl,centralpnl;
JLabel backgrund;
JButton register,login;
Font f1=new Font("Courier",Font.BOLD,24);

public User() {
	//=--------------------------Frame Intialise ---------------
	mainframe=new JFrame("User Select");
	mainframe.setSize(1366, 768);
	mainframe.setVisible(true);
			//-------------------Background Image------------
		ImageIcon img=new ImageIcon("D:/images/userpageimg1.jpg");
		backgrund=new JLabel(img);
		mainframe.add(backgrund);
	//----------------------panel1 west Side Adding----------------
	 westimgpnl=new JPanel();
	 westimgpnl.setBackground(new Color(0,0,0,30));
	 westimgpnl.setBounds(150,100,600,568);
	 westimgpnl.setLayout(null);
	 backgrund.add(westimgpnl);
	 		//adding image to 
	 		img=new ImageIcon("D:/images/userpageimg2.jpg");
	 		Image temp=img.getImage();
	 		Image fin=temp.getScaledInstance(680, 568, Image.SCALE_SMOOTH);
	 		img=new ImageIcon(fin);
	 		JLabel imgad=new JLabel(img);
	 		imgad.setBounds(0,0,600,568);
	 		westimgpnl.add(imgad);
	 		
	 		
	//-----------------------panel2 centralpnl---------
	 centralpnl=new JPanel();
	 centralpnl.setBackground(Color.white );
	 centralpnl.setBounds(750,100,500,568);
	 centralpnl.setLayout(null);
	 backgrund.add(centralpnl);
	 	//heading
	 	JLabel heading=new JLabel("  EFFicieny Needs To Boosted !!");
	 	heading.setFont(f1);
	 	heading.setBounds(30,30,500,30);
	 	centralpnl.add(heading);
	 	
	 	// User Selction
	 	JLabel data;
	 	f1=new Font("Courier",Font.PLAIN,18);
	 	
	    data=new JLabel("To Use Our Fully Efficient Services You ");
	    data.setFont(f1);
	    data.setBounds(20,95,500,20);
	    centralpnl.add(data);
	    
	    data=new JLabel("       Need To Have Fast Sign-Up !! ");
	    data.setFont(f1);
	    data.setBounds(20,120,500,20);
	    centralpnl.add(data);
	    
	    //--------------------------------Register
	    f1=new Font("Courier",Font.BOLD,18);
	 	data=new JLabel("            I Am A New User !! ");
	    data.setFont(f1);
	    data.setBounds(20,200,500,20);
	    centralpnl.add(data);
	    
	    f1=new Font("Courier",Font.PLAIN,18);
	    data=new JLabel("  You Need To Register If You Are New !!! ");
	    data.setFont(f1);
	    data.setBounds(20,220,500,20);
	    centralpnl.add(data);
	 	
	    	//buttons
	    register=new JButton("Register Here !");
	    register.setBackground(new Color(255,255,255));
	    register.setBounds(140,260,200,50);
	    centralpnl.add(register);
	    //------------------------------------------------------ login
	    	//
	    f1=new Font("Courier",Font.BOLD,18);
	 	data=new JLabel("            I Am Already A User !! ");
	    data.setFont(f1);
	    data.setBounds(20,330,500,20);
	    centralpnl.add(data);
	    
	    f1=new Font("Courier",Font.PLAIN,18);
	    data=new JLabel("  You Need To Login Click On Login !!! ");
	    data.setFont(f1);
	    data.setBounds(20,350,500,20);
	    centralpnl.add(data);
	 	
	    	//buttons
	    login=new JButton("Login Here !");
	    login.setBackground(new Color(255,255,255));
	    login.setBounds(140,400,200,50);
	    centralpnl.add(login);
	  //action Listener
	   register.addActionListener(this); 
	   register.addMouseListener(this);
	    

	   login.addActionListener(this); 
	   login.addMouseListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==register)
	{
		register r1=new register();
		mainframe.dispose();
	    
	}
	if(e.getSource()==login)
	{
		
		login l1=new login();
		mainframe.dispose();
	}
	
}
@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseAdapt.super.mouseClicked(e);
		if(e.getSource()==register)
		{
			register.setBackground(Color.lightGray);
			login.setBackground(new Color(255,255,255));
		    
		}
		if(e.getSource()==login)
		{
			
			register.setBackground(new Color(255,255,255));
			login.setBackground(Color.lightGray);
		}
		
	}
@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseAdapt.super.mouseEntered(e);
		if(e.getSource()==register)
		{
			register.setBackground(Color.pink);
			login.setBackground(new Color(255,255,255));
		    
		}
		if(e.getSource()==login)
		{
			
			register.setBackground(new Color(255,255,255));
			login.setBackground(Color.pink);
		}
	}
@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseAdapt.super.mouseExited(e);
		if(e.getSource()==register)
		{
			register.setBackground(Color.white);
			login.setBackground(new Color(255,255,255));
		    
		}
		if(e.getSource()==login)
		{
			
			register.setBackground(new Color(255,255,255));
			login.setBackground(Color.white);
		}
	}
}
