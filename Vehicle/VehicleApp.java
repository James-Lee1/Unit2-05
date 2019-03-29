/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program uses thevehicle class and makes two vehicles
 *
 ****************************************************************************/

import java.util.Scanner;

public class VehicleApp
{
    public static void main(String[] arg)
    {
        Scanner userInput = new Scanner(System.in);
        Vehicle garage[] = new Vehicle[2];

        // Makes two vehicles
        for (int i = 0; i < 2; i++)
        {
            String licensePlate;
            String color;
            int doors = 0;
            boolean isValidInput = false;

            // Asks for plate and color
            System.out.print("What is the license plate? : ");
            licensePlate = userInput.nextLine();

            System.out.print("What is its color? : ");
            color = userInput.nextLine();

            // Asks for number of doors
            while (isValidInput == false)
            {
                System.out.print("How many doors does it have? : ");
                try
                {
                    doors = Integer.parseInt(userInput.nextLine());
                    if (doors <= 0)
                    {
                        System.out.print("\nError : Invalid input!\n");
                        isValidInput = false;
                    }
                    else
                    {
                        isValidInput = true;
                    }
                }
                catch(NumberFormatException nfe)
                {
                    System.out.print("\nError : Invalid input!\n");
                }
            }

            // Creates car and puts in garage
            Vehicle car = new Vehicle(licensePlate, color, doors);
            garage[i] = car;

            // Asks to accelerate or brake
            while (true)
            {
                System.out.print("\n" + garage[i].toString());

                System.out.print("\nWhat would you like to do? (accelerate, brake, or exit) : ");
                String userChoice;
                userChoice = userInput.nextLine();

                if (userChoice.equals("accelerate"))
                {
                    System.out.print("\n" + car.accelerate());
                }
                else if (userChoice.equals("brake"))
                {
                    System.out.print("\n" + car.brake());
                }
                else if (userChoice.equals("exit"))
                {
                    break;
                }
                else
                {
                    System.out.print("\nInvalid option!");
                }
            }
            System.out.print("\n" + garage[i].toString() + "\n");
        }
        System.out.print("\nThere are " + garage.length + " cars in the garage. \n");

        // Allows user to view cars in garage
        while (true)
        {
            System.out.print("\nView a car (1,2) or exit : ");
            String userChoice;
            userChoice = userInput.nextLine();

            if (userChoice.equals("1"))
            {
                System.out.print("\nThe first car in the garage has these properties \n" + garage[0].toString());
            }
            else if (userChoice.equals("2"))
            {
                System.out.print("\nThe second car in the garage has these properties \n" + garage[1].toString());
            }
            else if (userChoice.equals("exit"))
            {
                break;
            }
            else
            {
                System.out.print("Error : Invalid input!");
            }
        }
    }
}
