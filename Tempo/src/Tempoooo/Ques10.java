package Tempoooo;


//public class Ques10
public class Ques10

{

    private int data = 5;

  

    public int getValue()

    {

        return this.data;

    }

    public int getValue(int value)

    {

        return (data+1);

    }

    public int getValue(int... value)

    {

        return  (data+2);

    }

  

    public static void main(String[] args)

    {

    	Ques10 temp = new Ques10();

        System.out.println(temp.getValue(7, 8, 12));

    }

}

