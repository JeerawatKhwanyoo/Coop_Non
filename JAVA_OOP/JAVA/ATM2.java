import java.util.Scanner;
import java.math.*;
public class ATM2{
	
	public static void main(String[] args){
			boolean log;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Username: ");
			String  user = sc.next();
			System.out.print("Password: ");
			String  pass = sc.next();
			log = new ATM2().login(user,pass);
		}while(!log);	
		
			new ATM2().menu();
	
			
		

	}


			private String username1 = "user001"; 
			private String username2 = "user002"; 
			private String password1 = "pass01"; 
			private String password2 = "pass02"; 
			static BigDecimal cashBalance1 = new BigDecimal (0);
			static BigDecimal cashBalance2 = new BigDecimal (0);

			private static boolean user1IsLogin = false; //สำหรับ check ว่า user login อยู่หรือไม่
			private static boolean user2IsLogin = false; //สำหรับ check ว่า user login อยู่หรือไม่



	public  boolean login(String username , String password){
			if(username.equals(username1) && password.equals(password1)){
				System.out.println("User1 is Active now");
				user1IsLogin = true;
				return true;

			}else if(username.equals(username2) && password.equals(password2)){
				System.out.println("User2 is Active now");
				user1IsLogin = true;
				return true;
			}


				return false;


			}

	public  void menu(){
			System.out.println("----------------------Menu-------------------");
			System.out.println("1.Deposit"+" 2.Withdraw Money"+" 3.Balance"+" 4.Logout");
			Scanner sc = new Scanner(System.in);
			System.out.print("Select Number: ");
			int select = sc.nextInt();
			BigDecimal depositamount = new BigDecimal(0);
			BigDecimal withdrawamount = new BigDecimal(0);


			switch(select){
				case 1: if(user1IsLogin){
							System.out.print("Deposit a Money: ");
							depositamount = sc.nextBigDecimal();
							deposit(username1,depositamount);

							menu();
							}else if(user2IsLogin){
							System.out.print("Deposit a Money: ");
							depositamount = sc.nextBigDecimal();
							deposit(username2,depositamount);
							menu();
							}
							break;
				case 2:	if(user1IsLogin){
							System.out.print("Withdraw: ");
							withdrawamount = sc.nextBigDecimal();
							if(withdrawamount.compareTo(cashBalance1)>0){

							}else{
								withdraw(username1,withdrawamount);
							}
							menu();
							}else if(user2IsLogin){
							System.out.print("Withdraw: ");
							withdrawamount = sc.nextBigDecimal();
							if(withdrawamount.compareTo(cashBalance2)>0){

							}else{
								withdraw(username1,withdrawamount);
							}
							
							menu();
							}
							break;
				case 3: if(user1IsLogin){
						System.out.println("Amount: "+cashBalance1);
						}else if(user2IsLogin)
						System.out.println("Amount: "+cashBalance2);
						break;
				case 4: System.out.println("Logout");break;

				default: 
					menu();

			}
	}


	public  BigDecimal deposit(String username , BigDecimal deposit){
			BigDecimal cashBalance = new BigDecimal(0);
				if(user1IsLogin){
					cashBalance1= cashBalance1.add(deposit);
					cashBalance=cashBalance1;
					System.out.println("Amount: "+cashBalance+" Bath");

				}else if(user2IsLogin){
					cashBalance2= cashBalance2.add(deposit);
					cashBalance=cashBalance2;
					System.out.println("Amount: "+cashBalance+" Bath");
				}
				return cashBalance;


	}



	public BigDecimal withdraw(String username , BigDecimal deposit){
			BigDecimal cashBalance = new BigDecimal(0);
				if(user1IsLogin){
					cashBalance1=cashBalance1.subtract(deposit);
					cashBalance=cashBalance1;
					System.out.println("Amount: "+cashBalance+" Bath");

				}else if(user2IsLogin){
					cashBalance2=cashBalance2.subtract(deposit);
					cashBalance=cashBalance2;
					System.out.println("Amount: "+cashBalance+" Bath");

				}
				return cashBalance;
}
}