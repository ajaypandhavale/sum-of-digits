import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number to perform digti addition");
		int digit,sum=0,num=sc.nextInt();
		
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			sum+=digit;
			
		}
		System.out.println("The sum of digits is "+sum);

	}

}
