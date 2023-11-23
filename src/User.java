import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String fullName;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private long money;

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

    public static User []  registration(User [] users, User user){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter full name: ");
            user.setFullName(scanner.nextLine());
            if (!user.getFullName().isEmpty()) break;
            else System.err.println("Write full name");
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
            else System.err.println("Write address");
        }
        while (true){
            System.out.print("Enter phone number: ");
            user.setPhoneNumber(scanner.nextLine());
            if (!user.getPhoneNumber().isEmpty()) break;
            else System.err.println("Write phone number");
        }
        while (true){
            System.out.print("Make payments to the account: $");
            long summ = new Scanner(System.in).nextLong();
            if (summ >= 200) {
                user.setMoney(summ);
                break;
            }
            else System.err.println("make a payment of more than 200");
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
