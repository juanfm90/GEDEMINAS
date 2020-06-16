package robot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class writeto {
	//arreglo de teclas para escribir "HOLA MUNDO" en la ventana activa del escritorio
    final static int teclas[] = {
        KeyEvent.VK_H, KeyEvent.VK_O,
        KeyEvent.VK_L, KeyEvent.VK_A,
        KeyEvent.VK_SPACE, KeyEvent.VK_M,
        KeyEvent.VK_U, KeyEvent.VK_N,
        KeyEvent.VK_D, KeyEvent.VK_O
    };
    
    
 
	public writeto() {
		// Constructor
		System.out.println("Implementing left butt");
	}
	
    public static void single_action (String cadena) throws AWTException {
    	
    	//instanciamos la clase Robot
        Robot robot = new Robot();
 
        //esperamos 2 segundos antes de empezar a escribir
        robot.delay(2000);
        
    	int[] teclass = new int[]{0,0,0,0,0,0,0,0,0,0};
    	System.out.println(cadena.toString());
    	
    	for (int i = 0; i < cadena.length(); i++) { 
    		char character = cadena.charAt(i); 
    		System.out.println(character);
    		switch (character) { 
    			case 'a': 
    				System.out.println("Typing a...");
    				robot.keyPress(KeyEvent.VK_A);
    				robot.keyRelease(KeyEvent.VK_A);
    				robot.delay(250);
    				break; 
    			case 'b': 
    				System.out.println("Typing a...");
    				robot.keyPress(KeyEvent.VK_B);
    				robot.keyRelease(KeyEvent.VK_B);
    				robot.delay(250);
    				break; 
    			default:System.out.println("ERROR! Character not defined");;break;
    		}
    	}
    	

    }
    
    private void doType(int... keyCodes) { 
    	doType(keyCodes, 0, keyCodes.length); 
    	}
    
    private void doType(int[] keyCodes, int offset, int length) { 
    	if (length == 0) { 
    		return; 
    		} 
    	//robot.keyPress(keyCodes[offset]); doType(keyCodes, offset + 1, length - 1); 
    	//robot.keyRelease(keyCodes[offset]); 
    }



}
