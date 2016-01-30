package levels.theHospital;


import java.awt.Robot;

import levels.Level;

public class Level1 extends Level{

	public Level1(Robot robot){
		super(robot);
	}

	public void run(){
		robot.keyPress(run);
		robot.delay(timeDelay);
		
		//Premier saut
		robot.keyPress(right);
		robot.delay(400);
		robot.keyPress(jump);
		robot.delay(200);
		robot.keyRelease(jump);
		robot.delay(500);
		
		//Deuxieme saut
		robot.keyPress(jump);
		robot.delay(300);
		robot.keyRelease(jump);
		robot.delay(500);
		
		//Saut et walljump
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(700);
		robot.keyRelease(left);
		
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(400);
		robot.keyRelease(jump);
		robot.delay(900);
		robot.keyRelease(right);
		
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(600);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(600);
		robot.keyRelease(jump);
		robot.delay(timeDelay);
		
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyRelease(left);
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(400);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(500);
		robot.keyRelease(left);
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(400);
		robot.keyRelease(jump);
		robot.delay(1000);
		robot.keyRelease(right);
		
		robot.delay(timeDelay);
		robot.keyRelease(jump);
		
		robot.delay(timeDelay);
		robot.keyRelease(run);
		
		this.nextLevel();
	}

}

