package w03_02_ExceptionHandling;

import java.io.IOException;

public class D08ThrowsClauseMainClass {
	
	public static void main(String[] args) { 
		D08throwsClauseImplementation helper= new D08throwsClauseImplementation();
	
		try { 
			helper.readFile();
		} catch (IOException e) {
	
			// TODO Auto-generated catch block
	
			e.printStackTrace();
		}
	}
}