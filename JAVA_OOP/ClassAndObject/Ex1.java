public class Ex1 {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.Calculate(2);
        r.Calculate(4);
        r.Calculate(6);
        r.Calculate(8);
    }
}

class Robot {

    public void Calculate(int calculate) {
        for (int i = 1; i <= calculate; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
