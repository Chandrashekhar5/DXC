package lambdaexpressions;

import java.util.function.Function;

public class FirstLambda {
	public static void main(String[] args) {
		int sq4 = squareIt(4);
		System.out.println(sq4);
		
		Function<Integer,Integer> f =n -> n*n;
		System.out.println(f.apply(4));
	}
	
	public static int squareIt(int n) {
		return n*n;
	}

}
