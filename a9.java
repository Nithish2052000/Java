import java.awt.*;
import java.applet.*;
import java.awt.event;;
public class a9 extends Applet implements ActionListener{
  Button b1=new Button("blue");
  Button b2=new Button("red");
  Button b3=new Button("green");
  TextField t1=new TextField("hi");
  TextField t2=new TextField("hi");
  TextField t3=new TextField("hi");
  public void init(){
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
  public void actionPerformed(){
    b1.t1("hi");
    repaint();
    b2.t2("hi");
    repaint();
    b3.t3("hi");
    repaint();
  }
}
