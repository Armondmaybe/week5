package homework;

public class AsteriskLogger implements logger {

	@Override
	public void log(String message) {

		System.out.println("***"+message+"***");
	}

	@Override
	public void error(String errorMessage) {

		System.out.println("*****************"+"\n"+"***Error:"+errorMessage+"***"+"\n"+"*****************");
	}

}
