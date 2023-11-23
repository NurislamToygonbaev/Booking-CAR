public class Cars {
    private String name;
    private String brand;
    private double price;
    private Driver driver;
    private boolean isBooking;
    private int id;

    public Cars() {
    }

    public Cars(String name, String brand, double price, Driver driver, boolean isBooking, int id) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.driver = driver;
        this.isBooking = isBooking;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean isBooking() {
        return isBooking;
    }

    public void setBooking(boolean booking) {
        isBooking = booking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  name +" - "+" PRICE: $" + price ;
    }
}
