package infytq1;
import java.io.*;
import java.util.*;
 class MethodOverloading_Date21 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//class A{
		void Add(int a , int b)
       {
	int result = a+b;
	System.out.println("The sum of a and b :" +result);
       }
       void Add(int a, int b, int c) {
    	   int result =a+b+c;
    	   System.out.println("The sum of a , b and c :" +result);
	}
       void Add(String a, String b) {
    	   String result = a+b;
    	   System.out.println("String :" +result);
       }

}
class MethodOverloading
{
	public static void main(String args[]) {
		MethodOverloading_Date21 obj=new MethodOverloading_Date21();
		obj.Add(5,7);
		obj.Add(5,7,9);
		obj.Add("Hello " , "World!");
	}
}