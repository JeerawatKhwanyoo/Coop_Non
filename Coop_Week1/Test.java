import java.util.Scanner;
public class Test{
	public static void main(String[] args){	
		System.out.println("Hello world");
		Scanner Sc = new Scanner(System.in);
        System.out.print("Insert Name : ");
       	int a = Sc.nextInt();


        if(a%2==0)
        	System.out.println("Even " + a );

        else 
        	System.out.println("false");
	}
	
}
