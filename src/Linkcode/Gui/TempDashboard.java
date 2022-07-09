package Linkcode.Gui;

import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.NameParser;
import javax.swing.*;

public class TempDashboard  implements ActionListener {
	JFrame mainframe;
	JPanel Central,heading,menu,recharge,abou,addbal,thankyou,mycrt,update;
	JPanel CartCentr,Cempty;//cart
	JLabel Backgroud,name,availbal,Centrlbg,cempty;
	JLabel namelnum,lnum,namelprov,lprov,namelpn,lpn;
	static int Count=0;
	JTextField bal,mobno,plan;//recharge
	JTextField amount,account;//addbal
	Choice provider,bank;//
	JRadioButton plan1,plan2,plan3,plan4,plan5;//recharge
	JButton Selctplan,rechargnow,addCart;//recharge
	JButton addamount,exit;//addbaln
	JButton makerecharg,carDelt;//cart
	JButton mobileRecharge,Addbal,logout,Account,rechar,mycart,updates;
	Font f1=new Font("Courier",Font.BOLD,40);
	private int Bal=1000;
	String currbal,cartnum,cartprovider,cartplan;
	CardLayout c;
	ButtonGroup pla;
	Image temp,fin;
	ImageIcon img;
public int getBal() {
		return Bal;
	}


	public void setBal(int bal) {
		Bal = bal;
	}


public TempDashboard() {
	// TODO Auto-generated constructor stub

	//frame Intialise
	mainframe=new JFrame("Service DashBoard");
	mainframe.setSize(1366, 768);
	mainframe.setVisible(true);
	
	//background Image
    img=new ImageIcon("D:/images/loginpage2.jpg"); 
	Backgroud=new JLabel(img);
	mainframe.add(Backgroud);
	//-------------------------------Heading---------------------
	heading=new JPanel();
	heading.setBackground(new Color(255,255,255,40));
	heading.setBounds(283,60,883,100);
	Backgroud.add(heading);
		//panel Componets
			//company name
		JLabel companyname=new JLabel("LinKcode Services");
		companyname.setForeground(Color.white );
		companyname.setFont(f1);
		companyname.setBounds(483,170,300,70);
		heading.add(companyname);
			//company promo
		JLabel companypromo=new JLabel("---------------------- The Way Towards Efficiency ----------------------");
		companypromo.setForeground(Color.white);
		f1=new Font("Courier",Font.HANGING_BASELINE,20);
		companypromo.setFont(f1);
		heading.add(companypromo);
		// -----------------------Balance--------------
		f1=new Font("Courier",Font.PLAIN,18);
		availbal=new JLabel("Your Wallet Balance :- ");
		availbal.setFont(f1);
		availbal.setForeground(Color.white);
		availbal.setBounds(770,170,350,30);
		Backgroud.add(availbal);
		
		bal=new JTextField("");
		currbal=Integer.toString(getBal());
		bal.setText(currbal);
		bal.setBackground(new Color(0,5,30));
		bal.setForeground(Color.white);
		bal.setFont(f1);
		bal.setBounds(1030,170,150,30);
		Backgroud.add(bal);
		
	//---------------------menu--------------
	menu=new JPanel();
	menu.setBackground(new Color(255,255,255,30));
	menu.setLayout(null);
	menu.setBounds(20,230,180,450);
	Backgroud.add(menu);
		 //meune starts
	 f1=new Font("Courier",Font.PLAIN,20);	
		name=new JLabel("----Menu----");
		name.setFont(f1);
		name.setForeground(Color.white);
		name.setBounds(20,20,150,25);
		menu.add(name);
		
		f1=new Font("Courier",Font.PLAIN,15);
		mobileRecharge=new JButton("Recharge Now");
		mobileRecharge.setBackground(new Color(0,5,30));
		mobileRecharge.setForeground(Color.white);
		mobileRecharge.setFont(f1);
		mobileRecharge.setBounds(10,65,160,50);
		menu.add(mobileRecharge);
		
		Addbal=new JButton("Add Balance");
		Addbal.setBackground(new Color(0,5,30));
		Addbal.setForeground(Color.white);
		Addbal.setFont(f1);
		Addbal.setBounds(10,125,160,50);
		menu.add(Addbal);
		
		mycart=new JButton("My Cart");
		mycart.setBackground(new Color(0,5,30));
		mycart.setForeground(Color.white);
		mycart.setFont(f1);
		mycart.setBounds(10,185,160,50);
		menu.add(mycart);
		
		Account=new JButton("My Profile");
		Account.setBackground(new Color(0,5,30));
		Account.setForeground(Color.white);
		Account.setFont(f1);
		Account.setBounds(10,245,160,50);
		menu.add(Account);
		
		updates=new JButton("Updates");
		updates.setBackground(new Color(0,5,30));
		updates.setForeground(Color.white);
		updates.setFont(f1);
		updates.setBounds(10,305,160,50);
		menu.add(updates);
		
		logout=new JButton("Logout");
		logout.setBackground(new Color(0,5,30));
		logout.setForeground(Color.white);
		logout.setFont(f1);
		logout.setBounds(10,365,160,50);
		menu.add(logout);
		
		//===========--------------------Central Panel---------------
					Central=new JPanel();
					Central.setBackground(new Color(255,255,255,30));
					//c=new CardLayout();
					Central.setLayout(null);
					Central.setBounds(250,220,980,480);
					Backgroud.add(Central);
					
					img=new ImageIcon("D:/java/NAture/da.jpg");
					temp=img.getImage();
					fin=temp.getScaledInstance(980, 480, 0);
					img=new ImageIcon(fin);
					JLabel Centrlbg=new JLabel(img);
					Centrlbg.setBounds(0,0,980,480);
					Central.add(Centrlbg);
					
		//====================================Recharge Panel==================================
									recharge=new JPanel();
									recharge.setBackground(new Color(255,255,255,30));
									recharge.setLayout(null);
									recharge.setBounds(250,220,980,480);
									Backgroud.add(recharge);
									
									
									img=new ImageIcon("D:/java/NAture/recha.jpg");
									temp=img.getImage();
									fin=temp.getScaledInstance(980, 480, 0);
									img=new ImageIcon(fin);
									Centrlbg=new JLabel(img);
									Centrlbg.setBounds(0,0,980,480);
									recharge.add(Centrlbg);
							//-----------------------Heading In Recharge
									heading=new JPanel();
									heading.setBackground(new Color(0,0,0,40));
									heading.setBounds(30,20,500,60);
									heading.setLayout(null);
									Centrlbg.add(heading);
									
									f1=new Font("Courier",Font.BOLD,25);
									name=new JLabel("Recharge With Self Happiness!! ");
									name.setForeground(Color.black);
									name.setFont(f1);
									name.setBounds(20,10,500,30);
									heading.add(name);
									
									f1=new Font("Courier",Font.BOLD,17);
									name=new JLabel("Get Bonus And CashBack On Recharge Above 599 Rs ");
									name.setForeground(Color.black);
									name.setFont(f1);
									name.setBounds(40,80,600,20);
									Centrlbg.add(name);
									
									f1=new Font("Courier",Font.PLAIN,19);
									name=new JLabel("----------------------------------------------- ");
									name.setForeground(Color.black);
									name.setFont(f1);
									name.setBounds(20,100,550,25);
									Centrlbg.add(name);
							
					//============Recharge Number And Value Accepting==================
						//-------------------------mobnum----------------------
								f1=new Font("Courier",Font.BOLD,20);
								name=new JLabel("Moblie Number To Be Recharged ");
								name.setForeground(Color.black);
								name.setFont(f1);
								name.setBounds(20,150,500,25);
								Centrlbg.add(name);
								
								mobno=new JTextField();
								mobno.setBackground(new Color(0,10,30));
								mobno.setFont(f1);
								mobno.setForeground(Color.white);
								mobno.setBounds(400,140,200,40);
								Centrlbg.add(mobno);
								
						//---------------------------provider----------------
								f1=new Font("Courier",Font.BOLD,20);
								name=new JLabel("Operator/Service Provider ");
								name.setForeground(Color.black);
								name.setFont(f1);
								name.setBounds(20,220,380,25);
								Centrlbg.add(name);
								
								provider=new Choice();
								provider.add("Airtel");
								provider.add("Jio");
								provider.add("Voda-Idea");
								provider.add("Aircel");
								provider.add("BSNL");
								
								provider.setBackground(new Color(0,0,30));
								provider.setFont(f1);
								provider.setForeground(Color.white);
								provider.setBounds(400,220,200,40);
								Centrlbg.add(provider);
								
						//----------------------------Selectrd Plans----				
								f1=new Font("Courier",Font.BOLD,20);
								name=new JLabel(" Selected Plan ");
								name.setForeground(Color.black);
								name.setFont(f1);
								name.setBounds(10,300,200,25);
								Centrlbg.add(name);
								
								plan=new JTextField();
								plan.setBackground(new Color(0,10,30));
								plan.setFont(f1);
								plan.setEditable(false);
								plan.setForeground(Color.white);
								plan.setBounds(230,290,200,40);
								Centrlbg.add(plan);
									//================================plan panel========================== 
								
											JPanel pln=new JPanel();
											pln.setBackground(new Color(0,0,0,140));
											pln.setLayout(null);
											pln.setBounds(650,20,300,440);
											Centrlbg.add(pln);
											
								//-----------------plan Heading--------------	
											f1=new Font("Courier",Font.BOLD,22);
											name=new JLabel("    Plan's    ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(40,20,450,25);
											pln.add(name);
											
											f1=new Font("Courier",Font.BOLD,17);
											name=new JLabel(" --------------------------------   ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(0,40,380,25);
											pln.add(name);
											
											
									//---------------------plan 1
											f1=new Font("Courier",Font.PLAIN,18);
											plan1=new JRadioButton("Rs.4999 For 365 Days");
											plan1.setBackground(new Color(0,0,30));
											plan1.setForeground(Color.white);
											plan1.setFont(f1);
											plan1.setBounds(20,70,250,30);
											pln.add(plan1);
											
											f1=new Font("Courier",Font.BOLD,15);
											name=new JLabel("Unlimted Data,Calls,SMS ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(30,105,480,20);
											pln.add(name);
											pla=new ButtonGroup();
									//----------------plan 2
											f1=new Font("Courier",Font.PLAIN,18);
											plan2=new JRadioButton("Rs.3999 For 185 Days");
											plan2.setBackground(new Color(0,0,30));
											plan2.setForeground(Color.white);
											plan2.setFont(f1);
											plan2.setBounds(20,135,250,30);
											pln.add(plan2);
											
											f1=new Font("Courier",Font.BOLD,15);
											name=new JLabel("Unlimted Data,Calls,SMS ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(30,165,480,20);
											pln.add(name);
											pla=new ButtonGroup();
											
									//--------------------plan 3
											f1=new Font("Courier",Font.PLAIN,18);
											plan3=new JRadioButton("Rs.2599 For 90 Days");
											plan3.setBackground(new Color(0,0,30));
											plan3.setForeground(Color.white);
											plan3.setFont(f1);
											plan3.setBounds(20,205,250,30);
											pln.add(plan3);
											
											f1=new Font("Courier",Font.BOLD,15);
											name=new JLabel("Unlimted Data,Calls,SMS ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(30,240,480,20);
											pln.add(name);
											pla=new ButtonGroup();
											
									 //------------------plan 4
											f1=new Font("Courier",Font.PLAIN,18);
											plan4=new JRadioButton("Rs.1099 For 60 Days");
											plan4.setBackground(new Color(0,0,30));
											plan4.setForeground(Color.white);
											plan4.setFont(f1);
											plan4.setBounds(20,270,250,30);
											pln.add(plan4);
											
											f1=new Font("Courier",Font.BOLD,14);
											name=new JLabel("2GB Data Daily,Unlimited Calls,SMS");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(10,300,480,20);
											pln.add(name);
											pla=new ButtonGroup();
											
									//---------------plan 5
											f1=new Font("Courier",Font.PLAIN,18);
											plan5=new JRadioButton("Rs.599 For 30 Days");
											plan5.setBackground(new Color(0,0,30));
											plan5.setForeground(Color.white);
											plan5.setFont(f1);
											plan5.setBounds(20,330,250,30);
											pln.add(plan5);
											
											f1=new Font("Courier",Font.BOLD,14);
											name=new JLabel("1GB Data Daily,Unlimited Calls,SMS");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(10,370,480,20);
											pln.add(name);
											
											pla=new ButtonGroup();
											pla.add(plan1);
											pla.add(plan2);
											pla.add(plan3);
											pla.add(plan4);
											pla.add(plan5);
											
									//----------------------Select Button----------
											Selctplan=new JButton(" Select Plan ");
											Selctplan.setForeground(Color.white);
											Selctplan.setBackground(new Color(0,5,30));
											f1=new Font("Courier",Font.BOLD,17);
											Selctplan.setFont(f1);
											Selctplan.setBounds(60,400,180,30);
											pln.add(Selctplan);
											
									//---------- Selct plan Action Listener
											
											Selctplan.addActionListener(this);
					    
					//------------------Recharge Now Button 
												
							rechar=new JButton("Recharge Now");
							rechar.setBackground(new Color(0,05,30));
							f1=new Font("Courier",Font.BOLD,20);
							rechar.setForeground(Color.white);
							rechar.setFont(f1);
							rechar.setBounds(40,380,200,40);
							Centrlbg.add(rechar);
							rechar.addActionListener(this);
							
							addCart=new JButton("Add To Cart ");
							addCart.setBackground(new Color(0,05,30));
							f1=new Font("Courier",Font.BOLD,20);
							addCart.setForeground(Color.white);
							addCart.setFont(f1);
							addCart.setBounds(340,380,200,40);
							Centrlbg.add(addCart);
							addCart.addActionListener(this);
			
	//====================================Add Amount Panel==================================
										addbal=new JPanel();
										addbal.setBackground(new Color(255,255,255,30));
										addbal.setLayout(null);
										addbal.setBounds(250,220,980,480);
										Backgroud.add(addbal);
										
										img=new ImageIcon("D:/java/NAture/add2.jpg");
										temp=img.getImage();
										fin=temp.getScaledInstance(980, 480, 0);
										img=new ImageIcon(fin);
										Centrlbg=new JLabel(img);
										Centrlbg.setBounds(0,0,980,480);
										addbal.add(Centrlbg);
									//-----------------------Heading In Amount
										heading=new JPanel();
										heading.setBackground(new Color(255,255,255,40));
										heading.setBounds(30,20,500,60);
										heading.setLayout(null);
										Centrlbg.add(heading);
										
										f1=new Font("Courier",Font.BOLD,25);
										name=new JLabel("Add Quick Cash In Wallet!! ");
										name.setForeground(Color.white);
										name.setFont(f1);
										name.setBounds(40,20,500,30);
										heading.add(name);
										
										f1=new Font("Courier",Font.BOLD,17);
										name=new JLabel("Avoid Banking Recharge Frauds !!! ");
										name.setForeground(Color.white);
										name.setFont(f1);
										name.setBounds(80,80,600,20);
										Centrlbg.add(name);
										
										f1=new Font("Courier",Font.PLAIN,19);
										name=new JLabel("----------------------------------------------- ");
										name.setForeground(Color.black);
										name.setFont(f1);
										name.setBounds(20,100,550,25);
										Centrlbg.add(name);
									
								//============Amount  And Details Accepting==================
									
									//------------------------Amount----------------------
											f1=new Font("Courier",Font.BOLD,20);
											name=new JLabel("Amount To Be Added ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(20,150,500,25);
											Centrlbg.add(name);
											
											amount=new JTextField();
											amount.setBackground(new Color(0,10,30));
											amount.setFont(f1);
											amount.setForeground(Color.white);
											amount.setBounds(300,140,200,40);
											Centrlbg.add(amount);
											
										//----------------------------Acount Number/Upi----				
											f1=new Font("Courier",Font.BOLD,20);
											name=new JLabel(" Account Number / UPI Address ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(10,220,400,25);
											Centrlbg.add(name);
											
											account=new JTextField();
											account.setBackground(new Color(0,10,30));
											account.setFont(f1);
											account.setForeground(Color.white);
											account.setBounds(430,210,200,40);
											Centrlbg.add(account);
												
									//---------------------------Bank----------------
											f1=new Font("Courier",Font.BOLD,20);
											name=new JLabel("Bank Name :- ");
											name.setForeground(Color.white);
											name.setFont(f1);
											name.setBounds(20,290,180,25);
											Centrlbg.add(name);
											
											bank=new Choice();
											bank.add("State Bank Of India");
											bank.add("Bank OF Maharstra");
											bank.add("icici Bank");
											bank.add("HDFC Bank");
											bank.add("Punjab National Bank");
											
											bank.setBackground(new Color(0,0,30));
											bank.setFont(f1);
											bank.setForeground(Color.white);
											bank.setBounds(200,290,400,40);
											Centrlbg.add(bank);
											
									
									//------------------Add Amount  Button 
														
									addamount=new JButton("Add Cash To Wallet");
									addamount.setBackground(new Color(0,05,30));
									f1=new Font("Courier",Font.BOLD,18);
									addamount.setForeground(Color.white);
									addamount.setFont(f1);
									addamount.setBounds(40,380,240,40);
									Centrlbg.add(addamount);
									addamount.addActionListener(this);
									
									exit=new JButton("Exit ");
									exit.setBackground(new Color(0,05,30));
									f1=new Font("Courier",Font.BOLD,20);
									exit.setForeground(Color.white);
									exit.setFont(f1);
									exit.setBounds(340,380,200,40);
									Centrlbg.add(exit);
				
		//====================================Mycart Panel==================================
									mycrt=new JPanel();
									mycrt.setBackground(new Color(255,255,255,30));
									mycrt.setLayout(null);
									mycrt.setBounds(250,220,980,480);
									Backgroud.add(mycrt);
									
									
									img=new ImageIcon("D:/java/NAture/cart2.jpg");
									temp=img.getImage();
									fin=temp.getScaledInstance(980, 480, 0);
									img=new ImageIcon(fin);
									Centrlbg=new JLabel(img);
									Centrlbg.setBounds(0,0,980,480);
									mycrt.add(Centrlbg);
									 
								//-----------------------Heading In CArt 
									heading=new JPanel();
									heading.setBackground(new Color(0,0,0,40));
									heading.setBounds(450,20,500,60);
									heading.setLayout(null);
									Centrlbg.add(heading);
									
									f1=new Font("Courier",Font.BOLD,25);
									name=new JLabel("Cart Of Pending Purchases!! ");
									name.setForeground(Color.black);
									name.setFont(f1);
									name.setBounds(20,10,500,30);
									heading.add(name);
									
									//----------------------seccond Panel Heading Stuff
									CartCentr=new JPanel();
									CartCentr.setBackground(new Color(0,0,0,80));
									CartCentr.setBounds(50,100,900,350);
									CartCentr.setLayout(null);
									Centrlbg.add(CartCentr);
									
									
									f1=new Font("Courier",Font.BOLD,23);
									name=new JLabel(" * Pending Orders Are !! ");
									name.setForeground(Color.black);
									name.setFont(f1);
									name.setBounds(30,10,500,30);
									CartCentr.add(name);
									f1=new Font("Courier",Font.BOLD,20);
									
													
							//------------------cart empty Panel---------------Cempty
									
									Cempty=new JPanel();
									Cempty.setBackground(new Color(0,0,0,80));
									Cempty.setBounds(50,100,900,350);
									Cempty.setLayout(null);
									Centrlbg.add(Cempty);
									
									
									f1=new Font("Courier",Font.BOLD,23);
									name=new JLabel(" * Pending Orders Are !! ");
									name.setForeground(Color.black);
									name.setFont(f1);
									name.setBounds(30,10,500,30);
									Cempty.add(name);
									
									f1=new Font("Courier",Font.BOLD,20);
									cempty=new JLabel(" No Order's Curently !!! ");
									cempty.setForeground(Color.black);
									cempty.setFont(f1);
									cempty.setBounds(130,40,300,30);
									Cempty.add(cempty);
									
									Cempty.setVisible(true);
									CartCentr.setVisible(false);
				
			//==========================Update ===================	
				
									update=new JPanel();
									update.setBackground(new Color(255,255,255,30));
									update.setLayout(null);
									update.setBounds(250,220,980,480);
									Backgroud.add(update);
									
									
									img=new ImageIcon("D:/java/NAture/update.jpg");
									temp=img.getImage();
									fin=temp.getScaledInstance(980, 480, 0);
									img=new ImageIcon(fin);
									Centrlbg=new JLabel(img);
									Centrlbg.setBounds(0,0,980,480);
									update.add(Centrlbg);
									 
								//-----------------------Heading In CArt 
									heading=new JPanel();
									heading.setBackground(new Color(0,0,0,80));
									heading.setBounds(80,50,500,60);
									heading.setLayout(null);
									Centrlbg.add(heading);
									
									f1=new Font("Courier",Font.BOLD,25);
									name=new JLabel("Update FullOFF Betterment !! ");
									name.setForeground(Color.white);
									name.setFont(f1);
									name.setBounds(40,10,500,30);
									heading.add(name);
								//------------------------text---------------------------
									
									JPanel upCent=new JPanel();
									upCent.setBackground(new Color(0,0,0,120));
									upCent.setLayout(null);
									upCent.setBounds(30,140,920,310);
									Centrlbg.add(upCent);
									
									f1=new Font("Courier",Font.BOLD,20);
									name=new JLabel("=> Version Upto Date Running Ver 2.8 With End Module 2.8 ");
									name.setForeground(Color.white);
									name.setFont(f1);
									name.setBounds(30,10,890,20);
									upCent.add(name);
									
									f1=new Font("Courier",Font.BOLD,20);
									name=new JLabel("=> Version 3 Beta Module Lauching Soon ");
									name.setForeground(Color.white);
									name.setFont(f1);
									name.setBounds(30,40,890,25);
									upCent.add(name);
									
									name=new JLabel("   -: Version 3 Focuses On :- ");
									name.setForeground(Color.white);
									name.setFont(f1);
									name.setBounds(280,70,890,20);
									upCent.add(name);
									
									name=new JLabel(" A . Permannent Data Storage  ");
									name.setForeground(Color.white);
									name.setFont(f1);
									name.setBounds(80,100,890,30);
									upCent.add(name);
									
									name=new JLabel(" B . Data Security And Efficient Transactions  ");
									name.setForeground(Color.white);
									name.setFont(f1);
									name.setBounds(80,140,890,20);
									upCent.add(name);
									
									
	//====================Panel Visibilty Setting And Action Listeners =====================================
									Central.setVisible(true);
									recharge.setVisible(false);
									addbal.setVisible(false);
									mycrt.setVisible(false);
									Cempty.setVisible(false);
									update.setVisible(false);
									//Action Listener
										mobileRecharge.addActionListener(this);	
										Addbal.addActionListener(this);
										mycart.addActionListener(this);
										Account.addActionListener(this);
										updates.addActionListener(this);
										logout.addActionListener(this);
			
}


@Override
public void actionPerformed(ActionEvent e) {
	int amout;
	//=============================Menu Actions====================
			if(e.getSource()==mobileRecharge)
			{
				Central.setVisible(false);
				addbal.setVisible(false);
				recharge.setVisible(true);
				mycrt.setVisible(false);
				update.setVisible(false);
			}
			if(e.getSource()==Addbal)
			{
				
				Central.setVisible(false);
				addbal.setVisible(true);
				recharge.setVisible(false);
				mycrt.setVisible(false);
				update.setVisible(false);
			}
			if(e.getSource()==mycart)
			{
				
				Central.setVisible(false);
				addbal.setVisible(false);
				recharge.setVisible(false);
				mycrt.setVisible(true);
				update.setVisible(false);
				if(Count==0)
				{
				Cempty.setVisible(true);
				CartCentr.setVisible(false);
				}
				else
				{
					Cempty.setVisible(false);
					CartCentr.setVisible(true);	
				}
			}
			if(e.getSource()==updates)
			{
				Central.setVisible(false);
				addbal.setVisible(false);
				recharge.setVisible(false);
				mycrt.setVisible(false);
				update.setVisible(true);
			}
			if(e.getSource()==logout)
			{
				int cho=JOptionPane.showConfirmDialog(mainframe,"Are You Sure To Logout ??");
				if(cho==0)
				{
					cho=JOptionPane.showConfirmDialog(mainframe,"Do You Want To Go To Main Page  ??\n Else You Will Exit The Appliction ");
					if(cho==0)
					{
						Welcome w1=new Welcome();
						mainframe.dispose();
					}
					if(cho==1)
					{
						System.exit(0);
					}
				}
			}
	//=============================Recharge Action ================================
			if(e.getSource()==rechar)
			{
				if(plan.getText().equals("") || mobno.getText().equals(""))
				{
					JOptionPane.showMessageDialog(mainframe, " Fill The Details First !!");
				}
				else
				{
				int cho=JOptionPane.showConfirmDialog(mainframe,"Are You Sure To Proceed Further ??");
				if(cho==0)
				{
					int avilbal=Integer.parseInt(bal.getText());
					amout=Integer.parseInt(plan.getText());
					if(avilbal>amout)
					{
						JOptionPane.showMessageDialog(mainframe, " Recharge Request Sent !!");
						int rec=JOptionPane.showConfirmDialog(mainframe, "Did You Recive The Notification On Phone");
						if(rec==0)
						{
							int cashback=(int)((int)0+(Math.random()*100));
							JOptionPane.showMessageDialog(mainframe, " Recharge Done Successfully !! \n You Got "+cashback+" Rs Cashback !!\n It Would Be Added To Your Wallet");
							avilbal=avilbal-amout;
							avilbal+=cashback;
							bal.setText(Integer.toString(avilbal));
							setBal(avilbal);
							plan.setText("");
							mobno.setText("");
							
						}
						if(rec==1)
						{
							JOptionPane.showMessageDialog(mainframe, "Wait For Few Minutes");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(mainframe, "Amount Is Less In Wallet Please Add Money In Wallet ");
						cho=JOptionPane.showConfirmDialog(mainframe,"Add Amount To Wallet ??");
						if(cho==0)
						{
							Central.setVisible(false);
							recharge.setVisible(false);
							mycrt.setVisible(true);
							addbal.setVisible(true);
						}
					}
				}
			}
		}
			if(e.getSource()==addCart)
			{
				JOptionPane.showMessageDialog(mainframe, "Order Added To Cart \nGo To My Cart To Check Your Order. ");
				plan.setText("");
				mobno.setText("");
				Count=1;
				
					//------------------------Cart-----------------------
							//---------------Mobile Number--------
								f1=new Font("Courier",Font.BOLD,20);
								
								namelnum=new JLabel(" Mobile Number :- ");
								namelnum.setForeground(Color.black);
								namelnum.setFont(f1);
								namelnum.setBounds(80,80,250,30);
								CartCentr.add(namelnum);
								
								lnum=new JLabel(cartnum);
								lnum.setForeground(Color.black);
								lnum.setFont(f1);
								lnum.setBounds(390,80,250,30);
								CartCentr.add(lnum);
							//---------------Operator--------
								f1=new Font("Courier",Font.BOLD,20);
								namelprov=new JLabel(" Service Provider :- ");
								namelprov.setForeground(Color.black);
								namelprov.setFont(f1);
								namelprov.setBounds(80,130,280,30);
								CartCentr.add(namelprov);
								
								lprov=new JLabel(provider.getSelectedItem());
								lprov.setForeground(Color.black);
								lprov.setFont(f1);
								lprov.setBounds(390,130,250,30);
								CartCentr.add(lprov);
							//---------------Plan--------
								f1=new Font("Courier",Font.BOLD,20);
								namelpn=new JLabel(" Plan :- ");
								namelpn.setForeground(Color.black);
								namelpn.setFont(f1);
								namelpn.setBounds(80,180,250,30);
								CartCentr.add(namelpn);
								
								lpn=new JLabel(cartplan);
								lpn.setForeground(Color.black);
								lpn.setFont(f1);
								lpn.setBounds(390,180,250,30);
								CartCentr.add(lpn);
						//-------------------------buttons---------------
							makerecharg=new JButton("Make Recharge ");
							makerecharg.setBackground(new Color(0,5,30));
							makerecharg.setForeground(Color.black);
							makerecharg.setFont(f1);
							makerecharg.setBounds(160,230,250,40);
							CartCentr.add(makerecharg);
							makerecharg.addActionListener(this);
								
							carDelt=new JButton("Delete ");
							carDelt.setBackground(new Color(0,5,30));
							carDelt.setForeground(Color.black);
							carDelt.setFont(f1);
							carDelt.setBounds(460,230,250,40);
							CartCentr.add(carDelt);
							carDelt.addActionListener(this);
							
							plan.setText("");
							mobno.setText("");
							
								
			}
	//--------------------cart Choices-------------------
			if(e.getSource()==makerecharg)
			{
				mycrt.setVisible(false);
				Central.setVisible(false);
				addbal.setVisible(false);
				recharge.setVisible(true);
				
				
				mobno.setText(cartnum);
				provider.select(cartprovider);
				plan.setText(cartplan);
				
			}
			if(e.getSource()==carDelt)
			{
				JOptionPane.showMessageDialog(mainframe, "Order Removed From Cart\n Refresh Cart By Clicking On Other Menue And Back To My Cart ");
				Count=0;
			}
	//---------plan value--------
			
			//------select Plan;
			
			if (e.getSource()==Selctplan)
			{
				if(plan1.isSelected())
				{
					plan.setText("4999");
				}
				if(plan2.isSelected())
				{
					plan.setText("3999");
				}if(plan3.isSelected())
				{
					plan.setText("2599");
				}if(plan4.isSelected())
				{
					plan.setText("1099");
				}if(plan5.isSelected())
				{
					plan.setText("599");
				}
				cartplan=plan.getText();
				cartnum=mobno.getText();
			}
			//=============================Amount Action ================================
			if(e.getSource()==addamount)
			{
				if(account.getText().equals("") || amount.getText().equals(""))
				{
					JOptionPane.showMessageDialog(mainframe, " Fill The Details First !!");
				}
				else
				{
				int cho=JOptionPane.showConfirmDialog(mainframe,"Are You Sure To Proceed Further ??");
				if(cho==0)
				{
					int avilbal=Integer.parseInt(bal.getText());
					int prebal=avilbal;
					amout=Integer.parseInt(amount.getText());
											JOptionPane.showMessageDialog(mainframe, " Amount Add Request Sent !!");
						int rec=JOptionPane.showConfirmDialog(mainframe, "Did You Receive The Notification On Phone");
						if(rec==0)
						{
							JOptionPane.showMessageDialog(mainframe, " Amonut Added Successfully !!");
							avilbal=avilbal+amout;
							bal.setText(Integer.toString(avilbal));
							setBal(avilbal);
						}
						if(rec==1)
						{
							JOptionPane.showMessageDialog(mainframe, "Wait For Few Minutes");
						}
						int curtbal=Integer.parseInt(bal.getText());
					if(curtbal==prebal)
					{
						JOptionPane.showMessageDialog(mainframe, "Transactional Error Occured\n Amount Didnt Go t Added");
						
					}
				}
			}
		}
			
			if(e.getSource()==exit)
			{
				int cho=JOptionPane.showConfirmDialog(mainframe,"Are You Sure Exiting  ??");
				if(cho==0)
				{
					TempDashboard d1=new TempDashboard();
				}
			}
}
}
