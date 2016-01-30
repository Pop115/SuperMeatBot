package levels;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Level extends Thread{
	public Robot robot;
	public String name = "NAME NOT FOUND DAMNIT";
	
	public int jump = KeyEvent.VK_SPACE;
	public int right = KeyEvent.VK_D;
	public int left = KeyEvent.VK_A;
	public int run = KeyEvent.VK_SHIFT;
	public int timeDelay = 40;

	public Level(Robot robot){
		this.robot=robot;
		this.name="--"+ this.getClass().getPackage().getImplementationTitle() + " " + this.getClass().getSimpleName() +"--";
	}
	
	public String getLevelName(){
		return name;
	}
	
	public void nextLevel(){
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.delay(2000);
	}
}