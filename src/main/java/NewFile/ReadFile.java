package NewFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class ReadFile {
        public static void main(String[] args) {
            String fileName = "Students";

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String name;
                while ((name = br.readLine()) != null) {
                    System.out.println("Name: " + name);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



