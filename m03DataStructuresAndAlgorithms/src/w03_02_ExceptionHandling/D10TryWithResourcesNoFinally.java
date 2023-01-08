package w03_02_ExceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class D10TryWithResourcesNoFinally { 
	public static void main(String args[]) {
	
		String filePath = "W://GLR JAV FILES//ECLIPSE IDE PROJECTS//OTHER//TryWithResources.txt";
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
		
			String content = "Welcome to try-with-resources demo!\nSomething new";
			fileOutputStream.write(content.getBytes());
			System.out.println("content written to file successfully"); 
		} catch (IOException exception) { 
			System.out.println("errorr occured: "+ exception);
		}
	}
}