package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class leftbut {
	public leftbut() {
		// Constructor
		System.out.println("Implementing left butt");
	}
	public void single_action () throws AWTException {
		System.out.println("Single action");
        //instanciamos la clase Robot
        Robot robot = new Robot();
 
        //click con el bot�n derecho
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

}
