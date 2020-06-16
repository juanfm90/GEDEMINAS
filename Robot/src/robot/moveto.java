package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class moveto {
	public moveto() {
		// Constructor
		System.out.println("Moving to...");
	}
	public void single_action () throws AWTException {
		System.out.println("Single action");
        //instanciamos la clase Robot
        Robot robot = new Robot();
 
        //move a x,y
        robot.mouseMove(300, 600);
	}
}
