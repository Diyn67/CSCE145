
// Author: Catherine Phillips

import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ShipNavigator!!!");

        while (true) {
            System.out.println("Enter the name of the ship:");
            String name = scanner.nextLine();

            System.out.println("Enter its launch date (mm/dd/yyyy):");
            String launchDate = scanner.nextLine();

            System.out.println("Is it a cruise ship or a cargo ship?");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("Cruise ship")) {
                System.out.println("Enter the ship's passenger capacity:");
                int passengerCapacity = scanner.nextInt();

                System.out.println("How many crew members are on this ship?");
                int crewCount = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crewCount);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);
            } else if (type.equalsIgnoreCase("Cargo ship")) {
                System.out.println("Enter the ship's tonnage (DWT):");
                double tonnage = scanner.nextDouble();

                System.out.println("Enter the maximum speed of the ship (in mph):");
                double maxSpeed = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);
            } else {
                System.out.println("Invalid ship type. Please try again.");
            }

            System.out.println("Do you want to construct another ship object? Enter yes or no:");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
