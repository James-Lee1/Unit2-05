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
    private int speed = 0;

    // Constructor
    public Airplane(int speed)
    {
        this.speed = speed;
    }

    // Set airplane speed
    protected void setSpeed(int _speed)
    {
        this.speed = _speed;
    }

    // Get plane speed
    protected int getSpeed()
    {
        return speed;
    }
}
