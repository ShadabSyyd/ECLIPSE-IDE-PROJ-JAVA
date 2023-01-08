package Tempoooo;

class ClassA {  

    ClassA(int x) {

        System.out.print(" Constructor called " + x);

    }

}

  

// This class contains an instance of ClassA

class Ques8 {   

    ClassA obj1 = new ClassA(10);  

  

    Ques8(int i) { obj1 = new ClassA(i); }

  

    public static void main(String[] args) {   

    	Ques8 obj2 = new Ques8(5);

    }

}

