import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        boolean nextStep = true;

        System.out.println("Create user?");
        User user = Create.creatUser();

        while (run) {
            while (nextStep) {
                System.out.println("Do you want to deposit/withdraw/delete/check account?");
                String response = sc.nextLine();

                if (response.equals("deposit")) {
                    Transcation.deposit(user.getAccNo());
                    System.out.println(user.toString());
                    nextStep = false;
                } else if (response.equals("withdraw")) {
                    Transcation.withdraw(user.getAccNo());
                    System.out.println(user.toString());
                    nextStep = false;
                } else if (response.equals("delete")) {
                    Create.deleteUser(user.getAccNo());
                    System.out.println("user is deleted!");
                    System.out.println(user.toString());
                    nextStep = false;

                } else if (response.equals("check")){
                    System.out.println(user.toString());
                    nextStep = false;

                } else {
                    System.out.println("Wrong input entered!");
                }
            }
            System.out.println("Do you want to end program? Y/else");
            String response = sc.nextLine();
            if (response.equals("Y")) {
                System.out.println("Good bye");
                run = false;
            } else {
                System.out.println("Okay processing keep going.");
                nextStep = true;
            }

        }


    }

}
