package infytq1;

public class StingBuffer_D_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1= new StringBuffer("hello");
		StringBuffer s2= new StringBuffer ("World");
		
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		s1.append(s2);
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		
		StringBuffer s3= new StringBuffer("United College ");
		
		StringBuffer s4=new StringBuffer("Of Enginnering And Research");
		s3.insert(13,s4);
		
		System.out.println("S3 :" +s3);
		s3.reverse();
		
		System.out.println("S3 : "+s1);
		s3.delete(8, 11);
		
		System.out.println("S3 : "+s1);
		s3.setCharAt(0, 'T');
		
		System.out.println("S3 : "+s3);
		
		
	}

}
