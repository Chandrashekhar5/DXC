package JavaAssign;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String string = "Lahari reddy lives in hyderabad";
		char arr[] = string.toCharArray();
		String res = "";
		for (char i :arr) {
			if( res.indexOf(i)==-1) {
				res +=i;
			}
		}
		System.out.println("String after removing duplicates is - " + res);
	}

}
