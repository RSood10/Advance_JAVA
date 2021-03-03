import java.awt.*;
import java.awt.event.*;

class qpapers  extends Frame// implements ItemListener
{
	Boolean b1,b2,b3,b4,b5,b6;
	Checkbox c1,c2,c3,c4,c5,c6;
	
	qpapers()
	{
		this.setLayout(null);
		{
	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		}
	}
	void checkbox()
	{
		c1 = new Checkbox("Java");
		c1.setBounds(500,500,50,20);
		add(c1);
		c2 = new Checkbox("Cpp");
		c2.setBounds(500,550,10,10);
		add(c2);
	}
	public static void main(String args[])
	{
		qpapers qp = new qpapers();
		qp.checkbox();
		qp.setSize(1000,700);
		qp.setTitle("Test");
		qp.setVisible(true);
	}
}


