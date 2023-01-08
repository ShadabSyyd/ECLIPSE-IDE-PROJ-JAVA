package w03_02_ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D04FinallyMethod{

public void readFile() throws IOException {

FileReader file = null; 
BufferedReader fileInput = null;

try {

file = new FileReader("W:\\\\GLR JAV FILES\\\\ECLIPSE IDE PROJECTS\\\\OTHER\\\\FinallyExceptionHandling.txt"); 
fileInput = new BufferedReader (file);

for (int counter = 0; counter < 3; counter++) { 
System.out.println(fileInput.readLine());
}
}catch (FileNotFoundException e) {

System.out.println("Caught  FileNotFoundException: " + e.getMessage());

} finally {
if (fileInput != null) {
System.out.println("closing the buffered reader");

fileInput.close();
}
else {
System.out.println("buffered reader is null, no need to close");
}

if(file != null) { 
System.out.println("closing the file reader");
file.close();
}else{
System.out.println("file reader is null, no need to close");
}
}
}
}