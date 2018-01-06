import java.util.*;
public class Test {
    public static void main(String[] args) {
       ArrayList a = new ArrayList(); 
       a.add("ABC");
       a.add(new Integer(2));
       a.add(new Student());
       for(Object o : a){
            System.out.printl(o);
       }
    }
    
}



class Student{

}