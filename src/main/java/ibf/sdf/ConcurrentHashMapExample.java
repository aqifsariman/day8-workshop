package ibf.sdf;

import java.io.Console;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void example() {
        Map<String, Integer> laptops = new ConcurrentHashMap<>();

        laptops.put("Acer".toLowerCase(), 5);
        laptops.put("Apple".toLowerCase(), 15);
        laptops.put("ASUS".toLowerCase(), 10);
        laptops.put("Dell".toLowerCase(), 20);
        laptops.put("Lenovo".toLowerCase(), 30);
        laptops.put("Huawei".toLowerCase(), 25);
        System.out.println("Total laptops: " + laptops.size());

        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }

        // ANOTHER TYPE OF ITERATOR
        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) laptops).elements();
        while (elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        String searchString = "";
        Console con = System.console();
        while (!searchString.equalsIgnoreCase("quit")) {
            searchString = con.readLine("Enter laptop model: ");
            if (laptops.containsKey(searchString.toLowerCase())) {
                System.out.println(searchString + " - " + laptops.get(searchString));
            } else {
                if (searchString.equalsIgnoreCase("quit")) {
                    System.out.println("Goodbye!");
                } else {

                    System.out.println("Laptop type not found.");
                }
            }
        }
        laptops.clear();
        System.out.println("The total type of laptops is " + laptops.size());
    }
}
