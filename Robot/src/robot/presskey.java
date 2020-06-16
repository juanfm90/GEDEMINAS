package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class presskey {
    public static void main(String[] args) throws AWTException {
        //instanciamos un robot
        Robot robot = new Robot();
 
        //abrir el menú inicio en windows
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
    }
}
