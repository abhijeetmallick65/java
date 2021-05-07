import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class complexDS {

    public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

    public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
            { "Pete", "Mary", "Bob" }, };

    public static void main(String[] args) {
        // map ds
        Map<String, Set<String>> personnel = new HashMap<>();

        // iterate over vehicles
        for (int i = 0; i < vehicles.length; i++) {
            // current vehicle for current idx
            String vehicle = vehicles[i];
            // current driver list for current idx
            String[] driversList = drivers[i];
            // initialize a new set (linked hash set)
            Set<String> driverSet = new LinkedHashSet<>();
            // add drivers to the set
            for (String j : driversList) {
                driverSet.add(j);
            }
            // add the vehicle and corresponding "set" of drivers to our map
            personnel.put(vehicle, driverSet);
        }

        {
            // Set<String> dlist = personnel.get("helicopter");
            // for (String d : dlist)
            // System.out.println(d);
        }

        // iterate over the map
        for (String vehicle : personnel.keySet()) {
            // get the vehicle
            System.out.print(vehicle);
            System.out.print(" : ");
            // get corresponding "set" of drivers to the vehicle
            Set<String> drivers = personnel.get(vehicle);
            // iterate through the set of drivers and print them
            for (String driver : drivers) {
                System.out.print(driver);
                System.out.print(" ");
            }
            // new line
            System.out.println();
        }
    }
}
