package robot;

import java.awt.Robot;
import java.awt.AWTException;


public class robot_main {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Esta es la clase main");
		
		// Ejemplo sleep
		Thread.sleep(5000);
		
		// Ejemplo right clic
		rightbut Mouse_Event = new rightbut();
		Mouse_Event.single_action();
		Thread.sleep(5000);
		
	 	// Ejemplo left clic
		leftbut Mouse_Event2 = new leftbut();
		Mouse_Event2.single_action();
		Thread.sleep(5000);
	
		// Ejemplo mover raton (x,y)
		moveto Mouse_Event3 = new moveto();
		Mouse_Event3.single_action();
		Thread.sleep(5000);
		
		// Ejemplo escritura
		writeto Keyboard_Event = new writeto();
		Keyboard_Event.single_action("ababbb");
	
		Thread.sleep(5000);
		
	}
}
