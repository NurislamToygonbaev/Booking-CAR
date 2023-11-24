import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanForNum = new Scanner(System.in);
        User[] users = new User[0];
        User user = null;
        Management management = new Management();
        boolean isTrue = true;
        while (isTrue){
            menu();
            try {
                switch (scanForNum.nextInt()){
                    case 1 -> {
                        users = User.registration(users, new User());
                        System.out.println("Account successfully Created");
                    }
                    case 2 -> {
                        if (users.length > 0){
                            user = User.login(users);
                            System.out.println("Log In completed successfully");
                            boolean isRunning = true;
                            while (isRunning){
                                management.menuInner();
                                int output = scanForNum.nextInt();
                                switch (output){
                                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> user.cars = management.booking(user, output);
                                    case 11 -> {
                                        System.out.println("MY RESERVED CARS");
                                        for (Cars car : user.cars) {
                                            System.out.println(car);
                                        }
                                    }
                                    case 0 -> {
                                        System.out.println("the program is completed");
                                        isRunning = false;
                                    }
                                }
                            }
                        }else System.err.println("Create account!");
                    }
                    case 3 -> isTrue = false;
                    default -> System.err.println("Enter right choice!");
                }
            } catch (Exception e){
                System.err.println("Invalid input. Please enter a valid integer.");
                scanForNum.nextLine();
            }
        }
    }

    private static void menu(){
        System.out.println("""
                1. REGISTRATION.
                2. ALREADY HAVE AN ACCOUNT, LOG IN.
                3. LOG OUT.
                
                """);
        System.out.print("ENTER THE COMMAND: ");
    }
}