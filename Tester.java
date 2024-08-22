package infytq1;
/*
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
import java.util.Scanner;
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
	
 	Scanner sc = new Scanner(System.in);
	int principal,rate , time;
		float interest ;
//			Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal=");
		principal = sc.nextInt();
		System.out.print("Enter the Rate =");
		rate = sc.nextInt();
		System.out.print("Enter the Time=");
		time = sc.nextInt();
		sc.close();
		interest = (principal*rate*time)/100;
	System.out.print("Simple Interest =" +interest);
    // principal = sc.nextFloat();
	}
	
}


