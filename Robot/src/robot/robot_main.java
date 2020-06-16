package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.io.IOException;


public class robot_main {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.out.println("This is the main class");
		
		// Ejemplo sleep
		Thread.sleep(5000);
		
		// Ejemplo right clic
		/*rightbut Mouse_Event = new rightbut();
		Mouse_Event.single_action();
		Thread.sleep(5000);*/
		
	 	// Ejemplo left clic
		//leftbut Mouse_Event2 = new leftbut();
		//Mouse_Event2.single_action();
		//Thread.sleep(5000);
	
		// Ejemplo mover raton (x,y)
		/*moveto Mouse_Event3 = new moveto();
		Mouse_Event3.coords_setter(100, 200);
		System.out.println(Mouse_Event3.coords_getter());
		Mouse_Event3.single_action();
		Thread.sleep(5000);*/
		
		// Ejemplo escritura
		//writeto Keyboard_Event = new writeto();
		//Keyboard_Event.single_action("juan franco");
		//Keyboard_Event.single_action("ENTER");
	   
		//********************************
		//	Screenshot example
		//********************************
		screenshot SC = new screenshot();
		SC.set_path("D:/JFRANCO/Escritorio/");
		SC.set_title("CAP1");
		System.out.println(SC.get_path());
		System.out.println(SC.get_title());
		screenshot.single_action();
		
		Thread.sleep(5000);
		
	}
}
