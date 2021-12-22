import java.util.HashMap;
import java.util.Scanner;

public class Create {
    public static User creatUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name and age (Format: name/age");
        String[] userInfo = sc.nextLine().split("/");

        User user = new User(userInfo);
        HashMap<Integer, User> hashMap = User.getHashMap();
        hashMap.put(user.getAccNo(), user);

        return user;
    }

    public static User deleteUser(int accNo) {
        HashMap<Integer, User> hashMap = User.getHashMap();
        User user = hashMap.remove(accNo);

        return user;
    }
}
