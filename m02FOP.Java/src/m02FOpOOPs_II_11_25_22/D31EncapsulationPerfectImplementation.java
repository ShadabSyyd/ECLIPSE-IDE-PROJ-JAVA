package m02FOpOOPs_II_11_25_22;


//A Account class which is a fully encapsulated c
//It has a private data member and getter and setter as public

class Account {

//private data members
private long acc_no; 
private String name, email; 
private float amount;

//public getter and setter methods.
public long getAcc_no() {
return acc_no;
}

public void setAcc_no (long acc_no){ 
this.acc_no = acc_no;
}

public String getName() {
return name;
}

public void setName(String name){ 
this.name = name;
}

public String getEmail() {
return email;
} 
public void setEmail (String email) {
this.email=email;
}



public float getAmount() {
return amount;
}

public void setAmount (float amount){ 
this.amount=amount;
}
}


//A Java class to test the encapsulated class Acc 

public class D31EncapsulationPerfectImplementation { 
public static void main(String[] args) {

//creating instance of Account class
Account acc=new Account(); 
//setting values through setter methods

acc.setAcc_no(19471508L);
acc.setName("\n Virat Kohli");

acc.setEmail("\n VK@xyz.com\n"); acc.setAmount (18000f);

//Getting values through getter methods

System.out.println(" "+acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
}
}
