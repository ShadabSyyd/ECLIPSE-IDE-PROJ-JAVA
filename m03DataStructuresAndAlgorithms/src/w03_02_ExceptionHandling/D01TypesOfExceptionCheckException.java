package w03_02_ExceptionHandling;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;//NO Need for Some reason written by Faculty
import java.io.FileReader;
import java.io.IOException;

public class D01TypesOfExceptionCheckException {
	//public static void main(String[] args) throws FileNotFoundException { 
	public static void main(String[] args) throws IOException { //We need to add this throws IOException else java will throw check Exception
		FileReader file =new FileReader("W:\\GLR JAV FILES\\ECLIPSE IDE PROJECTS\\OTHER\\ExceptionsHandelingEX.txt"); //Use to read a file in java in byte representation

		BufferedReader fileInput = new BufferedReader (file);//this class read the file in buffer ie batches so we dont end the runtime memory space in case of big file

		for (int counter = 0; counter < 3; counter++){ 
			System.out.println(fileInput.readLine());
		}
		//Read 3 lines in txt file
		fileInput.close();
	}
}