package infytq1;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter any Integer Number:");
		int i = ab.nextInt();
		System.out.println("Integer :" +i);
		System.out.print("Enter any float number :");
		float f = ab.nextFloat();
		System.out.println("Float :" +f);
		
		System.out.print("Enter any String :");
		String s = ab.next();
	
		System.out.println("String :" +s);
		
		System.out.print("Enter Character :");
		char c =ab.next().charAt(0);
		System.out.println("Character :" +c);
		
		ab.close();
		
	}

}
