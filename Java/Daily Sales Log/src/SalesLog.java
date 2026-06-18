import java.io.*;

public class SalesLog {
    public static void main(String[] args) {

        double[] sales = {
                1000, 1200, 900, 1500,
                1800, 1600, 1400
        };

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter("weekly_sales.txt"))) {

            for (double s : sales) {
                bw.write(String.valueOf(s));
                bw.newLine();
            }

            System.out.println("Data saved.");
        }

        catch (IOException e) {
            System.out.println("Error");
        }
    }
}