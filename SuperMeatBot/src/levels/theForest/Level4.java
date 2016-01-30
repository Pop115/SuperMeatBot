package levels.theForest;

import java.awt.Robot;

import levels.Level;

public class Level4 extends Level{
	
	public Level4(Robot robot){
		super(robot);
	}
	
	public void run(){
		robot.keyPress(run);
		robot.delay(timeDelay);
		
		robot.keyPress(right);
		robot.delay(700);
		robot.keyPress(jump);
		robot.delay(300);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(500);
		robot.keyRelease(jump);
		
		robot.delay(1100);
		robot.keyPress(jump);
		robot.delay(300);
		robot.keyRelease(left);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(200);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(400);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		robot.keyRelease(left);
		
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(500);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(600);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		robot.keyRelease(left);
		
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(100);
		robot.keyRelease(jump);
		robot.delay(700);
		robot.keyRelease(right);
		
		robot.delay(timeDelay);		
		robot.keyRelease(run);
		
		this.nextLevel();

		
		
	}
	
}
