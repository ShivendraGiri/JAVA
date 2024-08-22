package infytq1;
import java.io.DataInputStream;
public class DataInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		DataInputStream in = new DataInputStream(System.in);
		System.out.print("Enter any Integer :");
		int i = Integer.parseInt(in.readLine());
		System.out.println("Integer : " +i);
		
		System.out.print("Enter any Float number : ");
		float f = Float.parseFloat(in.readLine());
		
		System.out.print("Enter any String : ");
		String s =  in.readLine();
		System.out.println("String : "+s);
		
		System.out.print("Enter any Character :");
		char c=(char) (in.read());
		System.out.println("Character :"+c);
	}

}
