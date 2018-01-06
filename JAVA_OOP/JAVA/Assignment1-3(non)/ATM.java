import java.util.Scanner;
import java.math.*;

public class ATM {
	public static void main(String[] args) {
		boolean log;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Username: ");
			String user = sc.next();
			System.out.print("Password: ");
			String pass = sc.next();
			log = new ATM().login(user, pass);

		} while (!log);

		new ATM().menu();

	}

	private String username1 = "user001";
	private String username2 = "user002";
	private String password1 = "pass01";
	private String password2 = "pass02";

	static BigDecimal cashBalance1 = new BigDecimal(0);
	static BigDecimal cashBalance2 = new BigDecimal(0);

	private static boolean user1IsLogin = false; //สำหรับ check ว่า user login อยู่หรือไม่
	private static boolean user2IsLogin = false; //สำหรับ check ว่า user login อยู่หรือไม่

	public boolean login(String username, String password) {
		if (username.equals(username1) && password.equals(password1)) {
			user1IsLogin = true;
			System.out.println("User1 Active now: " + user1IsLogin);
			return true;

		} else if (username.equals(username2) && password.equals(password2)) {
			user2IsLogin = true;
			System.out.println("User2 Active now: " + user2IsLogin);
			return true;
		} else {
			return false;
		}

	}

	public void menu() {

		System.out.println("-------Menu-------");
		System.out.println("1.deposit");
		System.out.println("2.withdraw money");
		System.out.println("3.Balance");
		System.out.println("4.logout");
		System.out.println("------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Select menu: ");
		int select = scanner.nextInt();

		BigDecimal depositAmount = new BigDecimal(0);
		BigDecimal withdrawMoney = new BigDecimal(0);

		if (select == 1) {
			if (user1IsLogin) {
				System.out.print("deposit your amount: ");
				depositAmount = scanner.nextBigDecimal();
				deposit(username1, depositAmount);

			} else if (user2IsLogin) {

				System.out.print("deposit your amount: ");
				depositAmount = scanner.nextBigDecimal();
				deposit(username1, depositAmount);

			}

		} else if (select == 2) {
			if (user1IsLogin) {

				do {
					System.out.print("withdraw money: ");
					withdrawMoney = scanner.nextBigDecimal();

				} while (withdrawMoney.compareTo(cashBalance1) > 0);
				withdraw(username1, withdrawMoney);

			} else if (user2IsLogin) {

				do {
					System.out.print("withdraw money: ");
					withdrawMoney = scanner.nextBigDecimal();

				} while (withdrawMoney.compareTo(cashBalance2) > 0);
				withdraw(username1, withdrawMoney);

			}

		} else if (select == 3) {

			if (user1IsLogin) {
				System.out.println("Amount: " + cashBalance1);
				menu();
			} else if (user2IsLogin) {

				System.out.println("Amount: " + cashBalance2);
				menu();

			}

		} else if (select == 4) {
			if (user1IsLogin) {
				System.out.println("user1 is logout ");
				logout(username1);

			} else if (user2IsLogin) {
				System.out.println("user2 is logout ");
				logout(username2);

			}
		}
	}

	public BigDecimal deposit(String username, BigDecimal deposit) {
		BigDecimal cashBalance = new BigDecimal(0);

		if (user1IsLogin) {
			cashBalance1 = cashBalance1.add(deposit);
			cashBalance = cashBalance1;
			System.out.println("Amount: " + cashBalance);
			menu();

		} else if (user2IsLogin) {
			cashBalance2 = cashBalance2.add(deposit);
			System.out.println("Amount: " + cashBalance2);
			menu();

		}
		return cashBalance;

	}

	public BigDecimal withdraw(String username, BigDecimal deposit) {
		BigDecimal cashBalance = new BigDecimal(0);
		if (user1IsLogin) {
			cashBalance1 = cashBalance1.subtract(deposit);
			cashBalance = cashBalance1;
			System.out.println("Amount: " + cashBalance);
			menu();

		} else if (user2IsLogin) {
			System.out.println("Hi");
			cashBalance2 = cashBalance2.subtract(deposit);
			cashBalance = cashBalance2;
			System.out.println("Amount: " + cashBalance2);
			menu();

		}
		return cashBalance;

	}

	public boolean logout(String username) {
		boolean logoutStatus = false;
		if (user1IsLogin) {
			logoutStatus = true;

		} else if (user2IsLogin) {
			logoutStatus = true;

		}
		return logoutStatus;

	}

}
