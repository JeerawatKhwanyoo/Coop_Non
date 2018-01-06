public class Ex3 {
    public static void main(String[] args) {
        Student s = new Student("Somsak");
        Dog d = new Dog("Dang");
        d.bite(s);
    }

}

class Student {
    private Dog dog;
    private String name;

    Student(String name) {
        this.name = name;
    }

    Student(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Dog {
    private String name;

    Dog(String name) {
        this.name = name;

    }

    public void bite(Student s) {
        System.out.println(name + " Bites " + s.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}