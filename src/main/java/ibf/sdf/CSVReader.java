package ibf.sdf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSVReader {
    public static List<Employee> reader(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        List<String> tempList = new LinkedList<>();
        List<Employee> employeeList = new LinkedList<>();

        while (null != (line = br.readLine())) {
            tempList.add(line);
            for (int i = 1; i < tempList.size(); i++) {
                String[] splitArray = line.split(",");
                Employee newEmployee = new Employee(splitArray[0], splitArray[1], splitArray[2], splitArray[3],
                        splitArray[4], Integer.parseInt(splitArray[5]));
                employeeList.add(newEmployee);
            }
        }

        fr.close();
        return employeeList;
    }
}
