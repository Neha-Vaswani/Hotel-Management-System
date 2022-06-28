import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Bill extends JFrame 
{
	JLabel lamount;
	static int tamount=0;
	
		
	Bill(Page p)
	{
		
		
		lamount=new JLabel();
		lamount.setBounds(500,300,500,50);
		Font f=new Font("Calibri",Font.BOLD,50);
		lamount.setFont(f);
		
		
		add(lamount);
		
		
		lamount.setText("Your bill amount is "+Bill.tamount+".");
		setLayout(null);
		setTitle("BILL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	Bill(Page1 p)
	{
		
		
		lamount=new JLabel();
		lamount.setBounds(500,300,500,50);
		Font f=new Font("Calibri",Font.BOLD,50);
		lamount.setFont(f);
		
		
		add(lamount);
		
		
		lamount.setText("Your bill amount is "+Bill.tamount+".");
		setLayout(null);
		setTitle("BILL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	Bill(Page2 p)
	{
		
		
		lamount=new JLabel();
		lamount.setBounds(500,300,500,50);
		Font f=new Font("Calibri",Font.BOLD,50);
		lamount.setFont(f);
		
		
		add(lamount);
		
		
		lamount.setText("Your bill amount is "+Bill.tamount+".");
		setLayout(null);
		setTitle("BILL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	Bill(Page3 p)
	{
		
		
		lamount=new JLabel();
		lamount.setBounds(500,300,500,72);
		Font f=new Font("Calibri",Font.BOLD,50);
		lamount.setFont(f);
		
		
		add(lamount);
		
		
		lamount.setText("Your bill amount is "+Bill.tamount+".");
		setLayout(null);
		setTitle("BILL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
class Page extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,limage,lamount;
	JComboBox cb1,cb2,cb3,cb4;
	JButton b1,b2;
	
	
       
	Test t;
	JCheckBox c1,c2,c3,c4;
    String qty[]={" ","1","2","3","4"};
	
	Page(Test t)
	{
		
	
		this.t=t;
		l2=new JLabel("Quantity:");
		l3=new JLabel("Menu:");
		ImageIcon i=new ImageIcon("D:\\Java Programs\\jdk-14.0.2\\bin\\Hotel Management System\\indian.jpeg");
		limage=new JLabel(i);
		
		
		c1=new JCheckBox("IDLI                        Rs 30/-");
		c2=new JCheckBox("MASALA DOSA          Rs 50/-");
		c3=new JCheckBox("MEDU WADA              Rs 40/-");
		c4=new JCheckBox("PAV BHAJI              Rs 70/-");
		b1=new JButton("ok");
		b2=new JButton("Previous");
		
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		
		limage.setBounds(0,0,1900,1050);
		l2.setBounds(1000,300,300,20);
		l3.setBounds(650,300,300,20);
		
		c1.setBounds(650,350,300,20);
		cb1.setBounds(1000,350,50,20);
		c2.setBounds(650,400,300,20);
		cb2.setBounds(1000,400,50,20);
		c3.setBounds(650,450,300,20);
		cb3.setBounds(1000,450,50,20);
		c4.setBounds(650,500,300,20);
		cb4.setBounds(1000,500,50,20);
		b1.setBounds(850,600,100,30);
		b2.setBounds(850,700,100,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
       
		
		add(limage);
		//limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(b1);
		limage.add(b2);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		setLayout(null);
		
		setTitle("HOTEL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}
			this.setVisible(false);
			Bill b=new Bill(this);
		}
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
			t.setVisible(true);
		}
}		
}
class Page1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,limage,lamount;
	JComboBox cb1,cb2,cb3,cb4;
	JButton b1,b2;
	
	
       
	Test t;
	JCheckBox c1,c2,c3,c4;
    String qty[]={" ","1","2","3","4"};
	
	Page1(Test t)
	{
		

		this.t=t;
		l2=new JLabel("Quantity:");
		l3=new JLabel("Menu:");
		ImageIcon i=new ImageIcon("D:\\Java Programs\\jdk-14.0.2\\bin\\Hotel Management System\\chinese.jpeg");
		limage=new JLabel(i);
		
		
		c1=new JCheckBox("NOODLES                  Rs 30/-");
		c2=new JCheckBox("MANCHURIAN            Rs 50/-");
		c3=new JCheckBox("MOMOS                      Rs 40/-");
		c4=new JCheckBox("SPRING ROLLS        Rs 70/-");
		b1=new JButton("ok");
		b2=new JButton("Previous");
		
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		
		limage.setBounds(0,0,1900,1050);
		//l1.setBounds(650,300,300,50);
		l2.setBounds(1000,300,300,20);
		l3.setBounds(650,300,300,20);
		
		c1.setBounds(650,350,300,20);
		cb1.setBounds(1000,350,50,20);
		c2.setBounds(650,400,300,20);
		cb2.setBounds(1000,400,50,20);
		c3.setBounds(650,450,300,20);
		cb3.setBounds(1000,450,50,20);
		c4.setBounds(650,500,300,20);
		cb4.setBounds(1000,500,50,20);
		b1.setBounds(850,600,100,30);
		b2.setBounds(850,700,100,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
       
		
		add(limage);
		//limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(b1);
		limage.add(b2);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		setLayout(null);
		
		setTitle("HOTEL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{

			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}
			this.setVisible(false);
			Bill b=new Bill(this);
		}
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
			t.setVisible(true);
			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}

			
	    }
		
}		
}
class Page2 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,limage,lamount;
	JComboBox cb1,cb2,cb3,cb4;
	JButton b1,b2;
	
	
       
	Test t;
	JCheckBox c1,c2,c3,c4;
    String qty[]={" ","1","2","3","4"};
	
	Page2(Test t)
	{
		
	
		this.t=t;
		l2=new JLabel("Quantity:");
		l3=new JLabel("Menu:");
		ImageIcon i=new ImageIcon("D:\\Java Programs\\jdk-14.0.2\\bin\\Hotel Management System\\desserts.jpeg");
		limage=new JLabel(i);
		
		
		c1=new JCheckBox("LASAGNA                  Rs 30/-");
		c2=new JCheckBox("GULAB JAMUN          Rs 50/-");
		c3=new JCheckBox("ICE CREAM              Rs 40/-");
		c4=new JCheckBox("CAKE                      Rs 70/-");
		b1=new JButton("ok");
		b2=new JButton("Previous");
		
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		
		limage.setBounds(0,0,1900,1050);
		l2.setBounds(1000,300,300,20);
		l3.setBounds(650,300,300,20);
		
		c1.setBounds(650,350,300,20);
		cb1.setBounds(1000,350,50,20);
		c2.setBounds(650,400,300,20);
		cb2.setBounds(1000,400,50,20);
		c3.setBounds(650,450,300,20);
		cb3.setBounds(1000,450,50,20);
		c4.setBounds(650,500,300,20);
		cb4.setBounds(1000,500,50,20);
		b1.setBounds(850,600,100,30);
		b2.setBounds(850,700,100,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
       
		
		add(limage);
		//limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(b1);
		limage.add(b2);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		setLayout(null);
		
		setTitle("HOTEL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}
			this.setVisible(false);
			Bill b=new Bill(this);
		}
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
			t.setVisible(true);
			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}
	    }
		
}		
}
class Page3 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,limage,lamount;
	JComboBox cb1,cb2,cb3,cb4;
	JButton b1,b2;

	
       
	Test t;
	JCheckBox c1,c2,c3,c4;
    String qty[]={" ","1","2","3","4"};
	
	Page3(Test t)
	{
		

		this.t=t;
		l2=new JLabel("Quantity:");
		l3=new JLabel("Menu:");
		ImageIcon i=new ImageIcon("D:\\Java Programs\\jdk-14.0.2\\bin\\Hotel Management System\\beverages.jpeg");
		limage=new JLabel(i);
		
		
		c1=new JCheckBox("HOT CHOCOLATE          Rs 30/-");
		c2=new JCheckBox("ICED TEA                    Rs 50/-");
		c3=new JCheckBox("SHAKES                        Rs 40/-");
		c4=new JCheckBox("SOFT DRINKS              Rs 70/-");
		b1=new JButton("ok");
		b2=new JButton("Previous");
		
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		
		limage.setBounds(0,0,1900,1050);
		//l1.setBounds(650,300,300,50);
		l2.setBounds(1000,300,300,20);
		l3.setBounds(650,300,300,20);
		
		c1.setBounds(650,350,300,20);
		cb1.setBounds(1000,350,50,20);
		c2.setBounds(650,400,300,20);
		cb2.setBounds(1000,400,50,20);
		c3.setBounds(650,450,300,20);
		cb3.setBounds(1000,450,50,20);
		c4.setBounds(650,500,300,20);
		cb4.setBounds(1000,500,50,20);
		b1.setBounds(850,600,100,30);
		b2.setBounds(850,700,100,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
       
		
		add(limage);
		//limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(b1);
		limage.add(b2);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		setLayout(null);
		
		setTitle("HOTEL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}
			this.setVisible(false);
			Bill b=new Bill(this);
		}
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
			t.setVisible(true);
			String s;
			int x;
			if(c1.isSelected())
			{
				s=cb1.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+30*x;
			}
			
			if(c2.isSelected())
			{
				s=cb2.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+50*x;
			}
			
			if(c3.isSelected())
			{
				s=cb3.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+40*x;
			}
			
			if(c4.isSelected())
			{
				s=cb4.getSelectedItem().toString();
				if(s.equals(" "))
					x=0;
				else	
				x=Integer.parseInt(s);
				Bill.tamount=Bill.tamount+70*x;
			}
	    }
		
}		
}
class Test extends JFrame implements ActionListener //MENU
{
	JLabel l1,limage,lamount;
	JButton cb1,cb2,cb3,cb4;
    JButton c1,c2,c3,c4;
    
	
	Test()
	{
	
		l1=new JLabel("TAJ HOTELS");
		ImageIcon i=new ImageIcon("D:\\Java Programs\\jdk-14.0.2\\bin\\Hotel Management System\\hotel.jpeg");
		limage=new JLabel(i);
		Font f=new Font("Calibri",Font.BOLD,50);
		l1.setFont(f);

		c1=new JButton("INDIAN DISHES");
		c2=new JButton("CHINESE DISHES");
		c3=new JButton("DESSERTS");
		c4=new JButton("BEVERAGES");
		
		
		limage.setBounds(0,0,1900,1050);
		l1.setBounds(675,270,300,50);
		
		c1.setBounds(650,350,300,20);
		c2.setBounds(650,400,300,20);
		c3.setBounds(650,450,300,20);
		c4.setBounds(650,500,300,20);
		
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
       
		
		add(limage);
		limage.add(l1);
		
	
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		
		setLayout(null);
		
		setTitle("HOTEL");
		setSize(1900,1050);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==c1)
		{	
		  this.setVisible(false);
		  Page p=new Page(this);
	   }
	   else if(e.getSource()==c2)
	   {
		   this.setVisible(false);
		   Page1 p=new Page1(this);
	   }
	   else if(e.getSource()==c3)
	   {
		   this.setVisible(false);
		   Page2 p=new Page2(this);
	   }
	   else if(e.getSource()==c4)
	   {
		   this.setVisible(false);
		   Page3 p=new Page3(this);
	   }
	}

	
	public static void main(String args[])
	{
		Test t=new Test();



		
	}
}