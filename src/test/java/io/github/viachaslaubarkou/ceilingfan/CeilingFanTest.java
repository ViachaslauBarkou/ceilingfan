package io.github.viachaslaubarkou.ceilingfan;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the CeilingFan class.
 */
public class CeilingFanTest {

    /**
     * Tests the default state.
     */
    @Test
    public void testDefaultState() {
        CeilingFan fan = new CeilingFan();
        assertEquals(0, fan.getSpeed());
        assertTrue(fan.isClockwiseDirection());
    }

    /**
     * Tests pulling the speed cord.
     */
    @Test
    public void testPullSpeedCord() {
        CeilingFan fan = new CeilingFan();
        fan.pullSpeedCord();
        assertEquals(1, fan.getSpeed());
        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed());
        fan.pullSpeedCord();
        assertEquals(3, fan.getSpeed());
        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed());
    }

    /**
     * Tests pulling the direction cord.
     */
    @Test
    public void testPullDirectionCord() {
        CeilingFan fan = new CeilingFan();
        fan.pullDirectionCord();
        assertFalse(fan.isClockwiseDirection());
        fan.pullDirectionCord();
        assertTrue(fan.isClockwiseDirection());
    }

    /**
     * Tests that pulling speed and direction cords together.
     */
    @Test
    public void testSpeedAndDirection() {
        CeilingFan fan = new CeilingFan();
        fan.pullSpeedCord();
        fan.pullDirectionCord();
        assertEquals(1, fan.getSpeed());
        assertFalse(fan.isClockwiseDirection());

        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed());
        assertFalse(fan.isClockwiseDirection());

        fan.pullDirectionCord();
        assertTrue(fan.isClockwiseDirection());

        fan.pullSpeedCord();
        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed());
        assertTrue(fan.isClockwiseDirection());
    }

    /**
     * Tests the string representation state.
     */
    @Test
    public void testToString() {
        CeilingFan fan = new CeilingFan();
        assertEquals("Fan is off. Direction: clockwise.", fan.toString());
        fan.pullSpeedCord(); // Speed 1
        assertEquals("Fan speed: 1. Direction: clockwise.", fan.toString());
        fan.pullDirectionCord();
        assertEquals("Fan speed: 1. Direction: counter-clockwise.", fan.toString());
    }
}