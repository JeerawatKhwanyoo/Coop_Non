
public class Ex5 {
    public static void main(String[] args) {
        Dog d = new Dog("Dum");
        Collar c = new Collar("yellow");
        d.setCollar(c);
        System.out.println(d.getName() + " owns " + d.getCollar().getColor() + " collar");
        System.out.println("The collar costs " + d.getCollar().getPrice() + " baht");

    }
}

class Dog {
    private String name;
    private Collar collar;

    Dog(String name) {
        setName(name);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

}

class Collar {

    private String color;
    private int price = 200;

    Collar(String color) {
        setColor(color);
    }

    Collar(int price) {
        setPrice(price);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = 200;
    }

}
