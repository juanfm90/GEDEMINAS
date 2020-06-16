package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class rightbut {
	public rightbut() {
		// Constructor
		System.out.println("Implementing right butt");
	}
	public void single_action () throws AWTException {
		System.out.println("Single action");
        //instanciamos la clase Robot
        Robot robot = new Robot();
 
        //click con el botón derecho
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
	}
}
