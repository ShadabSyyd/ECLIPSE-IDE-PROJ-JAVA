package m01FOPWeek1LiveClass;
class ClassB{
    public int x;
    private int y;                                                    
    void cal(int a, int b){
     x =  a + 1;
     y =  b;                                                    
     }
}
public class ClassA {
      public static void main(String args[]){
      ClassB obj = new ClassB();   
      obj.cal(2, 3);
      System.out.println(obj.x + " " + obj.y);   
      }
}