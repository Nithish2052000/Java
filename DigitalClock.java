import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.util.Date;
public class DigitalClock extends java.applet.Applet implements Runnable{
Font theFont = new Font("TimesRoman",Font.BOLD,24);
Date theDate;
Thread runner;
public void init(){
setBackground(Color.yellow);
setForeground(Color.blue);
}
public void start(){
if(runner==null){
runner =new Thread(this);
runner.start();
}
}
public void stop(){
if(runner!=null){
runner.yield();
runner=null;
}
}
public void run(){
while(true){
theDate = new Date();
repaint();
try{
Thread.sleep(1000);
}catch(Exception e){}
}
}
public void paint(Graphics g){
g.setFont(theFont);
g.drawString(theDate.toString(),10,50);
g.drawString(theDate.toString(),100,100);
}
}
