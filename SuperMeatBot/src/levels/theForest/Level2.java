package levels.theForest;

import java.awt.Robot;

import levels.Level;

public class Level2 extends Level{
	
	public Level2(Robot robot){
		super(robot);
	}
	
	public void run(){
		robot.keyPress(run);
		robot.delay(timeDelay);
		
		robot.keyPress(right);
		robot.delay(1500);
		robot.keyPress(jump);
		robot.delay(200);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(200);
		robot.keyRelease(jump);
		robot.delay(timeDelay);		
		robot.keyRelease(left);
		robot.delay(timeDelay);
		
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(200);
		robot.keyRelease(jump);
		robot.delay(timeDelay);		
		robot.keyRelease(right);
		robot.delay(timeDelay);
		
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(200);
		robot.keyRelease(jump);
		robot.delay(2000);		
		robot.keyRelease(left);

		robot.delay(timeDelay);
		robot.keyRelease(run);
		
		this.nextLevel();

	}
	
}
