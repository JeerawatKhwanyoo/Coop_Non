class Student{
    private int age;
    private String name;
    Student(){
        System.out.println("Hi");
    }
    Student(String name){
        setName(name);
    }
    Student(String name, int age){
        setName(name);
        setAge(age);

    }

    public String getName(){
        return this.name;  
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
         return this.age;
    }
    public void setAge(int age){
       this.age = age;
    }


}


public class Sample{
    public static void main(String[] args){
        Student s = new Student("John");
        Student a = new Student("John",30);
        System.out.println("Name: "+s.getName());
        System.out.println("Name: "+a.getName()+" "+a.getAge());
    }
}