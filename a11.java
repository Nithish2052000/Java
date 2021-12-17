import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class a11 extends Applet implements ActionListener{
Label l1=new Label("First number");
Label l2=new Label("Second Number");
Label l3=new Label();
TextField t1=new TextField();
TextField t2=new TextField();
Button b1 =new Button("Add");
public void init(){
  setLayout(null);
  l1.setBounds(30,50,100,20);
  l2.setBounds(30,100,100,20);
  t1.setBounds(150,50,100,20);
  t2.setBounds(150,100,100,20);
  b1.setBounds(30,150,80,20);
  l3.setBounds(150,150,100,20);
  add(l1);
  add(l2);
  add(t1);
  add(t2);
  add(l3);
  add(b1);
  b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
  int a,b,s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a+b;
  l3.setText("Sum is : "+s);
}
}
