class Animal{  
  void eat(){System.out.println("eating...");}  
  }  
   
  class Cat extends Animal{  
    void meow(){System.out.println("Meowing...");}  
    }  
     
  class Basic{  
  public static void main(String args[]){  
 
 Animal c=new Cat();  
   
  c.eat();
  //c.meow();
 

  }} 