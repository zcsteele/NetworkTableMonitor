package org.snobotics.NetworkTable;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

/*
 * Monitor the NetworkTables activity, displaying active tables/data
 *
 */
public class Monitor {
    public String getGreeting() {
        return "Hello world.";
    }

    public static NetworkTableInstance testStatic =
        NetworkTableInstance.getDefault();

    public static void main(String[] args) {
        System.loadLibrary("ntcore");
        NetworkTableInstance netTable =
              NetworkTableInstance.getDefault();
//        testStatic.startServer();
        netTable.startServer();
        System.out.println(new Monitor().getGreeting());
    }
}
