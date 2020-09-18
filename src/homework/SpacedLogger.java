package homework;

public class SpacedLogger implements logger {

	@Override
	public void log(String logs) {
		for(int i=0;i<logs.length();i++)
		System.out.print(logs.charAt(i)+" ");
	}

	@Override
	public void error(String errors) {
		String mistake="";
		for(int i=0;i<errors.length();i++) {
			mistake+=( errors.charAt(i)+" ");
			}
		System.out.println("ERROR:"+mistake);

	}
}
