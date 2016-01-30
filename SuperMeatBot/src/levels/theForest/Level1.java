package levels.theForest;

import java.awt.Robot;

import levels.Level;

public class Level1 extends Level{

	public Level1(Robot robot){
		super(robot);
	}

	public void run(){
		robot.keyPress(run);

		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(200);
		robot.keyPress(left);
		robot.delay(300);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		robot.keyRelease(left);
		robot.delay(timeDelay);

		robot.keyPress(right);
		robot.delay(200);
		robot.keyPress(jump);
		robot.delay(300);
		robot.keyRelease(jump);
		robot.delay(300);
		robot.keyRelease(right);

		robot.delay(timeDelay);
		robot.keyRelease(run);
		
		this.nextLevel();
	}

}
