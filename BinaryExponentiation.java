import java.util.Scanner;

//Not for negative Numbers

public class BinaryExponentiation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int inputNum=sc.nextInt();
		int inputPower=sc.nextInt();
		System.out.println("Power = "+callPower(inputNum,inputPower));
	}

	private static int callPower(int inputNum, int inputPower) {
		// TODO Auto-generated method stub
		if(inputPower==0)
			return 1;
		else if(inputPower==1)
			return inputNum;
		else if(inputPower%2==0) {
			int temp=callPower(inputNum, inputPower/2);
			return temp*temp;
		}
		else
		{
			int temp=callPower(inputNum, (inputPower-1)/2);
			return temp*temp*inputNum;
		}
	}

}
