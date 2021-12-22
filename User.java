import java.io.Serializable;
import java.util.HashMap;

public class User implements Serializable {
    private String name;
    private int age;
    private int accNo;
    private static int numUsers = 0;
    private double money;
    private static HashMap<Integer, User> hashMap = new HashMap<>();

    public User() {
        name = "unknown";
        age = -1;
        accNo = numUsers;
        numUsers++;
        money = 0;
    }

    public User(String[] userInfo) throws NumberFormatException {
        name = userInfo[0];
        age = Integer.parseInt(userInfo[1]);
        accNo = numUsers;
        numUsers++;
        money = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getAccNo() {
        return accNo;
    }

    public static HashMap<Integer, User> getHashMap() {
        return hashMap;
    }

    @Override
    public String toString() {
        User user = hashMap.get(accNo);


        return "User{" +
                "name='" + user.name + '\'' +
                ", age=" + user.age +
                ", accNo=" + user.accNo +
                ", money=" + user.money +
                '}';
    }
}
