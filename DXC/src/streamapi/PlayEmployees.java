package streamapi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lambdaexpressions.collections.Employee;

public class PlayEmployees {
	
    public static void main(String[] args) {
 
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("nitigna",1234));
		empList.add(new Employee("sriniva",3456));
		empList.add(new Employee("lahari",4332));
		empList.add(new Employee("bapji",4567));
		empList.add(new Employee("chandra",7890));
		empList.add(new Employee("gayathri",4599));
		
		/*System.out.println(empList);
		 //List<Employee>	sortedList = empList.stream().sorted().collect(Collectors.toList());
		
		Comparator<Employee> c = (e1,e2) ->  {
			return 
				(e1.salary < e2.salary)?  -1 
				:(e1.salary > e2.salary)? +1
				: 0;
			};
			List<Employee>	sortedList = empList.stream().sorted(c).collect(Collectors.toList());

			System.out.println(sortedList);*/
		
		Predicate <Employee> p = e->e.name.startsWith("a");
		boolean b = empList.stream().anyMatch(p);
		System.out.println(b);
		
	}

}
