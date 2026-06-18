import java.io.*;

public class ConfigLoader {

    static void createDefaultConfig() {

        try {
            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("config.txt"));

            bw.write("username=admin");
            bw.newLine();
            bw.write("theme=light");

            bw.close();

            System.out.println("Default config created");
        }

        catch (IOException e) {
            System.out.println("Error creating file");
        }
    }

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("config.txt"));

            System.out.println("Config loaded");

            br.close();
        }

        catch (FileNotFoundException e) {
            createDefaultConfig();
        }

        catch (IOException e) {
            System.out.println("Error");
        }
    }
}