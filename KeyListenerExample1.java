import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public abstract class KeyListenerExample1 extends Applet implements KeyListener{
String pstr ="This is your key listener class example";
public void init()
{
addKeyListener(this);
}
public void KeyPressed(KeyEvent e){
setBackground(Color.blue);
showStatus("You have pressed a key");
}
public void KeyReleased(KeyEvent e){
setBackground(Color.red);
showStatus("You have released the key");
}
public void paint (Graphics g)
{
g.drawString(pstr,50,70);
}
public void KeyTyped(KeyEvent e)
{
char ch=e.getKeyChar();
repaint();
}
}
/*-->only classes will be importedin the package sub packages will not be imported*/
