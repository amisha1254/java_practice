package task2;
import java.util.Scanner;

public class eg2 {
	static Scanner scanner = null;
	public static void main(String[] args) {
	 scanner = new Scanner(System.in);
	 int person1 = scanner.nextInt();
	 int person2 = scanner.nextInt();
	 int a = scanner.nextInt();
	 System.out.println("person one balance before transaction"+person1);
	 System.out.println("person two balance before transaction"+person2);
	 System.out.println("press 1 is person1 to person2"+a);
	 System.out.println("press 2 if person2 to person1"+a);
	 int amount = scanner.nextInt();
	 //System.out.println("please enter the amount"+amount);
	 if(a==1) {
		 System.out.println("person one balance after transaction"+(person1-amount));
		 System.out.println("person two balance before transaction"+(person2+amount));
	 }else {
		 System.out.println("person one balance after transaction"+(person2-amount));
		 System.out.println("person two balance after transaction"+(person1+amount));
	 }
	 
	}

}

