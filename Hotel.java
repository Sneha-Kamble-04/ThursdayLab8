package TajHotel;
/*Q1)"Taj Hotel" given the 5- list of Room types, cost per day Room types 
cost per day luxury 2500 a/c 2000 non a/c 1500 deluxe
do the hotel reservation process.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel 
{
    private static List<Room> rooms = new ArrayList<>();

    static 
    {
        rooms.add(new Room("Luxury", 2500));
        rooms.add(new Room("A/C", 2000));
        rooms.add(new Room("Non A/C", 1500));
        rooms.add(new Room("Deluxe", 1000));
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<Reservation> reservations = new ArrayList<>();

        // Main loop for hotel reservation system
        while (true)
        {
            // Display room types and costs
            displayRoomTypes();

            // Get user input for room type
            int selectedRoomIndex = getSelectedRoomIndex(scanner);
            if (selectedRoomIndex == 0)
            {
                break;
            }

            // Validate user input
            if (selectedRoomIndex < 1 || selectedRoomIndex > rooms.size()) 
            {
                System.out.println("Invalid room type selection. Please try again.");
                continue;
            }

            // Get number of days for reservation
            int numberOfDays = getNumberOfDays(scanner);

            // Consume newline character
            scanner.nextLine();

            // Get user information
            Customer customer = getCustomerInformation(scanner);

            // Create reservation object and add to the list
            Reservation reservation = new Reservation(rooms.get(selectedRoomIndex - 1), numberOfDays, customer);
            reservations.add(reservation);

            // Display reservation details
            displayReservationDetails(reservation);

            // Ask if the customer wants to make more reservations
            if (!wantToMakeMoreReservations(scanner)) 
            {
                break;
            }
        }

        // Payment section
        paymentSection(reservations, scanner);

        // Close scanner
        scanner.close();
    }

    private static void displayRoomTypes() 
    {
        System.out.println("Welcome to Taj Hotel ");
        System.out.println("\nAvailable Room Types:");
        for (int i = 0; i < rooms.size(); i++) 
        {
            System.out.println((i + 1) + ". " + rooms.get(i));
        }
    }

    private static int getSelectedRoomIndex(Scanner scanner)
    {
        System.out.print("\nEnter the number corresponding to the desired room type (0 to exit): ");
        return scanner.nextInt();
    }

    private static int getNumberOfDays(Scanner scanner) 
    {
        System.out.print("Enter the number of days for reservation: ");
        return scanner.nextInt();
    }

    private static Customer getCustomerInformation(Scanner scanner) 
    {
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Adhar ID number: ");
        String adhar = scanner.next().trim();

        return new Customer(name, phoneNumber, age, adhar);
    }

    private static void displayReservationDetails(Reservation reservation) 
    {
        System.out.println("\nReservation added successfully!");
        System.out.println(reservation);
    }

    private static boolean wantToMakeMoreReservations(Scanner scanner) 
    {
        System.out.print("\nDo you want to make more reservations? (yes/no): ");
        String moreReservationsChoice = scanner.next().toLowerCase();
        return moreReservationsChoice.equals("yes");
    }

    private static void paymentSection(List<Reservation> reservations, Scanner scanner) 
    {
        if (!reservations.isEmpty()) 
        {

            // Display reservation details
            displayReservationDetails(reservations.get(0));

            // Payment options
            System.out.println("\nPayment Options:");
            System.out.println("1. GPay");
            System.out.println("2. PhonePe");
            System.out.println("3. Credit/Debit Card");
            System.out.println("4. Cash");

            System.out.print("Select a payment option (1-4): ");
            int paymentOption = scanner.nextInt();

            switch (paymentOption) {
                case 1:
                    for (Reservation reservation : reservations) 
                    {
                        reservation.makePayment("GPay");
                    }
                    break;
                case 2:
                    for (Reservation reservation : reservations)
                    {
                        reservation.makePayment("PhonePe");
                    }
                    break;
                case 3:
                    for (Reservation reservation : reservations) 
                    {
                        reservation.makePayment("Credit/Debit Card");
                    }
                    break;
                case 4:
                    for (Reservation reservation : reservations) 
                    {
                        reservation.makePayment("Cash");
                    }
                    break;
                default:
                    System.out.println("Invalid payment option. Payment not processed.");
            }

            // Display summary and generate receipt
            System.out.println("\nReservation Summary:");
            int totalCost = 0;

            for (Reservation reservation : reservations) 
            {
                System.out.println(reservation);
                System.out.println("Payment Method: " + (reservation.isPaid ? reservation.paymentMethod : "Pending"));
                System.out.println("---------------------------------------------------------");
                totalCost += reservation.getTotalCost();
            }

            System.out.println("\nTotal Cost for all reservations: $" + totalCost);
            System.out.println("---------------------------------------------------------");
            System.out.println("Thank you for choosing Taj Hotel!");
        } 
        else 
        {
            System.out.println("No reservations were made. Goodbye!");
        }
    }
}
