package lambdaexpressions.collections;

public class Employee {
	public String name;
	public int eid;

	public Employee(String string, int i) {
		name = string;
		eid = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid +"-"+name;
				//super.toString();
	}

}
