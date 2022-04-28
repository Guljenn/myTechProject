package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        /*
        Create a file called as students list.txt
        After creating put a wait for 5 seconds and delete it
         */

        File studentList = new File("studentList.txt");

        try {
            studentList.createNewFile();
            Thread.sleep(5000);
            // Write some information to file
            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor\n");
            fileWriter.close();  // saves the files

            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // studentList.delete();

            System.out.println("End of the program");
        }
    }
}
