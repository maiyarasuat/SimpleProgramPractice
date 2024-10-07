package SimplePrograms;

import java.util.Arrays;

public class RemoveNumberInArray {
	
	//
	public static void main(String[] args) {
		
		
		int p[] = {22,24,44,45,96,100};
				
			int a[] = new int[p.length-1];
			
			int j = 0;
			
			for(int i=0; i < p.length; i++) {
				
				if (p[i]!=45) {
					a[j] = p[i];
					j++;
				}
				
			}
		
		System.out.println(Arrays.toString(a));
			//System.out.println(j);
			
	}

}
