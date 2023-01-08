package w03_02_ExceptionHandling;

import java.io.IOException;

public class D04FinallyMainClass {

public static void main(String[] args){ 
	D04FinallyMethod helper = new D04FinallyMethod();

try {

helper.readFile();

} catch (IOException e) {

// TODO Auto-generated catch block

e.printStackTrace();
}
}
}
