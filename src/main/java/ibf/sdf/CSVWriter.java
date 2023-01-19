package ibf.sdf;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary\n";

    public List<Employee> employees = null;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        // CREATE SOME EMPLOYEES
        Employee emp1 = new Employee("12345", "Aqif", "ISS", "Student", "aqif@gmail.com", 20000);
        Employee emp2 = new Employee("34567", "Vince", "ISS", "Student", "vince@gmail.com", 20000);
        Employee emp3 = new Employee("23456", "Siva", "ISS", "Student", "siva@gmail.com", 25000);

        // ADD EMPLOYEES TO THE LIST
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName);

        // WRITE FILE_HEADER TO CSV
        fw.append(FILE_HEADER.toString());

        // WRITE RECORDS TO ROW USING fw.append()
        for (Employee e : employees) {
            fw.append(e.toString());
        }
        fw.flush();
        fw.close();

    }
}
