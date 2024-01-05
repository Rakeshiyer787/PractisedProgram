package NewFile;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Add_new_file {
    public static void main(String[] args) throws IOException {
        String fileName = "Students";
        String name = "John Doe";

        FileWriter writer = new FileWriter(fileName, true);
        writer.write("Name: " + name + "\n");
        writer.close();

        System.out.println("Successfully added name to file.");
    }

}


