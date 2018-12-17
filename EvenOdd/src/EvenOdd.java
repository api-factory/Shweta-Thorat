import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. to check whether it is even or odd :");
		n =sc.nextInt();
		if(n>=2){
			if(n%2==0){
				System.out.println(n + "is an even no.");
			}
			else{
				System.out.println(n + "is an odd no.");
			}
		}
		else{
			System.out.println(n+" is neither prime nor composite");
		}
		sc.close();
	}

}
