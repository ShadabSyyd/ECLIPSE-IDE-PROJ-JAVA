package week3.Basic;

public class P06InfiniteForLoopBreakContinue {
	public static void main(String[] args){
		for(int a=1;;a++){
			if(a>20)
				break;
			else if(a%2!=0)
				continue;
		System.out.println(a);
		}
	}
}

/*
  Program to implement the continue and break functionality

Create a program to print the table of 2. Create an infinite for loop, use continue if number doesn't come in table of 2, and break if the loop variable exceeds 20.

Stub Code

class Main {
public static void main(String[] args) {
int i = 1;
//infinite for loop
for (;; i++) {
//continue if no doesn't come in table of 2
//break if no exceeds 20
//print loop variable

}
}
}
 */