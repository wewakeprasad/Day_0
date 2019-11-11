import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class randomNumber {
		static int findDifference(ArrayList<Integer>arr) {
			Collections.sort(arr,Collections.reverseOrder());
			System.out.println(arr);
			int evenSum=0;
			int oddSum=0;
			String greaterSum="";
			for(int i=0;i<arr.size();i++) {
				if(i==0||i==1) {
					if(i==0) {
						//even
						evenSum+=arr.indexOf(i);
						
					}
					else
						if(i==1) {
							//odd
							
							oddSum+=arr.indexOf(i);
							
						}
					if(evenSum>oddSum) {
						greaterSum="evenSum";
					}
					else {
						greaterSum="oddSum";
					}
					continue;
				}
				else {
					if(greaterSum.equals("evenSum")) {
						oddSum+=arr.indexOf(i);
					}
					else {
						evenSum+=arr.indexOf(i);
					}
				}
				
			}
			System.out.println(arr);
//			System.out.println(evenSum);
//			System.out.println(oddSum);
			int difference=evenSum-oddSum;
			 return difference >0 ? difference :-difference;
			
			//return 0;
			
		}
	
		public static void main(String args[]) {

			Random rand = new Random(); 
			//int array[]=new int[10];
			for(int i=1;i<=20;i++) {
				int  r1=rand.nextInt(11);
				int r=1;
				//String yy="";
				ArrayList<Integer> arr = new ArrayList<Integer>();
				for(int j=1;j<=r1;j++) {
					int x=rand.nextInt(10);
					arr.add(x);
					
				}
//				System.out.println(i+" "+arr);
				//findDifference(arr);
//				System.out.println("Difference = "+findDifference(arr));
//				System.out.println("-------------");
				
			}
		}

}
