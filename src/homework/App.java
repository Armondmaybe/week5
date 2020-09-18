package homework;

import java.lang.System.Logger;

public class App {

	public static void main(String[] args) {

		logger asterisk=new AsteriskLogger();
		logger spaced= new SpacedLogger();

		asterisk.log("Hello");
		//Space between outputs
		System.out.println("");
		asterisk.error("Hello");
		
		System.out.println("");
		spaced.log("It Works");
		System.out.println("");
		spaced.error("This an ERROR");
		
		
	}

}
