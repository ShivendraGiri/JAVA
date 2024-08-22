package infytq1;
import java.io.*;
import java.util.*;

public class CharacterFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("endsWith() :"+" UNITED COLLEGE".endsWith("COLLEGE"));
		System.out.println("endsWith() :"+" UNITED COLLEGE".endsWith("UNITED"));
		
		System.out.println("StartWith() :" +"UNITED COLLEGE".startsWith("UNITED"));
		System.out.println("StartWith() :" +"UNITED COLLEGE".startsWith("COLLEGE"));
		
		System.out.println("equalsIgnoreCase() : "+" COLLEGE".equalsIgnoreCase("College"));
		System.out.println("equals() :"+"COLLEGE".equals("COLLEGE"));
		
		System.out.println("indexOf() :" +"COLLEGE".indexOf("L"));
		System.out.println("SubString() :"+"UNITED COLLEGE".substring(6));
		
		System.out.println("replace() :"+" OENDRA".replace("O" ,"SHIV"));
		
		

	}

}
