package levels.theHospital;


import java.awt.Robot;

import levels.Level;

public class Level2 extends Level{

	public Level2(Robot robot){
		super(robot);
	}

	public void run(){
		robot.keyPress(run);
		robot.delay(timeDelay);
		
		//Saut vers le mur de droite
		robot.keyPress(right);
		robot.delay(1500);
		robot.keyRelease(right);
		robot.delay(timeDelay);
		
		//Saut vers le milieu pour la bandage
		robot.keyPress(jump);
		robot.delay(100);
		robot.keyPress(left);
		robot.delay(50);
		robot.keyRelease(jump);
		robot.delay(50);
		robot.keyRelease(left);
		
		//Stabilisation au milieu
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(300);
		robot.keyRelease(right);
		
		//Retour mur de droite
		robot.delay(300);
		robot.keyPress(right);
		robot.delay(620);
		robot.keyRelease(right);
		
		//Saut mur de gauche
		robot.delay(150);
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(left);
		robot.delay(300);
		robot.keyRelease(jump);
		robot.delay(1000);
		robot.keyRelease(left);
		
		robot.keyPress(jump);
		robot.delay(timeDelay);
		robot.keyPress(right);
		robot.delay(200);
		robot.keyRelease(jump);
		robot.delay(1000);
		robot.keyRelease(right);
		
		robot.delay(timeDelay);
		robot.keyRelease(run);
		
		this.nextLevel();
	}

}


