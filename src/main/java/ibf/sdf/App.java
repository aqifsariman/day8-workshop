package ibf.sdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public final class App {
    public static void main(String[] args) throws IOException {

        // ArraySortExample array = new ArraySortExample();
        // array.example();
        // CollectionSortExample list = new CollectionSortExample();
        // list.example01();
        // list.example02();
        // HashMapExample map = new HashMapExample();
        // map.example();
        // ConcurrentHashMapExample conMap = new ConcurrentHashMapExample();
        // conMap.example();

        // LinkedListExample ll = new LinkedListExample();
        // ll.example();

        // StackExample stack = new StackExample();
        // stack.example();

        String dirPath = "./data-folder5";
        String fileName = "data.txt";

        // CRATE A DIRECTORY
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated)
            System.out.println("New Directory " + dirPath + " is created.");
        else
            System.out.println("Directory already exists.");

        // CREATE A FILE IN THE DIRECTORY CREATED ABOVE
        File newFile = new File(dirPath + File.separator + fileName);
        newFile.createNewFile();
        boolean isNewFileCreated = newFile.createNewFile();
        if (isNewFileCreated)
            System.out.println("New file " + fileName + " is created.");
        else
            System.out.println("File already exists.");

        // LIST FILES UNDER A DIRECTORY
        File[] fileList = newDir.listFiles();
        for (File f : fileList) {
            System.out.println("File " + f.getPath() + ": " + f.getCanonicalFile());
        }

        FileOutputStream fos = new FileOutputStream(newFile, true);
        for (int i = 0; i < 10; i++) {
            char[] str = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }

        String welcomeMessage = "Welcome to ISS TFIP Programme.";
        fos.close();

    }
}
