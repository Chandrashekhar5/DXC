package generics;

import java.util.ArrayList;

public class FirstEx {
	public static void main(String[] args) {
		String[] students = new String[3];
		students[0] = "abdul";
		//student[1] = 10;
		students[1]="ansari";
		
		String name = students[0];
		
		ArrayList<String> studentsList = new ArrayList<String>();
		studentsList.add("abdul");
		//studentsList.add(new Integer(10));
		
		System.out.println(studentsList);
		
		String name1 = studentsList.get(1);
		System.out.println(name1);
	}

}
