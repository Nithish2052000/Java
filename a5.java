import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class a5 extends Applet implements MouseListener,MouseMotionListener{
//Frame f=new Frame();
//Button b= new Button("Clicke Here");
int v1;
int v2;
public void init(){
	addMouseListener(this);
}
public void mouseEntered(MouseEvent e){
	setBackground(Color.red);
v1=(int)getX();
v2=(int)getY();
repaint();
}
public void mousePressed(MouseEvent e){
setBackground(Color.yellow);
}
public void mouseReleased(MouseEvent e){
setBackground(Color.green);
}
public void mouseClicked(MouseEvent e){
setBackground(Color.blue);
}
public void mouseExited(MouseEvent e){
setBackground(Color.black);
}
public void paint(Graphics g){
	g.drawString("hi"+v1+v2,20,20);
}
}