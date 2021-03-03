import java.awt.*;
import java.awt.event.*;

class house extends Frame
{
	int x[] = {100,140,170,210};
	int y[] = {100,70,70,100};
	int n = x.length;
	int x1[] = {155,165,155};
	int y1[] = {50,47,45};
	int n1 = x1.length;
	//tree shape
	int x2[] = {210,230,220,250,280,270,290};
    int y2[] = {140,100,100,55,100,100,140};
	int n2 = x2.length;
	//hands
	int x3[] = {47,35,47,47,42,47};
	int y3[] = {120,132,145,137,132,129};
	int n3 = x3.length;//left hands
	int x4[] = {67,67,83,80};
	int y4[] = {120,128,114,110};
	int n4 = x4.length;//right hands
	int x5[] = {50,50,55,60,65,66,66};
	int y5[] = {110,95,97,95,97,95,110};
	int n5  = x5.length;
	
   house()
   {
	   addWindowListener(new WindowAdapter()
  {
	  public void windowClosing(WindowEvent e)
	  {
		 // super.windowClosing(e);
		  System.exit(0);
	  }
  });
   }
  public void paint(Graphics g)
  {
	  g.setColor(new Color(51,204,255));
	  g.fillRect(0,0,400,170);//sky
	 
	  g.setColor(new Color(160,110,0));
	  g.drawLine(155,70,155,50);
	 // g.drawLine(150,70,170,100);//line 3
	 // g.drawLine(120,70,150,70);//line 2
	 // g.drawLine(100,100,120,70);//line 1
	  g.fillRect(100,100,110,70);//base 
	  g.setColor(new Color(255,255,153));
	  g.fillRect(110,110,30,60);//gate
	  g.fillRect(170,110,25,30);//window
	 // g.drawLine(70,150,70,40);//tree stem 1
	 // g.drawLine(75,150,70,40);//tree stem 2
	  g.setColor(new Color(255,204,0));
	  g.fillPolygon(x,y,n);
	  g.setColor(new Color(255,102,0));
	  g.fillPolygon(x1,y1,n1);
	  g.setColor(Color.red);
	  g.fillOval(150,80,10,10);
	 
	  g.setColor(new Color(51,204,55));
	  g.fillPolygon(x2,y2,n2);//tree leaf
	  
	   g.setColor(Color.green);//green land
	  g.fillRect(0,170,400,230);
	  g.setColor(new Color(255,255,0));
	  g.fillArc(360,-2,70,70,180,90);//sun
	  g.setColor(new Color(120,51,0));
	  g.fillRect(245,140,10,30);
	  g.setColor(new Color(52,51,51));
	  g.fillPolygon(x5,y5,n5);//hair
	 
	  g.setColor(new Color(255,255,204));//face of man
	  g.fillOval(50,100,15,20);//face
	  g.setColor(Color.red);
	  g.fillRect(47,120,20,25);//chest
	 
	  g.fillPolygon(x3,y3,n3);//arm 1
	  g.fillPolygon(x4,y4,n4);//arm2
	  g.setColor(Color.black);
	  g.drawLine(170,125,195,125);//window line 1
	  g.drawLine(182,110,182,140);//window line 2
	  g.fillOval(116,140,5,5);//gate lock
	   g.fillRect(47,145,8,25);//le1
	  g.fillRect(59,145,8,25);//leg2
	   g.drawLine(57,120,57,145);//chest line
	   g.fillOval(54,105,2,3);//eye1
	   g.fillOval(61,105,2,3);//eye 2
	   g.fillOval(58,109,1,2);
	   g.setColor(new Color(255,51,51));
	   g.fillArc(54,111,9,5,180,180);//mouth
  }
  public static void main(String args[])
  {
	  house h =new house();
	  h.setTitle("HOUSE");
	  h.setSize(400,400);
	  h.setVisible(true);
  }
   }
   