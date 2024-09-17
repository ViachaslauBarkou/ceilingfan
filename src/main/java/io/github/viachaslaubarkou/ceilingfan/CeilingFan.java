package io.github.viachaslaubarkou.ceilingfan;

/**
 *  Implementation of simple ceiling fan with 2 pull cords to control speed and direction.
 */
public class CeilingFan {
    private int speed; // from 0 to 3
    private boolean isClockwiseDirection; // true if direction is clockwise, false if counter-clockwise

    /**
     * Creates a new CeilingFan with initial speed 0 and default direction (clockwise).
     */
    public CeilingFan() {
        this.speed = 0;
        this.isClockwiseDirection = true;
    }

    /**
     * Pulls the speed cord, increasing the speed by one. If speed is at 3, resets to 0.
     */
    public void pullSpeedCord() {
        speed = (speed != 3) ? ++speed : 0;
    }

    /**
     * Pulls the direction cord, reversing the direction of the fan.
     */
    public void pullDirectionCord() {
        isClockwiseDirection = !isClockwiseDirection;
    }

    /**
     * Returns the current speed setting of the fan.
     *
     * @return the speed from 0 for off to 1-3 for levels
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Returns the current direction of the fan.
     *
     * @return true if the fan is spinning clockwise, false if counter-clockwise
     */
    public boolean isClockwiseDirection() {
        return isClockwiseDirection;
    }

    /**
     * Returns a string representation of the fan's current state.
     *
     * @return a string indicating the speed and direction of the fan
     */
    @Override
    public String toString() {
        String direction = isClockwiseDirection ? "clockwise" : "counter-clockwise";
        if (speed == 0) {
            return "Fan is off. Direction: " + direction + ".";
        } else {
            return "Fan speed: " + speed + ". Direction: " + direction + ".";
        }
    }
}
