


class People{
	private String name;
	private int age;
	
	People(String name){
		setName(name);
		setAge(25);
	}
	People(String name, int age){
		setName(name);
		setAge(age);
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;

	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}





public class Ex2{
	public static void main(String[] args) {
		People p1 = new People("John");
		People p2 = new People("Jack",30);
		System.out.println(p1.getName() + " is " + p1.getAge() + " years old. ");
		System.out.println(p2.getName() + " is " + p2.getAge() + " years old. ");
		
	}
}