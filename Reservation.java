package TajHotel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Reservation 
{
    Room room;
    int numberOfDays;
    LocalDateTime accessTime;
    boolean isPaid;
    String paymentMethod;
    Customer customer;

    public Reservation(Room room, int numberOfDays, Customer customer) 
    {
        this.room = room;
        this.numberOfDays = numberOfDays;
        this.customer = customer;
        this.accessTime = LocalDateTime.now();
        this.isPaid = false;
    }

    int getTotalCost() 
    {
        return room.costPerDay * numberOfDays;
    }

    String getAccessTimeFormatted() 
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return accessTime.format(formatter);
    }

    void makePayment(String paymentMethod) 
    {
        // Simulating different payment options
        this.paymentMethod = paymentMethod;
        System.out.println("Payment successful with " + paymentMethod + "! Thank you for your payment.");
        isPaid = true;
    }

    @Override
    public String toString() 
    {
        return "Room Type: " + room.type +
                "\nCost per Day: $" + room.costPerDay +
                "\nNumber of Days: " + numberOfDays +
                "\nAccess Time: " + getAccessTimeFormatted() +
                "\nTotal Cost: $" + getTotalCost() +
                "\nUser Name: " + customer.name +
                "\nPhone Number: " + customer.phoneNumber +
                "\nUser Age: " + customer.age +
                "\nPAN Number: " + customer.panNumber;
    }
}
