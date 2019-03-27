/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This is the class vehicle which accepts a license plate, color and
 * number of doors
 *
 ****************************************************************************/

class Vehicle
{

    // Vehicle properties
    private String licensePlate;
    private String color;
    private int numOfDoors;
    private int speed = 60;
    private final int maxSpeed = 200;

    // Constructor
    public Vehicle(String licensePlate, String color, int numOfDoors)
    {
        this.licensePlate = licensePlate;
        this.color = color;
        this.numOfDoors = numOfDoors;
    }

    // When car is accelerating
    protected String accelerate()
    {
        String Accel = "Accelerating!!!!!!";
        if (speed >= maxSpeed)
        {
            Accel = "Can't go any faster!";
        }
        else
        {
            speed += 1;
        }
        return Accel;
    }

    // When car is braking
    protected String brake()
    {
        String Brake = "Braking";

        if (speed <= 0)
        {
            Brake = "Can't go any slower!";
        }
        else
        {
            speed = 0;
        }
        return Brake;
    }

    // Converts car into string
    public String toString()
    {
        String vehicle = "License plate is " + licensePlate + "\n"
                          + "Color is " + color + "\n"
                          + "Vehicle has " + numOfDoors + " number of doors" + "\n"
                          + "Its speed is " + speed + "km/h" + "\n"
                          + "Its max speed is " + maxSpeed + "km/h" + "\n";
        return vehicle;
    }
}
