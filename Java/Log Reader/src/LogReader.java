import java.io.*;
import java.util.*;

public class LogReader {
    public static void main(String[] args) {

        ArrayList<String> errors = new ArrayList<>();

        try {
            Scanner sc =
                    new Scanner(new File("server.log"));

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                if (line.contains("ERROR")) {
                    errors.add(line);
                }
            }

            System.out.println(errors);
        }

        catch (Exception e) {
            System.out.println("File not found");
        }
    }
}