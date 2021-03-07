import java.awt.*;
import java.awt.event.*;

class lists extends Frame  implements ActionListener
{
	//Boolean b1,b2,b3,b4,b5,b6;
	//Checkbox c1,c2,c3,c4,c5,c6;
	String str;
	//static int count = 0;
	List l;//// action listener is used in list to show the choosen value
	Panel p = new Panel();
	Button b  = new Button("click");
	Button b1 = new Button("click");
	TextField tf ;
	lists()
	{
		setLayout(null);
		{
	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		}
		l = new List();
		l.setBounds(100,100,70,30);
		l.add("mandu");
		l.add("dewas");
		l.add("ujjain");
		l.add("indore");
		tf = new TextField(30);
		p.setLayout(new FlowLayout());
		b.addActionListener(this);
		b1.addActionListener(this);
		l.addActionListener(this);
		p.add(b);
		p.add(b1);
		p.add(tf);
		p.setBounds(200,200,250,150);
		add(p);
		add(l);
	}
	public void actionPerformed(ActionEvent e)
	{
		try {
	    str = e.getActionCommand();
		if(str.equals("indore")) {
		this.setBackground(Color.red);
		p.setBackground(Color.yellow);
		tf.setText("indore");}
		
		if(str.equals("mandu")){
			this.setBackground(Color.blue);
		tf.setText("mandu");}
		
		if(str.equals("dewas")){
			this.setBackground(Color.yellow);
		tf.setText("dewas");}
		
		if(str.equals("ujjain")){
			this.setBackground(Color.pink);
			tf.setText("indore");
		}
		Object o = e.getSource();
		Button b2 = (Button)o;
		if(b2 == b) tf.setText("you clicked the wrong button");
		if(b2 == b1) tf.setText(" ");
		}
		catch(Exception r) {}
	}
		
	public static void main(String args[])
	{
		lists s = new lists();
		s.setVisible(true);
		s.setSize(650,650);
		s.setTitle("List's");
	}
}


