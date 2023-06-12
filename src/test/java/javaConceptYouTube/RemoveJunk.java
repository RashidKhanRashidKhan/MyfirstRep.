package javaConceptYouTube;

import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class RemoveJunk {

	public static void main(String[] args) {

          String S=" !@#$%^& Half girl: Wr%^#$#iter Name is= 'Chatan Bhagat'";
          
          S=S.replaceAll("[^a-zA-Z0-9]", " ");
          System.out.println(S);
          

	}

}
