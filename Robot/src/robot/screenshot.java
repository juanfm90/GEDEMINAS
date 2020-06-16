package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
 
public class screenshot {
	private static String FOLDER;
	private static String TITLE;
	
	public screenshot() {
		// Constructor
		System.out.println("Taking screenshot: Folder and title should be defined");
	}
	
	public static void single_action () throws AWTException, IOException {

		// instance of Robot class
	    Robot robot = new Robot();
	    
	    // obtain screen as Image Bufferedtype
	    BufferedImage pantalla = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	    
	    // seting location defined with setter
	    File file = new File(FOLDER+TITLE);
	    
	    // saving screenshot
	    ImageIO.write(pantalla, "jpg", file);
	}
	
	public void set_path (String PATH_SC) {
		// setter for PATH
		FOLDER=PATH_SC;
	}
	public String get_path () {
		// getter for PATH
		return FOLDER;
	}
	public void set_title (String TITLE_SC) {
		// setter for PATH
		TITLE=TITLE_SC;
	}
	public String get_title () {
		// getter for TITLE
		return TITLE;
	}

}
