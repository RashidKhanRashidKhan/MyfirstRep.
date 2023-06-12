package javaConceptYouTube;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class ReverseString {
	
	public static void main(String[] arg) {
	String	R= "nitiN si eman yM";
	
	
	 int len=R.length(); String rev="";
	 for(int i=len-1; i>=0; i--) {
	 rev=rev+R.charAt(i); 
	 // System.out.println(rev); 
	 
		
	 } 
	System.out.println(rev);
	 
	StringBuffer sf=new StringBuffer(R);	
	System.out.println(sf.reverse());
	
}

}
	
	
	
	
	
	


