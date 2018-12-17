import java.util.Scanner;

public class Armstrong {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,s = 0;
		int num = n;
		while(n>0){
			a = n%10;
			s = s + (a*a*a);
			n = n/10;
		}
		
		if ( s==num){
			System.out.println(num + " is an armstrong no.");
		}
		
		else{
			System.out.println(num + " is not an armstrong no.");
		}
		
		sc.close();
	}
}
