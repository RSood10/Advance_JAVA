import java.awt.*;
import java.awt.event.*;

class WeekTwoQtwo extends Frame implements ItemListener
{
	String s;
	Checkbox c1,c2,c3,c4;
	Boolean b1,b2,b3,b4;
	
	WeekTwoQtwo()
	{
	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
}
	
	public void check()
	{
		this.setLayout(null);
		c1 = new Checkbox("Hi");
		add(c1);
		c1.setBounds(100,100,10,10);
		c2 = new Checkbox();
		add(c2);
		c2.setBounds(100,130,10,10);
		c3 = new Checkbox();
		add(c3);
		c3.setBounds(100,160,10,10);
		c4 = new Checkbox();
		add(c4);
		c4.setBounds(100,190,10,10);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
	}
	 public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Select From Given Checkbox :",40,70);
		g.drawString("C1",30,110);
		g.drawString("C2",30,140);
		g.drawString("C3",30,170);
		g.drawString("C4",30,200);
		
	/*	g.setColor(Color.blue);
		s = "C1"+" "+c1.getState();
		g.drawString(s,150,110);
		s = "C2"+" "+c2.getState();
		g.drawString(s,150,140);
		s = "C3"+" "+c3.getState();
		g.drawString(s,150,170);
		s = "C4"+" "+c4.getState();
		g.drawString(s,150,200);*/
		try
		{
		b1 =  c1.getState();
		b2 = c2.getState();
        b3 = c3.getState();
        b4 = c4.getState();	
		if(b1 == true)
		g.drawString("False",150,110);
		if(b2 == true)
		g.drawString("True",150,140);
		if(b3 == true)
		g.drawString("False",150,170);
		if(b4 == true)
		g.drawString("False",150,200);
		}
		catch (Exception e){}
	}
	public static void main(String args[])
	{
		WeekTwoQtwo two = new WeekTwoQtwo();
		
		two.check();
		two.setSize(500,500);
		two.setTitle("Q Two : Multiple Checkbox");
		two.setVisible(true);
	}
}

