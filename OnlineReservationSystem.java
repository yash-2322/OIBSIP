import java.util.Scanner;

public class OnlineReservationSystem 
{
    static String username = "station";
    static String password = "new123";

    static char classType;
    static char trainName;
    static String from;
    static String dateOfJourney;
    static String to;
    static int trainNum;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Login form
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n");

        System.out.println("`````````````  ONLINE RESRVATION SYSTEM  `````````````````");
        System.out.println("\n");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n");

        System.out.print("           Enter Username :");
        String inputUsername = sc.nextLine();

        System.out.print("           Enter Password :");
        String inputPassword = sc.nextLine();
        System.out.println("\n");

        if (inputUsername.equals(username) && inputPassword.equals(password)) 
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("          Login successfully...            ");
        } 
        else 
        {
            System.out.println("\n");
            System.out.println("```````````` Invalid login attempt credentials...  ````````````````` ");
            System.out.println("\n");

            return;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\n");
        System.out.println("Please fill the details for your reservation of train tickets:");
        System.out.println("\n");

        System.out.print("Enter the Train number: ");
        trainNum = sc.nextInt();

        System.out.println("\n");
        System.out.print("Enter the Train name: ");
        trainName = sc.next().charAt(0);

        System.out.println("\n");
        System.out.print("Provide your Class type: ");
        classType = sc.next().charAt(0);

        System.out.println("\n");
        System.out.print("Destination preference - From: ");
        from = sc.next();

        System.out.println("\n");
        System.out.print("Destination preference - To: ");
        to = sc.next();

        System.out.println("");
        System.out.print("Provide your Date of journey: ");
        dateOfJourney = sc.next();
        System.out.println("");

        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("            YOUR TICKET DETAILS                ");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("Train Number: " + trainNum);
        System.out.println("Train Name: " + trainName);
        System.out.println("Class Type: " + classType);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");

        
        System.out.println("Please Enter the PNR number to cancel your reservation: ");
        String pnrNum = sc.next();
        System.out.println("");
        System.out.println("Do you want to cancel this ticket (YES/Cancel): ");
        String confirmation = sc.next();

        if (confirmation.equalsIgnoreCase("YES")) 
        {
            System.out.println("");
            System.out.println("Your Reservation cancelled successfully...");
        } 
        else 
        {
            System.out.println("Your Reservation not cancelled...");
        }
        sc.close();
    }
}