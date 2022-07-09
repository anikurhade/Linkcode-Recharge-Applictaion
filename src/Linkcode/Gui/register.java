package Linkcode.Gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class register implements ActionListener,ItemListener {
JFrame mainframe;
JPanel formpnl1,heading,formpnl2;
JLabel backgrud;
JButton submit,reset;
JTextField username,name,email,phone,address,pincode,reffralid;
Choice city;
JPasswordField pass;
JRadioButton male,Female;
ButtonGroup gend;

Font f1=new Font("Courier",Font.BOLD,34);

public register() {
	// _----------------------frame Intliase 
	mainframe=new JFrame("New Registeration");
	mainframe.setSize(1366, 768);
	mainframe.setVisible(true);
			//------------------------ Background Image---------------
			ImageIcon img=new ImageIcon("D:/images/registerimg1.jpg");
			backgrud =new JLabel(img);
			mainframe.add(backgrud);
	//-----------------------heading---------
			heading=new JPanel();
			heading.setBackground(new Color(0,0,0,70));
			heading.setBounds(350,40,700,80);
			heading.setLayout(null);
			backgrud.add(heading);
				//-----data---
					JLabel head=new JLabel("Your Data Is Safe With Us");
					head.setFont(f1);
					head.setForeground(Color.white);
					head.setBounds(100,15,600,40);
					heading.add(head);
					
					f1=new Font("Courier",Font.PLAIN,20);
					JLabel data=new JLabel("- So Be Free to Fill All Details !! ");
					data.setFont(f1);
					data.setForeground(Color.white);
					data.setBounds(230,52,600,30);
					heading.add(data);
	 //----------------------------formpn1 1 Left Side ---------------------------
			formpnl1=new JPanel();
			formpnl1.setBackground(new Color(0,0,0,90));
			formpnl1.setBounds(100,150,450,550);
			formpnl1.setLayout(null);
			backgrud.add(formpnl1);
			// adding Form Components
				//-------------name----------------
				f1=new Font("Courier",Font.PLAIN,18);
				JLabel Data=new JLabel("  *    Enter Your Name ");
				Data.setFont(f1);
				Data.setForeground(Color.white);
				Data.setBounds(70,20,400,20);
				formpnl1.add(Data);
				
				
				name=new JTextField(" ");
				name.setBackground(new Color(0,5,30));
				name.setBounds(70,45,300,40);
				name.setFont(f1);
				name.setForeground(Color.white);
				formpnl1.add(name);
				name.addActionListener(this);
				//-------------email----------------
				Data=new JLabel("  *    Enter Your Email ");
				Data.setFont(f1);
				Data.setForeground(Color.white);
				Data.setBounds(70,105,400,20);
				formpnl1.add(Data);
				
				email=new JTextField(" ");
				email.setBackground(new Color(0,5,30));
				email.setBounds(70,130,300,40);
				email.setFont(f1);
				email.setForeground(Color.white);
				formpnl1.add(email);
				email.addActionListener(this);
				//-----------Addresss---
				Data=new JLabel("  *    Enter Your Address ");
				Data.setFont(f1);
				Data.setForeground(Color.white);
				Data.setBounds(70,185,400,20);
				formpnl1.add(Data);
				
				address=new JTextField(" ");
				address.setBackground(new Color(0,5,30));
				address.setBounds(70,210,300,40);
				address.setFont(f1);
				address.setForeground(Color.white);
				formpnl1.add(address);
				address.addActionListener(this);
				//Select You Gender
				Data=new JLabel("  *    Select Your Gender ");
				Data.setFont(f1);
				Data.setForeground(Color.white);
				Data.setBounds(70,265,400,20);
				formpnl1.add(Data);
				
				
				male=new JRadioButton("Male");
				male.setBackground(new Color(10,5,30));
				male.setForeground(Color.white);
				male.setFont(f1);
				male.setBounds(40,290,150,40);
				formpnl1.add(male);
				male.addActionListener(this);
				
				Female=new JRadioButton("Female");
				Female.setForeground(Color.white);
				Female.setBackground(new Color(10,5,30));
				Female.setFont(f1);
				Female.setBounds(240,290,150,40);
				formpnl1.add(Female);
				Female.addActionListener(this);
				
				gend=new ButtonGroup();
				gend.add(male);
				gend.add(Female);
			   
				// city
				Data=new JLabel("  *    Select Your City ");
				Data.setFont(f1);
				Data.setForeground(Color.white);
				Data.setBounds(70,340,400,20);
				formpnl1.add(Data);
				
				city=new Choice();
				city.add("Delhi");
				city.add("Mumbai");
				city.add("Chennai");
				city.add("Pune");
				city.add("AhmadNagar");
				city.add("Benguluru");
				
				city.setFont(f1);
				city.setBackground(new Color(0,5,30));
				city.setBounds(70,370,300,40);
				city.setForeground(Color.white);
				formpnl1.add(city);
				city.addItemListener(this);
				
				//refreal Id
				Data=new JLabel("  *   Enter Refferal Id  ");
				Data.setFont(f1);
				Data.setForeground(Color.white);
				Data.setBounds(70,420,400,20);
				formpnl1.add(Data);
				
				reffralid=new JTextField(" ");
				reffralid.setBackground(new Color(0,5,30));
				reffralid.setBounds(70,450,300,40);
				reffralid.setFont(f1);
				reffralid.setForeground(Color.white);
				formpnl1.add(reffralid);
				reffralid.addActionListener(this);
				
				f1=new Font("Courier",Font.BOLD,14);
				Data=new JLabel("     If You Have Refferal Id You Get Instant Rs.1001 ");
				Data.setFont(f1);
				Data.setForeground(Color.orange);
				Data.setBounds(00,500,450,20);
				formpnl1.add(Data);	
				Data=new JLabel("                Additional Balance  ");
				Data.setFont(f1);
				Data.setForeground(Color.orange);
				Data.setBounds(00,520,450,20);
				formpnl1.add(Data);	
				
	 //----------------------------formpn1 2 right Side ---------------------------
				f1=new Font("Courier",Font.PLAIN,20);
				
			formpnl2=new JPanel();
			formpnl2.setBackground(new Color(0,0,0,90));
			formpnl2.setBounds(800,150,450,550);
			formpnl2.setLayout(null);
			backgrud.add(formpnl2);
			//User Id
			Data=new JLabel(" * Enter Your Choice UserName  ");
			Data.setFont(f1);
			Data.setForeground(Color.white);
			Data.setBounds(50,20,400,20);
			formpnl2.add(Data);
			
			username=new JTextField(" ");
			username.setBackground(new Color(0,5,30));
			username.setBounds(70,45,300,40);
			username.setFont(f1);
			username.setForeground(Color.white);
			formpnl2.add(username);
			username.addActionListener(this);
			//Password
			Data=new JLabel(" * Enter Your Choice Password  ");
			Data.setFont(f1);
			Data.setForeground(Color.white);
			Data.setBounds(50,95,400,20);
			formpnl2.add(Data);
			
			pass=new JPasswordField("");
			pass.setBackground(new Color(0,5,30));
			pass.setBounds(70,120,300,40);
			pass.setFont(f1);
			pass.setForeground(Color.white);
			formpnl2.add(pass);
			pass.addActionListener(this);
			
			
			//submit 
			
			submit=new JButton("Submit");
			submit.setBackground(new Color(0,5,20));
			submit.setForeground(Color.white);
			submit.setFont(f1);
			submit.setBounds(70,200,150,40);
			formpnl2.add(submit);
			submit.addActionListener(this);
			
			reset=new JButton("Reset");
			reset.setBackground(new Color(0,5,20));
			reset.setForeground(Color.white);
			reset.setFont(f1);
			reset.setBounds(270,200,150,40);
			formpnl2.add(reset);
			
			reset.addActionListener(this);
			
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==pass)
	{
		
		char[] p=pass.getPassword();
		
		System.out.println(new String(p));
	} 
	if(e.getSource()==submit)
	{
		if(name.getText().equals("") ||email.getText().equals("") ||address.getText().equals("") ||username.getText().equals("") || pass.getText().equals("") )
		{
			JOptionPane.showMessageDialog(mainframe, "Fill Details Please"); 
		
		}
		else
		{//JFrame dailoguebox=new JFrame("Registration Successful");
		JOptionPane.showMessageDialog(mainframe, "Registration Successful"); 
		JOptionPane.showMessageDialog(mainframe, "Do Login To Enjoy Our Services");
		User u1=new User();
		mainframe.dispose();
		}
	}
	if(e.getSource()==reset)
	{
		name.setText(" ");
		email.setText("");
		address.setText("");
		username.setText("");
		reffralid.setText("");
		pass.setText("");
		
	}
		
	
	
}

@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	
}
}
