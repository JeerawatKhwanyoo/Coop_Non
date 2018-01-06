public class Exam {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        s.setName("Somsak");
        s.setTeacher(t);
        s.getTeacher().setName("Preecha");
        System.out.println("Teacher of " + s.getName() + " is " + s.getTeacher().getName());
    }
}

class Student {
    private String name;
    private Teacher teacher;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

class Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
