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
    	//System.out.println(cadena.toString());
    	
    	if (cadena.equals("ENTER")) {
			System.out.println("Typing ENTER...");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(250);
    	} else {
    		
    	
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
    				System.out.println("Typing b...");
    				robot.keyPress(KeyEvent.VK_B);
    				robot.keyRelease(KeyEvent.VK_B);
    				robot.delay(250);
    				break; 
    			case 'c': 
    				System.out.println("Typing c...");
    				robot.keyPress(KeyEvent.VK_C);
    				robot.keyRelease(KeyEvent.VK_C);
    				robot.delay(250);
    				break; 
    			case 'd': 
    				System.out.println("Typing d...");
    				robot.keyPress(KeyEvent.VK_D);
    				robot.keyRelease(KeyEvent.VK_D);
    				robot.delay(250);
    				break; 
    			case 'e': 
    				System.out.println("Typing e...");
    				robot.keyPress(KeyEvent.VK_E);
    				robot.keyRelease(KeyEvent.VK_E);
    				robot.delay(250);
    				break; 
    			case 'f': 
    				System.out.println("Typing f...");
    				robot.keyPress(KeyEvent.VK_F);
    				robot.keyRelease(KeyEvent.VK_F);
    				robot.delay(250);
    				break; 
    			case 'g': 
    				System.out.println("Typing g...");
    				robot.keyPress(KeyEvent.VK_G);
    				robot.keyRelease(KeyEvent.VK_G);
    				robot.delay(250);
    				break; 
    			case 'h': 
    				System.out.println("Typing h...");
    				robot.keyPress(KeyEvent.VK_H);
    				robot.keyRelease(KeyEvent.VK_H);
    				robot.delay(250);
    				break; 
    			case 'i': 
    				System.out.println("Typing i...");
    				robot.keyPress(KeyEvent.VK_I);
    				robot.keyRelease(KeyEvent.VK_I);
    				robot.delay(250);
    				break; 
    			case 'j': 
    				System.out.println("Typing j...");
    				robot.keyPress(KeyEvent.VK_J);
    				robot.keyRelease(KeyEvent.VK_J);
    				robot.delay(250);
    				break; 
    			case 'k': 
    				System.out.println("Typing k...");
    				robot.keyPress(KeyEvent.VK_K);
    				robot.keyRelease(KeyEvent.VK_K);
    				robot.delay(250);
    				break; 
    			case 'l': 
    				System.out.println("Typing l...");
    				robot.keyPress(KeyEvent.VK_L);
    				robot.keyRelease(KeyEvent.VK_L);
    				robot.delay(250);
    				break; 
    			case 'm': 
    				System.out.println("Typing m...");
    				robot.keyPress(KeyEvent.VK_M);
    				robot.keyRelease(KeyEvent.VK_M);
    				robot.delay(250);
    				break; 
    			case 'n': 
    				System.out.println("Typing n...");
    				robot.keyPress(KeyEvent.VK_N);
    				robot.keyRelease(KeyEvent.VK_N);
    				robot.delay(250);
    				break; 
    			case 'o': 
    				System.out.println("Typing o...");
    				robot.keyPress(KeyEvent.VK_O);
    				robot.keyRelease(KeyEvent.VK_O);
    				robot.delay(250);
    				break; 
    			case 'p': 
    				System.out.println("Typing p...");
    				robot.keyPress(KeyEvent.VK_P);
    				robot.keyRelease(KeyEvent.VK_P);
    				robot.delay(250);
    				break; 
    			case 'q': 
    				System.out.println("Typing q...");
    				robot.keyPress(KeyEvent.VK_Q);
    				robot.keyRelease(KeyEvent.VK_Q);
    				robot.delay(250);
    				break; 
    			case 'r': 
    				System.out.println("Typing r...");
    				robot.keyPress(KeyEvent.VK_R);
    				robot.keyRelease(KeyEvent.VK_R);
    				robot.delay(250);
    				break; 
    			case 's': 
    				System.out.println("Typing s...");
    				robot.keyPress(KeyEvent.VK_S);
    				robot.keyRelease(KeyEvent.VK_S);
    				robot.delay(250);
    				break; 
    			case 't': 
    				System.out.println("Typing t...");
    				robot.keyPress(KeyEvent.VK_T);
    				robot.keyRelease(KeyEvent.VK_T);
    				robot.delay(250);
    				break; 
    			case 'u': 
    				System.out.println("Typing u...");
    				robot.keyPress(KeyEvent.VK_U);
    				robot.keyRelease(KeyEvent.VK_U);
    				robot.delay(250);
    				break; 
    			case 'w': 
    				System.out.println("Typing w...");
    				robot.keyPress(KeyEvent.VK_W);
    				robot.keyRelease(KeyEvent.VK_W);
    				robot.delay(250);
    				break; 
    			case 'x': 
    				System.out.println("Typing x...");
    				robot.keyPress(KeyEvent.VK_X);
    				robot.keyRelease(KeyEvent.VK_X);
    				robot.delay(250);
    				break; 
    			case 'y': 
    				System.out.println("Typing y...");
    				robot.keyPress(KeyEvent.VK_Y);
    				robot.keyRelease(KeyEvent.VK_Y);
    				robot.delay(250);
    				break; 
    			case 'z': 
    				System.out.println("Typing z...");
    				robot.keyPress(KeyEvent.VK_Z);
    				robot.keyRelease(KeyEvent.VK_Z);
    				robot.delay(250);
    				break; 
    			case ' ': 
    				System.out.println("Typing space...");
    				robot.keyPress(KeyEvent.VK_SPACE);
    				robot.keyRelease(KeyEvent.VK_SPACE);
    				robot.delay(250);
    				break; 
    			default:System.out.println("ERROR! Character not defined "+character);;break;
    		}
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
