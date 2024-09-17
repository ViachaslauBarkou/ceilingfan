package io.github.viachaslaubarkou.ceilingfan;

public class CeilingFanDemo {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        System.out.println(fan); // Fan is off. Direction: clockwise.

        fan.pullSpeedCord();
        System.out.println(fan); // Fan speed: 1. Direction: clockwise.

        fan.pullSpeedCord();
        fan.pullDirectionCord();
        System.out.println(fan); // Fan speed: 2. Direction: counter-clockwise.

        fan.pullSpeedCord();
        fan.pullSpeedCord();
        System.out.println(fan); // Fan is off. Direction: counter-clockwise.
    }
}
