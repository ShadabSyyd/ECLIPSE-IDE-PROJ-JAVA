package m02FOpOOPs_II_11_25_22;


class Animal1122{

void eat(){

System.out.println("Animals Eat");
}}

class Herbivores1122 extends Animal1122{ 
void eat(){

System.out.println("Herbivores Eat Plants");

}
}

class Omnivores1122 extends Animal1122{

void eat(){ 
System.out.println("Omnivores Eat Plants and meat");
}}

class D19RunTimePolymorphismExample{

public static void main(String args[]){

Animal1122 A = new Animal1122();

Animal1122 h = new Herbivores1122(); //upcasting--  Herbivores1122 method will run in this example

Animal1122 o = new Omnivores1122(); //upcasting--   Omnivores1122 method will run in this example

A.eat();

h.eat();

o.eat();
}}

/*
Output
Animals Eat
Herbivores Eat plants
Omnivorous Eat plants and meat
*/