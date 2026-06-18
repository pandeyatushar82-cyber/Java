import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PayrollSystem {

    public static void main(String[] args) {

        ArrayList<Employee> staff =
                new ArrayList<>();

        staff.add(
                new FullTime("Ram", 50000));

        staff.add(
                new Contractor("Hari",
                        40,
                        500));

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    "payroll_report.txt"));

            for (Employee e : staff) {

                String data =
                        e.name +
                                " - Rs. " +
                                e.calculatePay();

                bw.write(data);
                bw.newLine();

                System.out.println(data);
            }

            bw.close();

            System.out.println("Payroll report saved.");
        }

        catch (IOException e) {
            System.out.println("File Error");
        }
    }
}