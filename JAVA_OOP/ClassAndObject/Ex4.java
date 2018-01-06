public class Ex4{
    public static void main(String[] args){
        Dog d = new Dog();
            System.out.println("===");
        Cat c = new Cat();
            System.out.println("===");
        Rat r = new Rat("Jerry");
    }
}


class Dog{
    Dog(){
         System.out.println("A Dof is created");
    }
}

class Cat{
    Cat(){
        System.out.println("I'm a Cat");
    }
   
}

class Rat{
private String name;

    Rat(String name){
    
        setName(name);
       System.out.println("I'm "+getName()); 
    }

public String getName(){
    return this.name;
}
public void setName(String name){
    this.name = name;
}

}

