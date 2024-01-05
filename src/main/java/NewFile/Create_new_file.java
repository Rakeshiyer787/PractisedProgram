package NewFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create_new_file {
    public static void main(String[] args) throws IOException {

    String fileName = "myfile.txt";

    Path filePath = Paths.get(System.getProperty("user.dir"), "Students");

    Files.createFile(filePath);

    System.out.println("File created at: " + filePath.toString());
}

}
