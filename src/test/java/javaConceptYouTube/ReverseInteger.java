package javaConceptYouTube;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int Number=123456789;
		int rev=0;
		
		while(Number !=0) {
			rev=rev*10 + Number%10;
			Number=Number/10;
			
			//System.out.println(rev);
		}
		//System.out.println(rev);
		System.out.println("Reverse Number is:"+" "+rev+" "+"King Khan");
		
		
	}

}
