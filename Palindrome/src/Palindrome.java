import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int remainder ,reverse = 0;
		int num = sc.nextInt();
		int Org = num;
		while(num!=0){
			remainder = num%10;
			reverse = reverse *10 + remainder;
			num = num/10;
		}
		
		if(Org==reverse){
			System.out.println(Org + " is palindrome");
		}
		else{
			System.out.println(Org + " is not a palindrome");
		}
		sc.close();
	}
}
