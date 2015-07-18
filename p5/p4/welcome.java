package p4;
import p1.*;
import p1.doctorSer;
import p2.*;
import p3.*;
import java.sql.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class PATIENT extends JFrame implements ActionListener//,ItemListener//,FocusListener,
{
	JButton ba,bm,bdl,bds,bs,lo;
	public PATIENT()
	{
		super();
			JPanel q=new JPanel();
		/////////////////////////
		JLabel ji=new JLabel()
	{
		public void paint(Graphics g)
		{
			ImageIcon ii=new ImageIcon("GUI281.jpg");
			Image img123=ii.getImage();
			g.drawImage(img123,0,0,1200,650,this);
		}
		
		};	
		ji.setBounds(0,0,1300,800);
		
		
		q.add(ji);
		//////////////////////////////
				
		
		q.setLayout(null);
		ba=new JButton("ADD");
		ba.addActionListener(this);
		bm=new JButton("MODIFY");
		bm.addActionListener(this);
		bdl=new JButton("DELETE");
		bdl.addActionListener(this);
		bds=new JButton("DISPLAY");
		bds.addActionListener(this);
		bs=new JButton("SEARCH");
		bs.addActionListener(this);
		lo=new JButton("BACK");
		lo.addActionListener(this);
			lo.setBounds(325,585,150,40);
			q.add(lo);
		
		ba.setBounds(755,410,150,40);
			q.add(ba);
		bm.setBounds(755,480,150,40);
			q.add(bm);
		bdl.setBounds(955,410,150,40);
			q.add(bdl);
		bds.setBounds(955,480,150,40);
			q.add(bds);
		bs.setBounds(855,550,150,40);
			q.add(bs);
	    	
		add(q,BorderLayout.CENTER);
		
		setSize(1365,740);
		setVisible(true);
	
	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	

	public void actionPerformed(ActionEvent ae)
  {
  	JButton b=(JButton)ae.getSource();
		if(b==ba)
		{
			try
			{
				//read();
			
			patientAdd pf=new patientAdd("PATIENT FORM ");
				//doctor.add();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Added");
			}
			catch (Exception e4)
			{
			}
		}
		if(b==bdl)
		{
			try
			{
				patientDel pf=new patientDel("PATIENT FORM ");
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}} 
		if(b==bm)
		{
			try
			{
					patientMod pf=new patientMod("PATIENT FORM                                                                                                                                                   KRISHNA CLINIC");
				//read();
				//doctor.del();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Deleted");
			}
			catch (Exception e6)
			{
			}
		}	
		if(b==bs)
		{
			//disptable obj=null;
				try
				{
					patientSer pf=new patientSer("PATIENT FORM  ");
				}
			
				catch (Exception e7)
				{
				}
		}
		if(b==bds)
		{
			try
			{
				patientDis pf=new patientDis("PATIENT FORM ");
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}
		}
		if(b==lo)
		{
			//disptable obj=null;
				try
				{
					setVisible(false);
					//obj=new disptable(doctor.collectRows1());
				}
			
				catch (Exception e7)
				{
				}
		} 
		
		
		
		}
		
}
///////////////////////////////////////////
////////medicine//////////////////////////
	
class MEDICINE extends JFrame implements ActionListener//,ItemListener//,FocusListener,
{
	JButton ba,bm,bdl,bds,bs,brs,lo;
	public MEDICINE()
	{
		super();
			JPanel q=new JPanel();
		/////////////////////////
		JLabel ji=new JLabel()
	{
		public void paint(Graphics g)
		{
			ImageIcon ii=new ImageIcon("GUI211 m.jpg");
			Image img123=ii.getImage();
			g.drawImage(img123,0,0,1200,650,this);
		}
		
		};	
		ji.setBounds(0,0,1300,800);
		
		
		q.add(ji);
		//////////////////////////////
				
		
		q.setLayout(null);
		ba=new JButton("ADD");
		ba.addActionListener(this);
		bm=new JButton("MODIFY");
		bm.addActionListener(this);
		bdl=new JButton("DELETE");
		bdl.addActionListener(this);
		bds=new JButton("DISPLAY");
		bds.addActionListener(this);
		bs=new JButton("SEARCH");
		bs.addActionListener(this);
		brs=new JButton("REMOVE STOCK");
		brs.addActionListener(this);
		lo=new JButton("BACK");
		lo.addActionListener(this);
		lo.setBounds(220,585,175,40);
		q.add(lo);
		
		ba.setBounds(690,370,150,40);
			q.add(ba);
		bm.setBounds(690,450,150,40);
			q.add(bm);
		bdl.setBounds(690,530,150,40);
			q.add(bdl);
		bds.setBounds(890,370,150,40);
			q.add(bds);
		bs.setBounds(890,450,150,40);
			q.add(bs);
			brs.setBounds(890,530,150,40);
			q.add(brs);
	    	
		add(q,BorderLayout.CENTER);
		
		setSize(1365,740);
		setVisible(true);
	
	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	

	public void actionPerformed(ActionEvent ae)
  	{
  		JButton b=(JButton)ae.getSource();
		if(b==ba)
		{
			try
			{
				//read();
			
				medicineAdd pf=new medicineAdd("MEDICINE FORM");
				//doctor.add();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Added");
			}
			catch (Exception e4)
			{
			}
		}
		if(b==bdl)
		{
			try
			{
				medicineDel pf=new medicineDel("MEDICINE FORM");
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}} 
		if(b==bm)
		{
			try
			{
					medicineMod pf=new medicineMod("MEDICINE FORM");
				//read();
				//doctor.del();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Deleted");
			}
			catch (Exception e6)
			{
			}
		}	
		if(b==bs)
		{
			//disptable obj=null;
				try
				{
					medicineSer pf=new medicineSer("MEDICINE FORM");
				}
			
				catch (Exception e7)
				{
				}
		}
		if(b==bds)
		{
			try
			{
				medicineDis pf=new medicineDis("MEDICINE FORM");
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}} 
		if(b==brs)
		{
			try
			{
				medicineRem pf=new medicineRem("MEDICINE FORM");
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}
		}if(b==lo)
		{
			//disptable obj=null;
				try
				{
					setVisible(false);
					//obj=new disptable(doctor.collectRows1());
				}
			
				catch (Exception e7)
				{
				}
		} 
		
		
		
		}
		
}



/////////////////////////////////
/////doctor/////////////////

class DOCTOR extends JFrame implements ActionListener//,ItemListener//,FocusListener,
{
	JButton ba,bm,bdl,bds,bs,lo;
	public DOCTOR()
	{
		super();
			JPanel q=new JPanel();
		/////////////////////////
		JLabel ji=new JLabel()
	{
		public void paint(Graphics g)
		{
			ImageIcon ii=new ImageIcon("GUI211d.jpg");
			Image img123=ii.getImage();
			g.drawImage(img123,0,0,1200,650,this);
		}
		
		};	
		ji.setBounds(0,0,1300,800);
		
		
		q.add(ji);
		//////////////////////////////
				
		
		q.setLayout(null);
		ba=new JButton("ADD");
		ba.addActionListener(this);
		bm=new JButton("MODIFY");
		bm.addActionListener(this);
		bdl=new JButton("DELETE");
		bdl.addActionListener(this);
		bds=new JButton("DISPLAY");
		bds.addActionListener(this);
		bs=new JButton("SEARCH");
		bs.addActionListener(this);
		lo=new JButton("BACK");
		lo.addActionListener(this);
			lo.setBounds(220,585,175,40);
			q.add(lo);
		
		ba.setBounds(705,410,150,40);
			q.add(ba);
		bm.setBounds(705,480,150,40);
			q.add(bm);
		bdl.setBounds(905,410,150,40);
			q.add(bdl);
		bds.setBounds(905,480,150,40);
			q.add(bds);
		bs.setBounds(805,550,150,40);
					q.add(bs);
	    	
		add(q,BorderLayout.CENTER);
		
		setSize(1365,740);
		setVisible(true);
	
	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	

	public void actionPerformed(ActionEvent ae)
  {
  	JButton b=(JButton)ae.getSource();
		if(b==ba)
		{
			try
			{
			
			doctorAdd pf=new doctorAdd("DOCTOR FORM");
				
			}
			catch (Exception e4)
			{
			}
		}
		if(b==bdl)
		{
			try
			{
				doctorDel pf=new doctorDel("DOCTOR FORM");
				

			}
			catch (Exception e5)
			{
			}} 
		if(b==bm)
		{
			try
			{
					doctorMod pf=new doctorMod("DOCTOR FORM");
				
			}
			catch (Exception e6)
			{
			}
		}	
		if(b==bs)
		{
			//disptable obj=null;
				try
				{
					doctorSer pf=new doctorSer("DOCTOR FORM");
				}
			
				catch (Exception e7)
				{
				}
		}
		if(b==bds)
		{
			try
			{
				doctorDis pf=new doctorDis("DOCTOR FORM");
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}
		}
		if(b==lo)
		{
			//disptable obj=null;
				try
				{
					setVisible(false);
					//obj=new disptable(doctor.collectRows1());
				}
			
				catch (Exception e7)
				{
				}
		} 
		
		
		
		}
		
}

/////////////////////////////////////
public class welcome extends JFrame implements ActionListener//,ItemListener//,FocusListener,
{
	JLabel passp,namep;
	final String pass1="";
	final String name1="";
	static String a="",b="";
	TextField pass,name;
	JButton bp,bd,bm,bu,lo;
	public welcome()
	{
		super();
			JPanel q=new JPanel();
		/////////////////////////
		JLabel ji=new JLabel()
	{
		public void paint(Graphics g)
		{
			ImageIcon ii=new ImageIcon("GUI211.jpg");
			Image img123=ii.getImage();
			g.drawImage(img123,0,0,1200,650,this);
		}
		
		};	
		ji.setBounds(0,0,1300,800);
		
		
		q.add(ji);
		//////////////////////////////
		passp=new JLabel ("Password ");
		namep=new JLabel ("User Name ");
	
		pass=new TextField(6);
			pass.setEchoChar('*');
		name=new TextField(15);
		name.addActionListener(this);
		pass.addActionListener(this);
		
	
		
			
		
		
		q.setLayout(null);
			bp=new JButton("PATIENT");
		bp.addActionListener(this);
			bd=new JButton("DOCTOR");
		bd.addActionListener(this);
			bm=new JButton("MEDICINE");
		bm.addActionListener(this);
			bu=new JButton("ABOUT US");
		bu.addActionListener(this);
			lo=new JButton("LOGOUT");
		lo.addActionListener(this);
			lo.setBounds(220,587,175,40);
			q.add(lo);
		bp.setBounds(770,370,175,40);
			q.add(bp);
		bd.setBounds(770,430,175,40);
			q.add(bd);
		bm.setBounds(770,490,175,40);
			q.add(bm);
		bu.setBounds(770,550,175,40);
			q.add(bu);
	
	    	
		add(q,BorderLayout.CENTER);
		
		setSize(1365,740);
		setVisible(true);
	
	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	

	public void actionPerformed(ActionEvent ae)
  {
  	JButton b=(JButton)ae.getSource();
		if(b==bp)
		{
			try
			{
				//read();
					PATIENT p=new PATIENT();
				//patientForm1234 p=new patientForm1234("");
				//doctor.add();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Added");
			}
			catch (Exception e4)
			{
			}
		}
		if(b==bd)
		{
			try
			{
				DOCTOR d=new DOCTOR ();
				//read();
			
			//	doctor.mod();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Modified");

			}
			catch (Exception e5)
			{
			}}
		if(b==bm)
		{
			try
			{
				MEDICINE m=new MEDICINE();
				//read();
				//doctor.del();
				//JOptionPane.showMessageDialog(null,"doctor ID: "+doctor.mid+"  Record Deleted");
			}
			catch (Exception e6)
			{
			}
		}	
		if(b==bu)
		{
			//disptable obj=null;
				try
				{
					//obj=new disptable(doctor.collectRows1());
				}
			
				catch (Exception e7)
				{
				}
		}
			if(b==lo)
		{
			//disptable obj=null;
				try
				{
					setVisible(false);
					//obj=new disptable(doctor.collectRows1());
				}
			
				catch (Exception e7)
				{
				}
		}
		
		
		
		}
		
		
    /*String value1=pass.getText();
    String value2=name.getText();
        if (value1.equals("hosp") && value2.equals("hosp")) {
   // NextPage page=new NextPage();
    //page.setVisible(true);
     //NextPage page=new NextPage();
    //page.setVisible(true);
    JLabel label = new JLabel("Welcome:"+value1);
       // page.getContentPane().add(label);
    //JLabel label = new JLabel("Welcome:"+value1);
        //page.getContentPane().add(label);
  }
    else{
      System.out.println("enter the valid username and password");
      JOptionPane.showMessageDialog(this,"Incorrect login or password",
            "Error",JOptionPane.ERROR_MESSAGE);
  }*/

	
	
	public static void main(String[]args) 
	{
		
		welcome pf=new welcome();
	}
}