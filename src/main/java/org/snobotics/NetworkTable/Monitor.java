package org.snobotics.NetworkTable;

/*
 * Monitor the NetworkTables activity, displaying active tables/data
 *
 */
public class Monitor {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new Monitor().getGreeting());
    }
}
