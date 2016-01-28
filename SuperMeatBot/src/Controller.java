import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Controller extends JFrame implements KeyListener{
	
	MyRobot myRobot = new MyRobot();
	Panneau pan = new Panneau();

	public Controller(){
		this.setSize(300, 200);
		this.setTitle("Controller");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(pan);
		
		this.setVisible(true);
		
		this.addKeyListener(this);
	}
	
	public void run(){
		while(true){			
			try{
				Thread.sleep(20);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			pan.repaint();
		}
	}

	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == KeyEvent.VK_B ){
			System.out.println("Go");
			pan.changeColor(Color.green);
			myRobot.run();
		}
	}

	public void keyReleased(KeyEvent e) {		
	
	}

	public void keyTyped(KeyEvent e) {

	}	
}
