package m02FOpOOPs_II_11_25_22;


import java.util.*;
//import java.util.Scanner;


public class D34MethodImplementationManualInput{
public static void main(String args[]){
long n,fact=0;
Scanner sc= new Scanner(System.in); //sc created for input
System.out.println("Enter the first number: ");
n=sc.nextLong();
sc.close();
//N=5;

fact=factCal(n);
System.out.println("Factorial= "+fact);
}

static long factCal (long x) {
long fact=1;
if (x==0)
return fact;

for(int i=1;i<=x;i++){
fact=fact*i;
}

return fact;
}
}

