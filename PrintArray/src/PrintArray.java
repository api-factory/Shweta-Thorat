import java.util.Scanner;

public class PrintArray {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements in an array : ");
		for(int i=0; i<n;i++){
			a[i] =sc.nextInt();
		}
		
		for(int i=0; i<n;i++){
			System.out.print(" " +a[i]);
		}
		sc.close();
	}
}
