/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akuku
 */
public class Animal {
    protected String name;
    protected int age;

    public void makeSound(){
       System.out.println("The animal makes a sound."); 
    }
    public void makeSound(int times){
        for(int i = 0; i <times; i++){
            makeSound();
        }

    }
    public void eat(){
        System.out.println("The animal is eating");
    }
    public void eat(String foodType){
        System.out.println("The animal is eating" +foodType +".");
    }
}
//The lion class
class Lion extends Animal{
    @Override
   public void makeSound(){
       System.out.println("Roar");
      
    }
   @Override
   public void eat(){
       System.out.println("Eating meat");
   }
}
//The Elephant class
class Elephant extends Animal{
    @Override
   public void makeSound(){
       System.out.println("Trumpet");
      
    }
   @Override
   public void eat(){
       System.out.println("Eating grass");
   }
}
//The Elephant class
class Monkey extends Animal{
    @Override
   public void makeSound(){
       System.out.println("Chatter");
      
    }
   @Override
   public void eat(){
       System.out.println("Eating bananas");
   }
}

//The Zoo class
 class Zoo{
public static void main(String[]args){

Animal animal=new Animal();
Lion lion = new Lion();
Elephant elephant = new Elephant();
Monkey monkey = new Monkey();

//calling methods on the instances of the animals
animal.makeSound();
animal.eat("anything");

lion.makeSound();
lion.eat();

elephant.makeSound();
elephant.eat();

monkey.makeSound();
monkey.eat();
}
}

