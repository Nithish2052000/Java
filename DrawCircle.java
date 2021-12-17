import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class DrawCircle extends Frame 
{
	Shape circle=new Ellipse2D.Float(100.0f,100.0f,100.0f,100.0f);
	
	public void paint(Graphics g)
	{
		Graphics2D ga=(Graphics2D)g;
		ga.draw(circle);
		ga.setPaint(Color.yellow);
		ga.fill(circle);
	}
		
	public static void main(String args[])
	{
		
		Frame frame=new DrawCircle();
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
		    }
		});
		
		frame.setSize(300, 250);
		frame.setVisible(true);	
	}
}
