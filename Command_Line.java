package infytq1;

public class Command_Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = Integer.parseInt(args[0]);
		System.out.println("Integer : "+i);
		float f = Float.parseFloat(args[1]);
		System.out.println("Float : "+f);
		
		String s = args[2];
		System.out.println("String : "+s);
		char c= args[3].charAt(0);
		System.out.println("Char : "+c);
		
	}

}
