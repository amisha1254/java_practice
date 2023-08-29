package task;
import java.util.Scanner;

public class eg1 {
	static Scanner scanner = null;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("enter number of watts");
		int a = scanner.nextInt();
		if(a<=50) {
			System.out.println("your current bill is"+(a*6));
		}else if(a>50 &  a<100) {
			System.out.println("your current bill is"+(a*9));
		}else {
			System.out.println("your current bill is"+(a*11));
		}
		
	    }

	}
