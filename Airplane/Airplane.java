/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This is the basic outline for class airplane (Lesson 1)
 *
 ****************************************************************************/

class Airplane
{
    // Airplane properties
    private int speed = 60;

    // Constructor
    public Airplane(int speed)
    {
        this.speed = speed;
    }

    // Set airplane speed
    protected String setSpeed(int _speed)
    {
        String update;
        this.speed = _speed;
        update = "Speed is " + speed;
        return update;
    }

    // Get plane speed
    protected String getSpeed()
    {
        String update = "Speed is " + speed;
        return update;
    }
}
