import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    public static void leon(User user1){
        Scanner scanner = new Scanner(System.in);
        System.out.println("unfortunately, there is not enough money in your account");
        System.out.println("payment failed, there are not enough funds in the account");
        try {
            System.out.print("do you want to take out a loan (yes/no)? ");
            String leon = scanner.nextLine();
            if (leon.equalsIgnoreCase("yes")) {
                System.out.print("deposit amount: $");
                long amount = scanner.nextLong();
                amount += user1.getMoney();
                user1.setMoney(amount);
                System.out.println("you have successfully deposited money to the bank account, current balance $" + user1.getMoney());
            } else {
                System.out.println("Return to the main menu...");
            }
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine();
        }
    }
}
