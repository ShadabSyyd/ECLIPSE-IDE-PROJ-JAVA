package Tempoooo;

 class ClassB{

    private int data;

    public ClassB(){

        data = 5;

    }  

    public int getData(){

        return this.data;

    }

}

  

class Ques9 extends ClassB{

    private int data;

    public Ques9(){

        data = 6;

    }

    private int getData(){

        return data;

    }

    public static void main(String[] args) {

    	Ques9 myData = new Ques9();

        System.out.println(myData.getData());

    }

}

