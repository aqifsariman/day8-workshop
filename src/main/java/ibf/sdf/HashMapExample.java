package ibf.sdf;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public void example() {
        Map<String, Integer> phones = new HashMap<>();
        phones.put("iPhone".toLowerCase(), 6);
        phones.put("Samsung".toLowerCase(), 2);
        phones.put("Oppo".toLowerCase(), 5);
        phones.put("Huawei".toLowerCase(), 3);
        phones.put("Blackberry".toLowerCase(), 1);
        phones.put("Xiaomi".toLowerCase(), 4);

        System.out.println("The total type of phones is " + phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
        }

        String searchString = "";
        Console con = System.console();
        while (!searchString.equalsIgnoreCase("quit")) {
            searchString = con.readLine("Enter phone type: ");
            if (phones.containsKey(searchString.toLowerCase())) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else {
                if (searchString.equalsIgnoreCase("quit")) {
                    System.out.println("Goodbye!");
                } else {

                    System.out.println("Phone type not found.");
                }
            }
        }
        phones.clear();
        System.out.println("The total type of phones is " + phones.size());

    }
}
