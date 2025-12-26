package assignemnt3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Your Flight 1-for AirIndia | 2- for KingFisher | 3-for Indigo");
        int choice = sc.nextInt();
        System.out.println("Enter Your Hour of journey");
        int hours = sc.nextInt();
        System.out.println("Enter Your Cost/hr :");
        double costPerHour = sc.nextDouble();

        Airfare airfare = null;

        if (choice == 1) {
            airfare = new AirIndia(hours, costPerHour);
        } else if (choice == 2) {
            airfare = new KingFisher(hours, costPerHour);
        } else if (choice == 3) {
            airfare = new Indigo(hours, costPerHour);
        }

        double amount = airfare.calculateAmount();

        // Round to 2 decimal places
        System.out.printf("%.2f", amount);

        sc.close();
    }
}
