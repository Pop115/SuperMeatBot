import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MyRobot {
	Robot robot;
	

	public int jump = KeyEvent.VK_SPACE;
	public int right = KeyEvent.VK_D;
	public int left = KeyEvent.VK_A;
	public int run = KeyEvent.VK_SHIFT;
	public int timeDelay = 40;
	public MyRobot(){
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		System.out.println("----ROBOT RUN----");
		this.getFocus();	
		this.pause(100);
//		if (this.lvlA1() ){
//			nextLvl();
//			
//			this.delay(3000);
//			
//			if(this.lvlA2()){
//				nextLvl();
//				
//				this.delay(3000);
//				
//				if(this.lvlA3()){
//					nextLvl();
//				}
//			}
//			
//		}
		
		//this.lvlA4();
		this.lvlB1();
		
	}
	
	public void getFocus(){
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public boolean nextLvl(){
		this.pause(5000);
		robot.keyPress(jump);
		this.pause(100);
		robot.keyRelease(jump);
		
		return true;
	}
	
	public boolean restartLvl(){
		robot.keyPress(KeyEvent.VK_ESCAPE);
		this.pause(100);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		this.pause(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		this.pause(100);
		robot.keyRelease(KeyEvent.VK_DOWN);
		this.pause(100);
		robot.keyPress(KeyEvent.VK_DOWN);
		this.pause(100);
		robot.keyRelease(KeyEvent.VK_DOWN);
		this.pause(100);
		robot.keyPress(KeyEvent.VK_DOWN);
		this.pause(100);
		robot.keyRelease(KeyEvent.VK_DOWN);

		return true;
	}
	
	public boolean lvlB1(){
		robot.keyPress(run);
		this.pause(timeDelay);
		
		//Premier saut
		robot.keyPress(right);
		this.pause(400);
		robot.keyPress(jump);
		this.pause(200);
		robot.keyRelease(jump);
		this.pause(500);
		
		//Deuxieme saut
		robot.keyPress(jump);
		this.pause(300);
		robot.keyRelease(jump);
		this.pause(500);
		
		//Saut et walljump
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(700);
		robot.keyRelease(left);
		
		this.pause(timeDelay);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(400);
		robot.keyRelease(jump);
		this.pause(900);
		robot.keyRelease(right);
		
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(600);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(600);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyRelease(left);
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(400);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(500);
		robot.keyRelease(left);
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(400);
		robot.keyRelease(jump);
		this.pause(1000);
		robot.keyRelease(right);
		
		this.pause(timeDelay);
		robot.keyRelease(jump);
		
		this.pause(timeDelay);
		robot.keyRelease(run);
		return true;
	}
	
	
	public boolean lvlA4(){
		robot.keyPress(run);
		this.pause(timeDelay);
		
		robot.keyPress(right);
		this.pause(700);
		robot.keyPress(jump);
		this.pause(300);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(500);
		robot.keyRelease(jump);
		
		this.pause(1100);
		robot.keyPress(jump);
		this.pause(300);
		robot.keyRelease(left);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(200);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(400);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		robot.keyRelease(left);
		
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(500);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(600);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		robot.keyRelease(left);
		
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(100);
		robot.keyRelease(jump);
		this.pause(700);
		robot.keyRelease(right);
		
		this.pause(timeDelay);		
		robot.keyRelease(run);
		
		return true;
	}
	
	public boolean lvlA3(){
		robot.keyPress(run);
		this.pause(timeDelay);
		
		robot.keyPress(right);
		this.pause(200);
		robot.keyPress(jump);
		this.pause(4000);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		
		this.pause(timeDelay);
		robot.keyRelease(run);
		
		return true;
	}
	
	public boolean lvlA2(){
		robot.keyPress(run);
		this.pause(timeDelay);
		
		robot.keyPress(right);
		this.pause(1500);
		robot.keyPress(jump);
		this.pause(200);
		robot.keyRelease(right);
		this.pause(timeDelay);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(200);
		robot.keyRelease(jump);
		this.pause(timeDelay);		
		robot.keyRelease(left);
		this.pause(timeDelay);
		
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyPress(right);
		this.pause(200);
		robot.keyRelease(jump);
		this.pause(timeDelay);		
		robot.keyRelease(right);
		this.pause(timeDelay);
		
		robot.keyPress(jump);
		this.pause(timeDelay);
		robot.keyPress(left);
		this.pause(200);
		robot.keyRelease(jump);
		this.pause(2000);		
		robot.keyRelease(left);

		this.pause(timeDelay);
		robot.keyRelease(run);
		
		return true;
	}
	
	public boolean lvlA1(){
		robot.keyPress(run);
		
		this.pause(timeDelay);
		robot.keyPress(jump);
		this.pause(200);
		robot.keyPress(left);
		this.pause(300);
		robot.keyRelease(jump);
		this.pause(timeDelay);
		robot.keyRelease(left);
		this.pause(timeDelay);
		
		robot.keyPress(right);
		this.pause(200);
		robot.keyPress(jump);
		this.pause(300);
		robot.keyRelease(jump);
		this.pause(300);
		robot.keyRelease(right);

		this.pause(timeDelay);
		robot.keyRelease(run);
		return true;
	}
	
	public void pause(int a){
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}