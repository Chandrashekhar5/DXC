package JavaAssign;

public class LargestSmallestNumber {
	public static void main(String[] args) {
		//array of 10 numbers
		 int arr[] = new int[]{2,56,86,89,100,27,21,34};
		 
		 //assign first element of an array to largest and smallest
		 int smallest = arr[0];
		 int largest = arr[0];
		 
		 for(int i=1; i< arr.length; i++)
		 {
		 if(arr[i] > largest)
		 largest = arr[i];
		 else if (arr[i] < smallest)
		 smallest = arr[i];
		 
		 }
		 System.out.println("Smallest Number is : " + smallest);
		 System.out.println("Largest Number is : " + largest); 
	}

}
