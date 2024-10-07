package SimplePrograms;

import java.util.Arrays;
import java.util.Comparator;

public class StreamFindSecondMaximumNumber {
	
	
	public static void main(String[] args) {
		
		
		int numbers[] = {22,34,45,93,100};
		
		Integer getNumber = Arrays.stream(numbers)
						.boxed() //this method is used to convert numbers[] int to wrapper class Integer
						.sorted(Comparator.reverseOrder())//give descending order
						.skip(1)//1 will skip most largest
						.findFirst()//number which find after skipped 
						.get();//get the filtered number and store in an integer
		
		
		System.out.println(getNumber);
		
		
		
	}
	


	
}
