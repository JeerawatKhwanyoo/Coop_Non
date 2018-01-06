
import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class Example {
    public static void main(String[] args) { 
            ArrayList a = new ArrayList();
            
            a.add(new Student("Non"));
            a.add("Jeerawat");
            a.add(23);

            for(Object o : a)
                
            if(o instanceof Student)
                System.out.println(((Student)o).getName ());
                
            else

               System.out.println(o);



    }

}

class Student{
    private String name;
    
    Student(String name){
        this.name = name;
    }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}



