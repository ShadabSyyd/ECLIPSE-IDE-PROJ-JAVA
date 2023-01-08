package w03_02_ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D08throwsClauseImplementation{

	public void readFile() throws IOException {
		//Note: we will throw checked exception or CompiletimeExceptions else there will be a compile time error
		//		But if we throw an exception which is unchecked ie runtime exception like ArithmeticException
		//			then it will not make any sense because we need to correct it in runtime itself
	
		FileReader file = null; 
		BufferedReader fileInput = null;
		
		try {
			file =new FileReader("W:\\GLR JAV FILES\\ECLIPSE IDE PROJECTS\\OTHER\\ThrowsClauseImplementation.txt1");
		
			fileInput = new BufferedReader(file);
		
			for (int counter = 0; counter < 3; counter++) { 
				System.out.println(fileInput.readLine());
			}
		}catch(FileNotFoundException e){
			System.out.println("Caught FileNotFoundException:" + e.getMessage());		
		} finally {
		
			if (fileInput != null) {
				System.out.println("closing the buffered reader"); 
				fileInput.close();
			}else{
				System.out.println("buffered reader is null, no need to close");
			}
			if(file!=null) {
				System.out.println("Closing the file reader");
				file.close();
			}else {
				System.out.println("file reader is null, no need to close");
				
			}
			}
			}
}