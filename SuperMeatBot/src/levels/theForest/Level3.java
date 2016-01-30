package levels.theForest;

import java.awt.Robot;

import levels.Level;

public class Level3 extends Level{
	
	public Level3(Robot robot){
		super(robot);
	}
	
	public void run(){
		robot.keyPress(run);
		robot.delay(timeDelay);
		
		robot.keyPress(right);
		robot.delay(200);
		robot.keyPress(jump);
		robot.delay(4000);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		
		robot.delay(timeDelay);
		robot.keyRelease(run);
		
		this.nextLevel();

		
	}
	
}
