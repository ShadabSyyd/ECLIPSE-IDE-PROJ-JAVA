package Tempoooo;

public class W3Q3{
    int function(int num)
       {
         int result;
         result = function (num - 1);
         return result;
       }
 }
class RecursionImplementation{
    public static void main(String args[]){
        W3Q3 obj = new W3Q3() ;
        System.out.print(obj.function(20));
      }
}

