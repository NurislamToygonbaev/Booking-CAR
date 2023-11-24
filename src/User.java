import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    private String fullName;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private long money;
    protected Cars[] cars = new Cars[0];

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        this.cars = cars;
    }

    public static User[] registration(User[] users, User user){
        Scanner scanner = new Scanner(System.in);
        Scanner scanFOrNum = new Scanner(System.in);
        while (true){
            System.out.print("Enter full name: ");
            user.setFullName(scanner.nextLine());
            if (!user.getFullName().isEmpty()) break;
            else System.err.println("Full name cannot be empty. Please try again.");
        }
        while (true){
            System.out.print("Enter E-Mail: ");
            user.setEmail(scanner.nextLine());
            if (user.getEmail().endsWith("@gmail.com")) break;
             else System.err.println("Incorrect email. Please use the domain @gmail.com");
        }
        while (true){
            System.out.print("Enter password: ");
            user.setPassword(scanner.nextLine());
            if (user.getPassword().length() > 3) break;
            else System.err.print("Enter password more 4 symbol");
        }
        while (true){
            System.out.print("Enter Address: ");
            user.setAddress(scanner.nextLine());
            if (!user.getAddress().isEmpty()) break;
            else System.err.println("Address cannot be empty. Please try again.");
        }
        while (true){
            System.out.print("Enter phone number: ");
            user.setPhoneNumber(scanner.nextLine());
            if (user.getPhoneNumber().startsWith("+996") && user.getPhoneNumber().length() == 13) break;
            else System.err.println("The phone number must start with +996 and consist of 13 digits");
        }
        while (true){
            try {
                System.out.print("Make payments to the account: $");
                user.setMoney(scanFOrNum.nextLong());
                if (user.getMoney() >= 500) break;
                else System.err.println("make a payment of more than 500");
            } catch (InputMismatchException e){
                System.err.println("Invalid input. Please enter a valid integer.");
                scanFOrNum.nextLine();
            }
        }
        users = Arrays.copyOf(users, users.length +1);
        users[users.length - 1] = user;
        return users;
    }


    public static User login(User[] users) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("enter your email: ");
            String login = scanner.nextLine();
            System.out.print("enter your password: ");
            String pass = scanner.nextLine();
        for (User user : users) {
            if (user.getEmail().equals(login) && user.getPassword().equals(pass)) {
                return user;
            }
        }
        System.err.println("Re-write the email and password correct! ");
        return login(users);
    }
}
