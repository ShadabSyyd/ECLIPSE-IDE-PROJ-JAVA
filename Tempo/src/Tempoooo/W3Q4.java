package Tempoooo;

public class W3Q4{
    int function (int n){
        int result;
        if (n ==0)  { return n++; }
        //your code comes here
        result = function (n - 1);
        return result;
  }
}
class RecursionImplementation122{
    public static void main(String args[]){
    	W3Q4 obj = new W3Q4() ;
        System.out.print(obj.function(12));
     }
}

