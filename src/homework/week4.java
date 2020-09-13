package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class week4 {

	public static void main(String[] args) {
		
		List<String> employeeNames= new ArrayList<String>();
		employeeNames.add("james");
		employeeNames.add("Derick");
		employeeNames.add("Calob");
		employeeNames.add("Sammy");
		employeeNames.add("Jacob");

		Set<Integer> id=new HashSet<Integer>();
		id.add(001);
		id.add(013);
		id.add(015);
		id.add(0333);
		id.add(213);

		
		Map<Integer,String> employeeMap=new HashMap<Integer,String>();
		
		int i=0;
		for(int number:id) {
			String employee=employeeNames.get(i);
			employeeMap.put(number, employee);
			i+=1;
		}
		for(Integer number:employeeMap.keySet()) {
			System.out.println(number+": "+employeeMap.get(number));
		}
		
		StringBuilder idsBuilder=new StringBuilder();
		for(int number:id) {
			idsBuilder.append(number).append("-");
		}
		idsBuilder.setLength(idsBuilder.length()-1);
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder= new StringBuilder();
		for(String employee:employeeNames) {
			namesBuilder.append(employee).append(" ");
		}
		namesBuilder.setLength(namesBuilder.length()-1);
		System.out.println(namesBuilder.toString());
	}

}
