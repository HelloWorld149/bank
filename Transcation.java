import java.util.HashMap;
import java.util.Scanner;

public class Transcation {
    public static void deposit(int accNo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deposit value: ");
        double deposit = sc.nextDouble();
        HashMap<Integer, User> hashMap = User.getHashMap();

        User user = hashMap.get(accNo);
        user.setMoney(user.getMoney() + deposit);
    }

    public static void withdraw(int accNo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Withdraw value: ");
        double withdraw = sc.nextDouble();
        HashMap<Integer, User> hashMap = User.getHashMap();

        User user = hashMap.get(accNo);
        user.setMoney(user.getMoney() - withdraw);
    }
}
