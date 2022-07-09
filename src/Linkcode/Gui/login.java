package Linkcode.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class login implements ActionListener{
	JFrame mainframe;
	JLabel Backgroud,greet;
	JTextField Username;
	JPasswordField pass;
	JPanel login;
	 static int Count=0;
	JButton signin,reset,exit;
	Font f1=new Font("Courier",Font.BOLD,20);
	public login() {
		//frame Intialise
		mainframe=new JFrame("Login Menu");
		mainframe.setSize(1366, 768);
		mainframe.setVisible(true);
		
		//background Image
		ImageIcon img=new ImageIcon("D:/images/loginpage2.jpg"); 
		Backgroud=new JLabel(img);
		mainframe.add(Backgroud);
		//---------login panel----------------
		
		login=new JPanel();
		login.setBackground(new Color(0,0,0,80));
		login.setBounds(450,170,480,470);
		login.setLayout(null);
		Backgroud.add(login);
		//adding Panel --------------------------heading------------------------
	  greet=new JLabel("Login To enjoy The Best Services!!");
	  greet.setFont(f1);
	  greet.setForeground(Color.white);
	  greet.setBounds(50,70,430,30);
	  login.add(greet);
	  //------------------------------Username And Password------------
	    
	  JLabel Data=new JLabel(" * UserName ");
		Data.setFont(f1);
		Data.setForeground(Color.white);
		Data.setBounds(10,150,200,20);
		login.add(Data);
		Username=new JTextField("");
		Username.setBackground(new Color(0,5,30));
		Username.setFont(f1);
		Username.setBounds(230,150,200,40);
		Username.setForeground(Color.white);
		login.add(Username);
		Username.addActionListener(this);
		//Password
		Data=new JLabel(" * Password  ");
		Data.setFont(f1);
		Data.setForeground(Color.white);
		Data.setBounds(10,235,200,20);
		login.add(Data);
		
		pass=new JPasswordField("");
		pass.setBackground(new Color(0,5,30));
		pass.setBounds(230,235,200,40);
		pass.setFont(f1);
		pass.setForeground(Color.white);
		login.add(pass);
		pass.addActionListener(this);
		
		//-------------------buttons---------------
		reset= new JButton("Reset");
		reset.setBackground(new Color(0,5,20));
		reset.setForeground(Color.white);
		reset.setFont(f1);
		reset.setBounds(70,340,150,40);
		login.add(reset);
		
		exit= new JButton("Exit");
		exit.setBackground(new Color(0,5,20));
		exit.setForeground(Color.white);
		exit.setFont(f1);
		exit.setBounds(270,340,150,40);
		login.add(exit);
		
		
		signin= new JButton("Sigh In");
		signin.setBackground(new Color(0,5,20));
		signin.setForeground(Color.white);
		signin.setFont(f1);
		signin.setBounds(170,390,150,40);
		login.add(signin);

		
		reset.addActionListener(this);
		exit.addActionListener(this);
		signin.addActionListener(this);
	
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit)
		{
			int a=JOptionPane.showConfirmDialog(mainframe, "Are You Sure??");
			if(a==0)
			{
				System.exit(0);
				
			}
			
			
		}
		if(e.getSource()==reset)
		{
			Username.setText("");
			pass.setText("");
		}
		if(e.getSource()==signin)
		{
			String Uid,UPass;
			Uid=Username.getText();
			char []p=pass.getPassword();
			UPass=new String(p);
			
			if(Uid.equals("Ani2002"))
			{
				if(UPass.equals("Ani@2002"))
				{
					mainframe.dispose();
					Dashboard d=new Dashboard();
					JOptionPane.showMessageDialog(mainframe,"Login Successfully Done ");
					
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(mainframe,"Creditial Incorrect ");
				
			}
		
			
		}
		
	}
	
}
