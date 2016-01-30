package levels.theHospital;


import java.awt.Robot;

import levels.Level;

public class Level3 extends Level{

	public Level3(Robot robot){
		super(robot);
	}

	public void run(){
		robot.delay(1200);
		
		robot.keyPress(run);
		robot.delay(timeDelay);
		
		//Go to right wall
		robot.keyPress(right);
		robot.delay(2100);
		robot.keyRelease(right);
		
		//Go au mur gauche et saut au dessus du truc
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(550);
		robot.keyPress(jump);
		robot.delay(170);
		robot.keyRelease(jump);
		robot.delay(1000);
		robot.keyRelease(left);
		
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(timeDelay);
		robot.keyPress(jump);
		robot.delay(150);
		robot.keyRelease(jump);
		robot.delay(700);
		robot.keyPress(jump);
		robot.delay(150);
		robot.keyRelease(jump);
		robot.delay(500);
		robot.keyRelease(right);
		
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(500);
		robot.keyPress(jump);
		robot.delay(150);
		robot.keyRelease(jump);
		robot.delay(500);
		robot.keyPress(jump);
		robot.delay(150);
		robot.keyRelease(jump);
		robot.delay(500);
		robot.keyRelease(left);
		
		robot.delay(200);
		robot.keyPress(right);
		robot.delay(800);
		robot.keyPress(jump);
		robot.delay(150);
		robot.keyRelease(jump);
		robot.delay(500);
		robot.keyPress(jump);
		robot.delay(300);
		robot.keyRelease(jump);
		robot.delay(400);
		robot.keyRelease(right);
		
		robot.delay(timeDelay);
		robot.keyRelease(run);
		
		this.nextLevel();
	}

}


