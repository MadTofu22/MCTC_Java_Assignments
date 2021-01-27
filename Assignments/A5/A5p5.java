/**
Recursive Fibonacci
Authors: Jack Stutler, Tom Stutler
Last Date Modified: 12/10/15
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class A5p5{
	private static Scanner istream = new Scanner(System.in);
	private static int n, fn;
	private static boolean loop = true;
	
	public static void main(String[] args){
		System.out.println("Fibnoacci number generator\n");
		do{
			try{
				System.out.println("Which one do you want(0 or negative to exit)?");
				n = istream.nextInt();
				if (n<=0){
					System.exit(0);
				}
				System.out.println("\nThe "+n+"th Fibonacci number is "+fib(n));
			}
			catch (InputMismatchException e){
				System.out.println("Please enter a positive integer, or negative to exit");
			}
		}while (loop);
	}
	
	public static int fib(int n){
		if (n==1){
			return 0;
		}else if (n==2){
			return 1;
		}else{
			return (fib(n-1) + fib(n-2));
		}
	}
}
