import java.util.Scanner;

public class segregate0and1 {
	
	static int [] segregateZeroAndOne(int array[]) {
		int left=0;
		int right=array.length-1;
		while(left<right) {
			 while (array[left] == 0 && left < right)  
		            left++;  
		  
		        /* Decrement right index while we see 1 at right */
		        while (array[right] == 1 && left < right)  
		            right--;  
		  
		        /* If left is smaller than right then there is a 1 at left  
		        and a 0 at right. Exchange arr[left] and arr[right]*/
		        if (left < right)  
		        {  
		            array[left] = 0;  
		            array[right] = 1;  
		            left++;  
		            right--;  
		        }  
		}
		
		return  array;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lengtOfInputArray=sc.nextInt();
		int InputArray[]=new int[lengtOfInputArray];
		for(int i=0;i<lengtOfInputArray;i++) {
			InputArray[i]=sc.nextInt();
		}
		
		//printing the input
		System.out.println("Input");
		for(int i=0;i<lengtOfInputArray;i++) {
			System.out.println(InputArray[i]);
		}
		
		int result[]=segregateZeroAndOne(InputArray);
		
		//printing the output
				System.out.println("Output");
				for(int i=0;i<lengtOfInputArray;i++) {
					System.out.println(InputArray[i]);
				}

	}

}
