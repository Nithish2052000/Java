import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class app1 extends Applet implements KeyListener{
	public void init(){
		addKeyListener(this);
	}
public void keyPressed(KeyEvent e){
	showStatus("You have pressed the key");
	
}
public void keyReleased(KeyEvent e){
	showStatus("You have released the key");
    
}
public void keyTyped(KeyEvent e){
	char ch=e.getKeyChar();
    showStatus("You have typed the key:"+ch);
    
}

}
