package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class moveto {
	
	private int X,Y;
	
	public moveto() {
		// Constructor
		System.out.println("Moving to...");
		// Inicialize by default
	}
	public void coords_setter(int c_X, int c_Y) {
		// Setter
		X=c_X;
		Y=c_Y;
	}
	public String coords_getter() {
		// Getter
		return "Cursor moved to... X="+X+"; Y="+Y;
	}
	public void single_action () throws AWTException {
		
		System.out.println("Single action");
        //instance of clase Robot
        Robot robot = new Robot();
 
        //move to x,y defined in setter
        robot.mouseMove(X, Y);
	}
}
