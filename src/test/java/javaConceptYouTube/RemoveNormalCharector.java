package javaConceptYouTube;

public class RemoveNormalCharector {
	
	public static void main(String[] arg) {
		
		String p="@#$% Please learn Java properly @#$";
		String p1="#$@$# The poorty give pain @$#@#$%";
		
		p=p.replaceAll("[a-zA-Z0-9]",""); 
		System.out.println(p);
		
		//and Space v remove
		p1=p1.replaceAll("[a-zA-Z0-9- ]", "");
		System.out.println(p1);
	  }
         }
	
	
	
	


