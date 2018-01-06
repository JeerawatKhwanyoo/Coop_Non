import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

public class ATM {

    public static Boolean isAdmin = false;
    public static String isUser = null;
    public static Map<String, String> m = new HashMap();
    public static Map<String, BigDecimal> n = new HashMap();
    BigDecimal oldAmount =  new BigDecimal(0);
    public static void main(String args[]) {

        m.put("admin", "admin");
        m.put("user1", "pass1");
        m.put("user2", "pass2");

        new ATM().signin();
    }

    public void signin() {
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

    public Boolean login(String username, String password) {
        if (m.containsKey(username) && password.equals(m.get(username))) {
            if (username.equals("admin")) {
                isAdmin = true;
            } else {

                isUser = username;

            }

            return true;
        }
        return false;
    }

    public void menu() {

        if (isAdmin) {
            System.out.println("[1].listUser [2].add user [3].remove [4].logout");
            Scanner sc = new Scanner(System.in);
            System.out.print("Select Menu: ");
            int s = sc.nextInt();
            switch (s) {
            case 1:
                System.out.println("List User all");
                Listuser();
                menu();

            case 2:
                AddUser();

            case 3:
                RemoveUser();
                menu();

            case 4:
                logout();
                signin();

            default:
                menu();
            }

        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("[1].deposit [2].withdraw money [3].Balace [4].logout");
            System.out.print("Select Menu: ");
            int s = sc.nextInt();
            switch (s) {
            case 1:

                System.out.print("deposit money: ");
                BigDecimal depositAmount = sc.nextBigDecimal();
                deposit(depositAmount);

                menu();

            case 2:
                System.out.print("withdraw money: ");
                BigDecimal withdraw  = sc.nextBigDecimal();
               withdraw(withdraw);
                menu();

            case 3:System.out.println("Amount: "+n.get(isUser));
                    menu();
            case 4:
                logout();
                signin();
            }
        }

    }

    public void Listuser() {
        for(String s: n.keySet()){
            
        }
        System.out.println(n);  
        menu();

    }

    public void RemoveUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Remove user: ");
        String r = sc.next();
        m.remove(r);
        Listuser();
    }

    public void AddUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("user: ");
        String user = sc.next();
        System.out.print("pass: ");
        String pass = sc.next();
        m.put(user, pass);

        menu();
    }

    public boolean logout() {
        boolean logoutStatus = false;
        if (isAdmin) {
            isAdmin = false;
            logoutStatus = true;
        } else {

            logoutStatus = true;
        }
        return logoutStatus;

    }

    public BigDecimal deposit(BigDecimal deposit) {
       

        oldAmount=oldAmount.add(deposit);
        n.put(isUser,oldAmount);
        
        return oldAmount;
    }

    public BigDecimal withdraw(BigDecimal withdraw) {
            oldAmount=oldAmount.subtract(withdraw);
            n.put(isUser,oldAmount);
            
        
        
            
        
        return oldAmount;
    }

}
