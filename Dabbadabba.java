/**
 * The Dabbadabba program creates the rocky steps with
 * a Constant STEPS controling the steps drawn. 
 *
 * @author Grinnell College
 * @version 2.0
 * @since 2017-08-28
 */
public class Dabbadabba {

    public static final int STEPS = 3;
    /**
     * The foo function is intended to print out dashes 
     * based on STEPS
     * @param: NULL
     * @return: NULL
     */
    public static void foo() {
        for (int i = 0; i < (STEPS + 1) * 2 + 1; i++) {
            System.out.print("-");
        }
    }
    /**
     * The bippityBop makes "---------| %    % |---------"
     * @param: NULL
     * @return: NULL
     */
    public static void bippityBop() {
        foo();
        System.out.print("| %");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        } 
	System.out.print("% |" );
	foo();
	System.out.println();
    }
    /**
     * The foo_Bop  makes " o o o o | %    % | o o o o "
     * @param: NULL
     * @return: NULL
     */
    public static void foo_Bop() {
        bippityBop();
        for (int i = 0; i < STEPS + 1; i++) {
	    System.out.print(" o");
	}
        System.out.print(" | %");
        for (int i = 0; i < 4; i++) {
	    System.out.print(" ");
	}
        System.out.print("% | ");
        for (int i = 0; i < STEPS + 1; i++){
	    System.out.print("o ");
	}
        System.out.println();
        bippityBop();
    }
    /**
     * The function draws the steps as follow
     *" ~^~^~^~^~/--------\~^~^~^~^~
     *  ^~^~^~^~/----------\~^~^~^~^
     *          |==========|"
     *
     * @param: NULL
     * @return: NULL
     */
    public static void drawSteps() {
	for (int i = 0; i < STEPS; i++) {
            for (int j = 0; j < (STEPS + 1)-i; j++) {
                System.out.print("~^"); 
	    }
            System.out.print("~/");
            for (int j = 0; j < 8 + 4 * i; j++) {
		System.out.print("-");
            }
            System.out.print("\\~");
            for (int j = 0; j < (STEPS + 1) - i; j++) {
                System.out.print("^~");
            }
            System.out.println();
            for (int j = 0; j < (STEPS + 1) - i; j++) {
                System.out.print("^~");
            }
            System.out.print("/");
            for (int j = 0; j < 10 + 4 * i; j++) {
                System.out.print("-"); 
	    }
            System.out.print("\\");
            for (int j = 0; j < (STEPS + 1) - i; j++) {
                 System.out.print("~^");
            }
            System.out.println();
            for (int j = 0; j < (STEPS + 1) * 2 - (2 * i); j++) {
                 System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < 10 + 4 * i; j++) {
                 System.out.print("=");
            }
            System.out.print("|");
            System.out.println();
	}
    }

    /**
     * The main function draws a Dabbadabba based on STEPS
     * while using all the function above
     * @param: NULL
     * @return: NULL
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (STEPS + 1) * 2 + (5 - i); j++) {
        	System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i; j++) {
        	System.out.print("/\\"); 
	    }
            System.out.println("\\");
        }
        foo_Bop();
        drawSteps();
        System.out.print("   /");
        for (int i = 0; i < 12 + 4 * (STEPS - 1); i++) {
            System.out.print(" ");
        }
        System.out.print("\\"); 
	System.out.println(); 
	System.out.print("  /  ");
        for (int i = 0; i < 10 + 4 * (STEPS - 1); i++) {
            System.out.print("=");
        }
        System.out.print("  \\");
	System.out.println(); 
	System.out.print(" /  / ");
        for (int i = 0; i < 8 + 4 * (STEPS - 1); i++) { 
	System.out.print("\""); 
	}
        System.out.print(" \\  \\");
        System.out.println();
        System.out.print("|  | ");
        for (int i = 0; i < 10 + 4 * (STEPS - 1); i++) {
	    System.out.print("\"");
	}
        System.out.print(" |  |");
        System.out.println();
        System.out.print(" \\  \\ ");
        for (int i = 0; i < 8 + 4 * (STEPS - 1); i++){
            System.out.print("\"");
	}
        System.out.print(" /  /"); 
	System.out.println();
        System.out.print("  \\  ");
        for (int i = 0; i < 10 + 4 * (STEPS - 1); i++) {
            System.out.print("=");
        }
        System.out.print("  /");
        System.out.println();
        System.out.print("   \\");
        for (int i = 0; i < 12 + 4 * (STEPS - 1); i++) { 
	System.out.print("_"); 
	}
        System.out.println("/");
    }
}
