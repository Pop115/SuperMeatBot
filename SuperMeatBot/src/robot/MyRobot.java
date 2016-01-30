package robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;

import levels.Level;
import levels.theHospital.Level2;
import levels.theHospital.Level3;


public class MyRobot {
	Robot robot;
	
	ArrayList<Level> levelList = new ArrayList<Level>();

	public MyRobot(){
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
//		Level1 level1 = new Level1(robot);
//		Level2 level2 = new Level2(robot);
//		Level3 level3 = new Level3(robot);
//		Level4 level4 = new Level4(robot);
		
		
//		levelList.add(level1);
//		levelList.add(level2);
//		levelList.add(level3);
//		levelList.add(level4);
		
		Level2 level2 = new Level2(robot);
		Level3 level3 = new Level3(robot);
		
		levelList.add(level2);
		levelList.add(level3);

	}
	
	public void run(){
		System.out.println("----ROBOT RUN----");
		this.getFocus();
		
		for(Level  t : levelList){
			System.out.println(t.getLevelName());
			t.start();
			while(t.getState() != Thread.State.TERMINATED){

			}
			System.out.println("Niveau terminé");

		}
		
	}
	
	public void getFocus(){
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
}