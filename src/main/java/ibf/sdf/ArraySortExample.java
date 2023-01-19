package ibf.sdf;

import java.util.Arrays;

public class ArraySortExample {

    public void example() {
        String[] name = { "darryl", " elaine", "james", "zoanne", "chris", "mark", "sophia", "asher", "brandon",
                "helen", "daniel", "marcus" };
        Arrays.sort(name);
        System.out.printf("Sorted Array: %s\n", Arrays.toString(name));

        Integer numbers[] = { 10, 5, 1, 2, 4, 3, 6, 7, 9, 8 };
        Arrays.sort(numbers);

        // Arrays.sort(name, Collections.reverseOrder());
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (start == end) {
                return;
            }
            
            int temp = numbers[start]; 
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.printf("Reversed Array: %s\n", Arrays.toString(numbers));
        // System.out.printf("Reverssed Array: %s\n", Arrays.toString(name));
    }
}


// 5 1 4 2 3 

// 1 4 2 3 5

// 1 2 3 4 5
