package infytq1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferReader {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
public static void  main(String args[]) throws Exception
{
	BufferedReader ab  = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter any Integer :");
	int i = Integer.parseInt(ab.readLine());
	System.out.println("Integer :" +i);
	
	System.out.print("Enter any FLoat Number :");
	float f = Float.parseFloat(ab.readLine());
	System.out.println("Float :" +f);
	
	
	System.out.print("Enter any String :");
	String s = (ab.readLine());
	System.out.println("String :" +s);
	
	System.out.print("Enter any Character :");
	char c = (char)(ab.read());
	System.out.println("Char :" +c);
	
	
	}

}
