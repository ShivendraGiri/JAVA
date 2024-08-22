package infytq1;
import java.io.Console;
public class PrgClass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Console in = System.console();
System.out.print("Enter any Integer :");
	int i = Integer.parseInt(in.readLine());
	System.out.println("Integer : +i");
	System.out.print("Enter any FLoat Number :");
	float f =Float.parseFloat(in.readLine());
	System.out.println("FLoat :" +f);
	
	System.out.println("Enter any String :");
	String s = in.readLine();
	System.out.println("String :" +s);
	
	System.out.println("Enter any Character :");
	char  c= (in.readLine()).charAt(0);
	System.out.println("CHaracter " +c);
	
	System.out.print("Enter the Password :");
	char [] pass=in.readPassword();
	String spass = String.valueOf(pass);
	System.out.println("Passeord :" +spass);
	
	}

}
