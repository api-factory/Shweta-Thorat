
import java.util.Scanner;
public class Prime {

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = false;
		System.out.println("Enter a no. to check whether it is prime or not :");
		n = sc.nextInt();
		
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=true;
				break;
			}
		}
		
		if(flag==false){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}
		sc.close();
	}
}
