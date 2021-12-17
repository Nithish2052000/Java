import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class eg31 extends Applet implements MouseListener
{
String str=" ";
public void init()
{
addMouseListener(this);
}
public void mousePressed(MouseEvent e)
{
str="You pressed the mouse";
repaint();
}
public void mouseReleased(MouseEvent e)
{
str="You released the mouse";
repaint();
}
public void mouseClicked(MouseEvent e)
{
setBackground(Color.green);
str="You clicked the mouse";
repaint();
}
public void mouseEntered(MouseEvent e)
{
setBackground(Color.blue);
str="You entered the applet area";
repaint();
}
public void mouseExited(MouseEvent e)
{
setBackground(Color.red);
str="You exited the applet area";
repaint();
}
public void paint(Graphics g)
{
g.drawString(str,75,150);
}
}