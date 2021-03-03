import java.awt.*;
import java.awt.event.*;

class WeekTwoQone extends Frame implements ActionListener
{
  String s,s1;
  Button b,b1,b2,b3;
  
  WeekTwoQone()
  {
	  addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
  }
   
  public void button()
  {
	  this.setLayout(null);
	  b = new Button("Hindi");
	  b1 = new Button("English");
	  b2 = new Button("Hindi + English");
	  b3 = new Button("Not spoken");
	  
	  b.setBounds(30,40,90,30);
	  b1.setBounds(30,90,90,30);
	  b2.setBounds(30,140,90,30);
	  b3.setBounds(30,190,90,30);
	  
	  add(b);
	  add(b1);
	  add(b2);
	  add(b3);
	  b1.addActionListener(this);
	b2.addActionListener(this);
		b3.addActionListener(this);
		b.addActionListener(this);
	  
  }
  public void actionPerformed(ActionEvent e)
	{
		s = e.getActionCommand();
	}
	
  public void paint(Graphics g)
  {
	  
	  s1 = "Choose from Given Options";
	  g.drawString(s1,150,100);
	  g.setColor(Color.red);
	  g.drawString(" Language Spoken :",30,250);
	  g.setColor(Color.blue);
	  try
	  {
	  if(s.equals("Hindi"))
	  g.drawString(s,190,250);
	  else
	 if(s.equals("Hindi + English"))
		  g.drawString(s,190,250);
		  else
		  if(s.equals("English"))
		  g.drawString(s,190,250);
		  else
		  if(s.equals("Not spoken"))
		  g.drawString(s,190,250);
	  }
	  catch(Exception e){}
	  
  }
  
	
  public static void main(String args[])
  {
	  WeekTwoQone one = new WeekTwoQone();
	  one.button();
	  one.setSize(500,500);
	  one.setTitle("Language Known");
	  one.setVisible(true);
  }
}

