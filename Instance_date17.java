package infytq1;

 class Instance_date17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  x ; //local variable
		x=10;
		if(x==10) {
			int y=20; //local variable , l=know only in if block 
			System.out.println("X and : " +x +y);
			
		}
//		y=5; It gives error because y is known only in if block 
//		x is known here
		System.out.println("x :" +x);
		
		
	}

}
