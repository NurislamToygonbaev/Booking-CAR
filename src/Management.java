import java.util.Arrays;
import java.util.Scanner;

public class Management {


    Cars bmw = new Cars("BMW", "M5", 1500, Driver.URMAT, true, 1);
    Cars mers = new Cars("MERS", "W210", 1000, Driver.NURLAN, true, 2);
    Cars subaru = new Cars("SUBARU", "LEGACY B5", 900, Driver.NURKAMIL, true, 3);
    Cars toyota = new Cars("TOYOTA", "CAMRY", 700, Driver.NURISLAM, true, 4);
    Cars honda = new Cars("HONDA", "ACCORD", 600, Driver.URMAT, true, 5);
    Cars hyundai = new Cars("HYUNDAI", "SONATA", 800, Driver.AJYBEK, true, 6);
    Cars hondaFit = new Cars("HONDA", "FIT", 300, Driver.NURGAZY, true, 7);
    Cars lexus = new Cars("LEXUS", "570", 800, Driver.NURTAAZIM, true, 8);
    Cars ferrari = new Cars("FERRARI", "ROMA", 1100, Driver.MIRLAN, true, 9);
    Cars porsche = new Cars("PORSCHE", "CAYENNE", 800, Driver.ELDIYAR, true, 10);

    Cars[] cars = new Cars[]{bmw, mers, subaru, toyota, honda, hyundai, hondaFit, lexus, ferrari, porsche};


    public void booking(User user1, int scanId) {
        for (Cars car : cars) {
            if (car.getId() == scanId) {
                if (!car.isBooking()) {
                    System.out.println("The car is booked");
                } else {
                    System.out.println("Make a payment for the car:" + " $" + car.getPrice());
                    if (user1.getMoney() >= car.getPrice()) {
                        car.setBooking(false);
                        long newBalance = (user1.getMoney() - ((long) car.getPrice()));
                        user1.setMoney(newBalance);
                        System.out.println("you have successfully made the payment. remaining balance: " + " $" + user1.getMoney());
                        System.out.println("you have successfully booked a car. she is at your service!!!");
                    } else {
                        Bank.leon(user1);
                    }
                }
            }
        }
    }

    public void menuInner() {
        System.out.println(STR. """
                AVAILABLE CARS
                1.  \{ bmw }
                2.  \{ mers }
                3.  \{ subaru }
                4.  \{ toyota }
                5.  \{ honda }
                6.  \{ hyundai }
                7.  \{ hondaFit }
                8.  \{ lexus }
                9.  \{ ferrari }
                10. \{ porsche }

                """ );
        System.out.print("YOUR CHOICE: (0 to the exit): ");
    }


    @Override
    public String toString() {
        return "Management{" +
                "bmw = " + bmw +
                " mers = " + mers +
                " subaru = " + subaru +
                " toyota = " + toyota +
                " honda = " + honda +
                " hyundai = " + hyundai +
                " hondaFit = " + hondaFit +
                " lexus = " + lexus +
                " ferrari = " + ferrari +
                " porsche = " + porsche +
                " cars = " + Arrays.toString(cars) +
                '}';
    }
}
