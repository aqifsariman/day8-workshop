package ibf.sdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortExample {
    public void example01() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            numbers.add((int) (Math.random() * 100));

        System.out.println("Unsorted List: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted Reverse List: " + numbers);

    }

    public void example02() {
        Employee emp1 = new Employee("12345", "Aqif", "ISS", "Student", "aqif@gmail.com", 20000);
        Employee emp2 = new Employee("34567", "Vince", "ISS", "Student", "vince@gmail.com", 20000);
        Employee emp3 = new Employee("23456", "Siva", "ISS", "Student", "siva@gmail.com", 25000);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Unsorted Employees: " + employees);

        Collections.sort(employees);

        System.out.println("Sorted Employees: " + employees);

        employees.sort(Comparator.comparing(e -> e.getSalary()));

        System.out.println("Sorted Employees by Salary: " + employees);

        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("Aqif"))
                .collect((Collectors.toList()));

        System.out.println("Filtered Employees: " + filteredEmployees);

    }

}
